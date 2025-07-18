package array;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap1 {
    static Scanner sc = new Scanner(System.in);

    // 2.
    static String[] fullNames;
    static int[] ages;
    static String[] genders;
    static double[] salaries;
    static double[] gpas;
    static int numberEmployee;

    // Hàm nhập số lượng nhân viên
    static void enterNumberEmployee() {
        System.out.println("===== NHẬP SỐ LƯỢNG NHÂN VIÊN =====");

        System.out.print("Nhập số lượng nhân viên: ");
        numberEmployee = sc.nextInt();

        fullNames = new String[numberEmployee];
        ages = new int[numberEmployee];
        genders = new String[numberEmployee];
        salaries = new double[numberEmployee];
        gpas = new double[numberEmployee];
    }

    // Hàm nhập tên nhân viên
    static void enterEmployeeInfo() {
        System.out.println("===== NHẬP THÔNG TIN NHÂN VIÊN =====");

        for (int i = 0; i < numberEmployee; i++) {
            System.out.println("Nhân viên thứ " + (i + 1));

            System.out.print("Nhập họ tên: ");
            fullNames[i] = sc.next();

            System.out.print("Nhập tuổi: ");
            ages[i] = sc.nextInt();

            System.out.print("Nhập giới tính: ");
            genders[i] = sc.next();

            System.out.print("Nhập lương: ");
            salaries[i] = sc.nextDouble();

            System.out.print("Nhập điểm GPA: ");
            gpas[i] = sc.nextDouble();
        }
    }

    // Hàm in danh sách nhân viên
    static void printListEmployee() {
        System.out.println("===== DANH SÁCH TẤT CẢ NHÂN VIÊN =====");

        for (int i = 0; i < numberEmployee; i++) {
            System.out.printf("│ %3d │ %-20s │ %4d │ %-10s │ %11.3f │ %.1f │%n",
                    (i + 1), fullNames[i], ages[i], genders[i], salaries[i], gpas[i]);
        }
    }

    // Hàm tìm nhân viên theo mã nhân viên
    static void findEmployeeByEmployeeCode() {
        System.out.println("===== THÔNG TIN CÁC NHÂN VIÊN THEO MÃ NHÂN VIÊN =====");

        int employeeCode;
        System.out.print("Nhập mã nhân viên (1 - " + numberEmployee + "): ");
        employeeCode = sc.nextInt();

        if (employeeCode >= 1 && employeeCode <= numberEmployee) {
            System.out.println("Tên nhân viên: " + fullNames[employeeCode - 1]);
            System.out.println("Tuổi: " + ages[employeeCode - 1]);
            System.out.println("Giới tính: " + genders[employeeCode - 1]);
            System.out.println("Lương: " + salaries[employeeCode - 1]);
            System.out.println("Điểm GPA: " + gpas[employeeCode - 1]);
        } else {
            System.out.println("Không tìm thấy nhân viên với mã là: " + employeeCode);
        }
    }

    // Hàm sắp xếp nhân viên theo độ tuổi tăng dần
    static void sortEmployeeByAge() {
        System.out.println("===== SẮP XẾP NHÂN VIÊN THEO TUỔI TĂNG DẦN =====");

        // Sử dụng bubble sort
        for (int i = 0; i < numberEmployee - 1; i++) {
            for (int j = 0; j < numberEmployee - i - 1; j++) {
                if (ages[j] > ages[j + 1]) {
                    swapEmployees(j, j + 1);
                }
            }
        }
    }

    // Hàm hoán đổi thông tin nhân viên
    static void swapEmployees(int i, int j) {
        // Swap họ tên
        String tempName = fullNames[i];
        fullNames[i] = fullNames[j];
        fullNames[j] = tempName;

        // Swap tuổi
        int tempAge = ages[i];
        ages[i] = ages[j];
        ages[j] = tempAge;

        // Swap giới tính
        String tempGender = genders[i];
        genders[i] = genders[j];
        genders[j] = tempGender;

        // Swap lương
        double tempSalary = salaries[i];
        salaries[i] = salaries[j];
        salaries[j] = tempSalary;

        // Swap GPA
        double tempGpa = gpas[i];
        gpas[i] = gpas[j];
        gpas[j] = tempGpa;
    }

    public static void main(String[] args) {
        // 1. Nhập số lượng nhân viên n.
        enterNumberEmployee();

        // 3. Nhập thông tin nhân viên
        enterEmployeeInfo();

        // 4. In danh sách nhân viên
        printListEmployee();

        // 5. Nhập mã nhân viên cần tìm → in thông tin nếu tìm thấy.
        findEmployeeByEmployeeCode();

        // 6. Sắp xếp danh sách nhân viên theo tuổi tăng dần.
        sortEmployeeByAge();
        printListEmployee();
    }
}
