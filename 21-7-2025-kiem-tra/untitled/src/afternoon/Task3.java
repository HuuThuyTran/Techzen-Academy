package afternoon;

import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    private static ArrayList<String> employees = new ArrayList<>();

    static void initialEmployee() {
        employees.add("Bảo - Nam");
        employees.add("Dung - Nữ");
        employees.add("Phương - Nam");
        employees.add("An - Nam");
        employees.add("Vy - Nam");
        employees.add("Chương - Nữ");
    }

    static void sortNameEmployeeByLength() {
        System.out.print("Danh sách nhân viên ban đầu: ");
        System.out.println(employees);

        // Tách tên nhân viên trong ArrayList
        ArrayList<String> nameEmployees = new ArrayList<>();
        for (String employee : employees) {
            String[] temp = employee.split(" - ");
            String name = temp[0];
            nameEmployees.add(name);
        }
        System.out.println("Tên các nhân viên: " + nameEmployees);

        // Sắp xếp danh sách trong nameEmployees
        int n = nameEmployees.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String name1 = nameEmployees.get(j);
                String name2 = nameEmployees.get(j + 1);

                // So sánh độ dài giảm dần
                if (name1.length() < name2.length()) {
                    // Hoán đổi vị trí
                    Collections.swap(nameEmployees, j, j + 1);
                } else if (name1.length() == name2.length()) {
                    // Nếu cùng độ dài, sắp xếp theo thứ tự alphabet (tăng dần)
                    // String.compareTo() (Gía trị: name1 - name2):
                    // trả về số âm nếu name1 đứng trước name2
                    // trả về số dương nếu name1 đứng sau name2
                    // trả về 0 nếu bằng nhau

                    if (name1.compareTo(name2) > 0) {
                        // Hoán đổi vị trí nếu name1 đứng sau name2 theo alphabet
                        Collections.swap(nameEmployees, j, j + 1);
                    }
                }
            }
        }
        System.out.println("Tên nhân viên sau khi sắp xếp: " + nameEmployees);
    }

    public static void main(String[] args) {
        initialEmployee();
        sortNameEmployeeByLength();
    }
}
