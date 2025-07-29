package team;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void displayMenu() {
        System.out.println(">> LỰA CHỌN CHỨC NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Thêm sinh viên mới                       |");
        System.out.println("| 2. Hiện danh sách tất cả sinh viên          |");
        System.out.println("| 3. Tìm sinh viên theo tên                   |");
        System.out.println("| 4. Hiện thị tổng số sinh viên               |");
        System.out.println("| 5. Sinh viên có điểm cao nhất               |");
        System.out.println("| 6. Sinh viên có điểm dưới trung bình ( < 5) |");
        System.out.println("| 7. Exit                                     |");
        System.out.println("++ ----------------------------------------- ++");
    }

    public static void addStudent() {
        System.out.print("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi sinh viên: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập điểm trung bình: ");
        double avgScore = Double.parseDouble(sc.nextLine());

        Student student = new Student(name, age, avgScore);
        students.add(student);
        System.out.println("Thêm sinh viên thành công!");
    }

    public static void displayStudents() {
        String RESET = "\u001B[0m";
        String BLUE = "\u001B[34m";

        if (students.isEmpty()) {
            System.out.println(BLUE + "Danh sách sinh viên trống !" + RESET);
            return;
        }
        System.out.println(BLUE + "============= Danh sách sinh viên =============" + RESET);
        System.out.printf(BLUE + "%-5s | %-20s | %-5s | %-8s\n" + RESET,
                "ID", "Tên", "Tuổi", "Điểm TB");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        while (true) {
            displayMenu();
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 7:
                    System.out.println("Kết thúc chương trình !");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
                    break;
            }
        }
    }
}
