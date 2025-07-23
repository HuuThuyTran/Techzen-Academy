package afternoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task4 {
    private static ArrayList<String> employees = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    static void initialEmployee() {
        employees.add("An - Nam");
        employees.add("Bình - Nữ");
        employees.add("Cường - Nam");
        employees.add("Dung - Nữ");
        employees.add("Vinh - Nam");
        employees.add("Phương - Nữ");
    }

    static void separateEmployeesByGender() {
        System.out.println("Danh sách nhân viên ban đầu: " + employees);
        Collections.sort(employees);

        ArrayList<String> nameEmployees, genderEmployees;
        nameEmployees = new ArrayList<>();
        genderEmployees = new ArrayList<>();

        for (String employee : employees) {
            String[] temp = employee.split(" - ");

            String name = temp[0];
            String gender = temp[1];

            nameEmployees.add(name);
            genderEmployees.add(gender);
        }

        // Danh sách tên nhân viên
        System.out.println("Danh sách nhân viên:");
        for (String name : nameEmployees) {
            System.out.println(name);
        }

        // Danh sách giới tính nhân viên
        System.out.println("\nDanh sách giới tính:");
        for (String gender : genderEmployees) {
            System.out.println(gender);
        }
    }

    public static void main(String[] args) {
        initialEmployee();
        separateEmployeesByGender();
    }
}
