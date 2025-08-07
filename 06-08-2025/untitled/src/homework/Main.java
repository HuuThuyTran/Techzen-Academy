package homework;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static TaskManager<Task> taskManager = new TaskManager<>();

    private static void showMenu(String type) {
        System.out.println("===== MENU CỦA " + type + " =====");
        System.out.println("1. Thêm công việc");
        System.out.println("2. Xem công việc");
        System.out.println("3. Xóa công việc");
        System.out.println("4. Kiểm tra danh sách công việc có rỗng");

        if (type.equalsIgnoreCase("stack")) {
            System.out.println("5. Khôi phục công việc");
        } else if (type.equalsIgnoreCase("queue")) {
            System.out.println("5. Tìm công việc có độ ưu tiên cao nhất");
        }

        System.out.println("6. Quay lại menu chính");
    }

    private static void handleChoice(int choice) {
        if (choice == 1) {
            while (true) {
                showMenu("STACK");
                System.out.print("-> Nhập lựa chọn mới: ");
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1 -> {
                        Task newTask = createTask();
                        if (newTask != null) {
                            taskManager.pushToStack(newTask);
                        }
                    }
                    case 2 -> {
                        Task topTask = taskManager.peekStack();
                        if (topTask != null) {
                            System.out.println("Task trên đầu Stack: " + topTask);
                        }
                    }
                    case 3 -> taskManager.popFromStack();
                    case 4 -> System.out.println("Stack " + (taskManager.isStackEmpty() ? "rỗng" : "không rỗng"));
                    case 5 -> System.out.println("Task được khôi phục: " + taskManager.redoTask());
                    case 6 -> {
                        System.out.println("-> Đã quay lại menu chính <-");
                        return;
                    }
                }
            }
        }
        if (choice == 2) {
            while (true) {
                showMenu("QUEUE");
                System.out.print("-> Nhập lựa chọn mới: ");
                int select = Integer.parseInt(sc.nextLine());
                switch (select) {
                    case 1 -> {
                        Task newQueue = createTask();
                        if (newQueue != null) {
                            taskManager.addToQueue(newQueue);
                        }
                    }
                    case 2 -> {
                        Task topTask = taskManager.peekQueue();
                        if (topTask != null) {
                            System.out.println("Task trên đầu Queue: " + topTask);
                        }
                    }
                    case 3 -> taskManager.pollFromQueue();
                    case 4 -> System.out.println("Queue " + (taskManager.isStackEmpty() ? "rỗng" : "không rỗng"));
                    case 5 ->
                            System.out.println("Task có độ ưu tiên cao nhất: " + taskManager.findTaskHighestPriority());
                    case 6 -> {
                        System.out.println("-> Đã quay lại menu chính <-");
                        return;
                    }
                }
            }
        }

    }

    private static Task createTask() {
        try {
            System.out.println("--- NHẬP THÔNG TIN TASK MỚI ---");

            System.out.print("Tên task: ");
            String name = sc.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Tên task không được để trống!");
                return null;
            }

            int priority = getIntInput();
            if (priority < 1) {
                System.out.println("Priority phải >= 1. Đặt mặc định là 5.");
                priority = 5;
            }

            Task task = new Task(name, priority);
            System.out.println("Đã tạo task thành công: " + task);
            return task;
        } catch (Exception e) {
            System.out.println("Lỗi khi tạo task: " + e.getMessage());
            return null;
        }
    }

    private static int getIntInput() {
        while (true) {
            try {
                System.out.print("Priority (1=cao nhất, số càng nhỏ càng ưu tiên): ");
                String input = sc.nextLine().trim();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số nguyên hợp lệ!");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("====== CHƯƠNG TRÌNH QUẢN LÝ CÔNG VIỆC ======");
        while (true) {
            System.out.println("===== MỜI BẠN LỰA CHỌN DẠNG STACK/QUEUE =====");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. End");
            System.out.print("-> Nhập lựa chọn của bạn: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1 -> handleChoice(1);
                    case 2 -> handleChoice(2);
                    case 3 -> {
                        System.err.println("Kết thúc chương trình!");
                        return;
                    }
                    default -> System.out.println("Bạn đã nhập sai, vui lòng nhập lại!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập số, bạn hãy nhập lại!");
            }
        }
    }
}
