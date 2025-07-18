package array;

import java.util.Scanner;

public class BaiTap2 {
    static Scanner sc = new Scanner(System.in);

    // 2.
    static String[] fullNames;
    static double[] mathScores;
    static double[] englishScores;
    static double[] itScores;
    static double[] averageScores;
    static int numberStudent;

    // Hàm nhập số lượng sinh viên
    static void enterNumberStudent() {
        System.out.println("===== NHẬP SỐ LƯỢNG SINH VIÊN =====");

        System.out.print("Nhập số lượng sinh viên: ");
        numberStudent = sc.nextInt();

        fullNames = new String[numberStudent];
        mathScores = new double[numberStudent];
        englishScores = new double[numberStudent];
        itScores = new double[numberStudent];
        averageScores = new double[numberStudent];
    }

    // Hàm nhập tên nhân viên
    static void enterStudentInfo() {
        System.out.println("===== NHẬP THÔNG TIN SINH VIÊN =====");

        for (int i = 0; i < numberStudent; i++) {
            System.out.println("Sinh viên thứ " + (i + 1));

            System.out.print("Nhập họ tên: ");
            fullNames[i] = sc.next();

            System.out.print("Nhập điểm toán: ");
            mathScores[i] = sc.nextDouble();

            System.out.print("Nhập điểm anh: ");
            englishScores[i] = sc.nextDouble();

            System.out.print("Nhập điểm tin: ");
            itScores[i] = sc.nextDouble();
        }
    }

    // 3. Hàm tính điểm trung bình
    static double[] calculateAverage() {
        for (int i = 0; i < numberStudent; i++) {
            double average = (mathScores[i] + englishScores[i] + itScores[i]) / 3.0;
            averageScores[i] = average;
        }
        return averageScores;
    }

    // Hàm in bảng điểm
    static void printScoreStudent() {
        System.out.println("===== BẢNG ĐIỂM TẤT CẢ SINH VIÊN =====");

        for (int i = 0; i < numberStudent; i++) {
            System.out.printf("| %3d | %-20s | %4.1f | %4.1f | %4.1f | %.2f |%n",
                    (i + 1), fullNames[i], mathScores[i], englishScores[i], itScores[i], calculateAverage()[i]);
        }
    }

    // Hàm tìm sinh viên có điểm trung bình cao nhất
    static void findStudentTop() {
        System.out.println("===== TÌM SINH VIÊN CÓ ĐIỂM TRUNG BÌNH CAO NHẤT =====");

        double maxAverage = averageScores[0];
        int maxIndex = 0;

        // Tìm điểm trung bình cao nhất
        for (int i = 1; i < numberStudent; i++) {
            if (averageScores[i] > maxAverage) {
                maxAverage = averageScores[i];
                maxIndex = i;
            }
        }
        System.out.println("Họ tên: " + fullNames[maxIndex]);
        System.out.println("Điểm Toán: " + mathScores[maxIndex]);
        System.out.println("Điểm Anh văn: " + englishScores[maxIndex]);
        System.out.println("Điểm Tin học: " + itScores[maxIndex]);
        System.out.printf("Điểm trung bình: %.2f%n", maxAverage);
    }

    // Hàm sắp xếp sinh viên theo điểm trung bình giảm dần
    static void sortEmployeeByAge() {
        System.out.println("===== SẮP XẾP SINH VIÊN THEO ĐIỂM TRUNG BÌNH GIẢM DẦN =====");


    }

    public static void main(String[] args) {
        // 1. Nhập số lượng sinh viên n.
        enterNumberStudent();
        enterStudentInfo();

        // 4. In bảng điểm
        printScoreStudent();

        // 5. Tìm và in sinh viên có điểm trung bình cao nhất.
        findStudentTop();

        // 6. Sắp xếp danh sách sinh viên theo điểm trung bình giảm dần

    }
}
