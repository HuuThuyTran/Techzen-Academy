package homework;

import java.util.*;

public class MapJava {
    private static Scanner sc = new Scanner(System.in);
    private static int choice;

    public static void main(String[] args) {
        handleChoice();
    }

    private static void showMenu() {
        System.out.println("===== MENU CHƯƠNG TRÌNH =====");
        System.out.println("1. Đếm số lần xuất hiện của từng từ");
        System.out.println("2. Kiểm tra tên duy nhất và tên trùng");
        System.out.println("3. Kết thúc chương trình");
        System.out.print("-> Nhập các lựa chọn trên: ");
        choice = Integer.parseInt(sc.nextLine());
    }

    private static void handleChoice() {
        while (true) {
            try {
                showMenu();
                switch (choice) {
                    case 1 -> countNumberWordInText();
                    case 2 -> checkUniqueAndDuplicate();
                    case 3 -> {
                        System.err.println("Kết thúc chương trình!");
                        return;
                    }
                    default -> System.out.println("-> Bạn nhập sai số, hãy nhập lại!");
                }
            } catch (NumberFormatException e) {
                System.out.println("-> Bạn phải nhập số, hãy nhập lại! ");
                System.out.println("-> Lỗi: " + e.getMessage());
            }
        }
    }

    private static void countNumberWordInText() {
        System.out.print("Nhập một chuỗi văn bản: ");
        String text = sc.nextLine();

        String[] words = text.toLowerCase().split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void checkUniqueAndDuplicate() {
        List<String> names = Arrays.asList(
                "An", "Bình", "Chi", "An", "Dũng", "Bình", "An", "Hoa", "Dũng"
        );

        System.out.println("Danh sách tên ban đầu: " + names);

        Map<String, Integer> countName = new HashMap<>();

        // Đếm số lần xuất hiện
        for (String name : names) {
            countName.put(name, countName.getOrDefault(name, 0) + 1);
        }

        // Phân loại
        List<String> uniqueName = new ArrayList<>();
        List<String> duplicateName = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : countName.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueName.add(entry.getKey());
            } else {
                duplicateName.add(entry.getKey());
            }
        }

        // In kết quả
        System.out.println("\n=== KẾT QUẢ ===");
        System.out.println("Tên duy nhất: " + uniqueName);
        System.out.println("Tên trùng: " + duplicateName);
    }
}
