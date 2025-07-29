package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerPersonnel {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Personnel> personnelList = new ArrayList<>();
    static int choice;

    public static void displayMenu() {
        System.out.println("===== HỆ THỐNG QUẢN LÝ NHÂN SỰ =====");
        System.out.println("1. Thêm nhân sự");
        System.out.println("2. Hiển thị danh sách tất cả nhân sự");
        System.out.println("3. Tìm nhân sự theo tên");
        System.out.println("4. Hiển thị tổng số nhân sự");
        System.out.println("5. Tìm nhân sự có số giờ làm việc nhiều nhất");
        System.out.println("6. Liệt kê các nhân sự có số giờ làm việc dưới 20 giờ / tháng");
        System.out.println("7. Hiển thị lương của từng nhân sự (Chỉ hiển thị: tên và lương)");
        System.out.println("8. Thoát chương trình");
        System.out.print("Nhập lựa chọn của bạn (1-8): ");
        choice = sc.nextInt();
    }

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            switch (choice) {
                case 1 -> addPersonnel();
                case 2 -> displayAllPersonnel();
                case 3 -> findPersonnelByName();
                case 4 -> displayTotalPersonnel();
                case 5 -> findPersonnelWithMostWorkingHours();
                case 6 -> listPersonnelWithLessThan20Hours();
                case 7 -> displaySalaries();
                case 8 -> {
                    System.out.println("Chương trình kết thúc!");
                    return;
                }
                default -> System.out.println("Bạn đã nhập sai, hãy nhập lại!");
            }
        }
    }

    // 1. Hàm thêm nhân sự
    public static void addPersonnel() {
        System.out.println("Chọn loại nhân sự:");
        System.out.println("1. Giảng viên");
        System.out.println("2. Trợ giảng");
        System.out.print("Nhập lựa chọn của bạn (1-2): ");
        int choice = sc.nextInt();
        sc.nextLine(); // Clear the newline character


        Personnel personnel;
        if (choice == 1) {
            System.out.print("Nhập tên giảng viên: ");
            String name = sc.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = sc.nextInt();
            System.out.print("Nhập số giờ làm việc: ");
            int numberOfWorkingHours = sc.nextInt();
            System.out.print("Nhập số lượng nhân sự: ");
            int numberOfEmployees = sc.nextInt();
            sc.nextLine(); // Clear the newline character
            System.out.print("Nhập môn giảng dạy: ");
            String subjectTeaching = sc.nextLine();

            personnel = new Teacher(name, age, numberOfWorkingHours, numberOfEmployees, subjectTeaching);
        } else if (choice == 2) {
            System.out.print("Nhập tên trợ giảng: ");
            String name = sc.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = sc.nextInt();
            System.out.print("Nhập số giờ làm việc: ");
            int numberOfWorkingHours = sc.nextInt();
            System.out.print("Nhập số lượng nhân sự: ");
            int numberOfEmployees = sc.nextInt();
            sc.nextLine(); // Clear the newline character
            System.out.print("Nhập bộ môn phụ trách: ");
            String subjectInCharge = sc.nextLine();

            personnel = new TeachingAssistants(name, age, numberOfWorkingHours, numberOfEmployees, subjectInCharge);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
            return;
        }

        // Thêm nhân sự vào danh sách
        personnelList.add(personnel);
        System.out.println("Thêm nhân sự thành công!");
    }

    // 2. Hàm hiển thị danh sách tất cả nhân sự
    public static void displayAllPersonnel() {
        if (personnelList.isEmpty()) {
            System.out.println("Danh sách nhân sự trống!");
            return;
        }
        for (Personnel personnel : personnelList) {
            personnel.displayInfo();
            System.out.println("-----------------------------");
        }
    }

    // 3. Hàm tìm nhân sự theo tên
    public static void findPersonnelByName() {
        sc.nextLine();
        System.out.print("Nhập tên nhân sự cần tìm: ");
        String name = sc.nextLine().trim();

        boolean found = false;
        for (Personnel personnel : personnelList) {
            if (personnel.getName().equalsIgnoreCase(name)) {
                System.out.println("-> Tìm thấy được tên!");
                personnel.displayInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy nhân sự với tên: " + name);
        }
    }

    // 4. Hàm hiển thị tổng số nhân sự
    public static void displayTotalPersonnel() {
        System.out.println("Tổng số nhân sự: " + personnelList.size());
    }

    // 5. Hàm tìm nhân sự có số giờ làm việc nhiều nhất
    public static void findPersonnelWithMostWorkingHours() {
        if (personnelList.isEmpty()) {
            System.out.println("Danh sách nhân sự trống!");
            return;
        }

        Personnel maxPersonnel = personnelList.get(0);
        for (Personnel personnel : personnelList) {
            if (personnel.getNumberOfWorkingHours() > maxPersonnel.getNumberOfWorkingHours()) {
                maxPersonnel = personnel;
            }
        }

        System.out.println("Nhân sự có số giờ làm việc nhiều nhất: " + maxPersonnel.getName() + " (" + maxPersonnel.getNumberOfWorkingHours() + "h)");
    }

    // 6. Hàm liệt kê các nhân sự có số giờ làm việc dưới 20 giờ / tháng
    public static void listPersonnelWithLessThan20Hours() {
        if (personnelList.isEmpty()) {
            System.out.println("Danh sách nhân sự trống!");
            return;
        }
        ArrayList<String> listPersonnelLessThan20Hours = new ArrayList<>();

        for (Personnel personnel : personnelList) {
            if (personnel.getNumberOfWorkingHours() < 20) {
                String name = personnel.getName();
                int hours = personnel.getNumberOfWorkingHours();
                listPersonnelLessThan20Hours.add(name + " (" + hours + "h)");
            }
        }
        if (listPersonnelLessThan20Hours.isEmpty()) {
            System.out.println("Không có nhân sự nào có số giờ làm việc dưới 20 giờ.");
        } else {
            System.out.println("Danh sách tên các nhân sự có số giờ làm việc dưới 20 giờ:");
            for (String infoPersonnel : listPersonnelLessThan20Hours) {
                System.out.println("+ " + infoPersonnel);
            }
        }
    }

    // 7. Hàm hiển thị lương của từng nhân sự (Chỉ hiển thị: tên và lương)
    public static void displaySalaries() {
        if (personnelList.isEmpty()) {
            System.out.println("Danh sách nhân sự trống!");
            return;
        }

        System.out.println("===== Lương của từng nhân sự =====");
        for (Personnel personnel : personnelList) {
            String salaryPersonnel = "";
            if (personnel instanceof Teacher) {
                salaryPersonnel = ((Teacher) personnel).calculateSalaryOfTeacher();
            } else if (personnel instanceof TeachingAssistants) {
                salaryPersonnel = ((TeachingAssistants) personnel).calculateSalaryOfTeachingAssistants();
            }
            System.out.println("Họ tên: " + personnel.getName() + ", Lương: " + salaryPersonnel);
        }
    }
}
