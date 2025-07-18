import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> fullNames = new ArrayList<>();
    static ArrayList<Integer> ages = new ArrayList<>();
    static ArrayList<String> genders = new ArrayList<>();
    static ArrayList<Double> salaries = new ArrayList<>();
    static ArrayList<Double> averages = new ArrayList<>();
    static int n;

    public static void main(String[] args) {
        //
        inputEmployeeInfo();
        printListEmployee();
        updateEmployeeInfo();
        // a.
        findAverageEmployee();
        // b.
        findFullNameEmployee();
        // c.
        sortIncreaseEmployeeByAge();
    }

    static void inputEmployeeInfo() {
        System.out.println("====================================");
        System.out.print("# Nhập số lượng nhân viên: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("+) Nhân viên thứ " + (i + 1) + ": ");
            System.out.print("Nhập họ tên: ");
            fullNames.add(i, sc.next());
            System.out.print("Nhập tuổi: ");
            ages.add(i, sc.nextInt());
            System.out.print("Nhập giới tính: ");
            genders.add(i, sc.next());
            System.out.print("Nhập lương cơ bản: ");
            salaries.add(i, sc.nextDouble());
            System.out.print("Nhập điểm tốt nghiệp đại học: ");
            averages.add(i, sc.nextDouble());
        }
    }

    static void printListEmployee() {
        System.out.println("====================================");
        System.out.println("# In danh sách nhân viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("+) Nhân viên thứ " + (i + 1) + ": ");
            System.out.println("Họ và tên: " + fullNames.get(i));
            System.out.println("Tuổi: " + ages.get(i));
            System.out.println("Giới tính: " + genders.get(i));
            System.out.println("Mức lương: " + salaries.get(i));
            System.out.println("Điểm tốt nghiệp đại học: " + averages.get(i));
        }
    }

    static void updateEmployeeInfo() {
        System.out.println("====================================");
        System.out.println("# Cập nhật thông tin nhân viên:");

        System.out.print("Nhập tên nhân viên cần sửa: ");
        sc.nextLine(); // Đọc bỏ dòng trống
        String name = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < fullNames.size(); i++) {
            if (fullNames.get(i).equalsIgnoreCase(name)) {
                System.out.println("Tìm thấy nhân viên: " + fullNames.get(i));

                System.out.print("Nhập tên mới: ");
                String newName = sc.nextLine();
                fullNames.set(i, newName);

                System.out.print("Nhập tuổi mới: ");
                Integer newAge = sc.nextInt();
                ages.set(i, newAge);
                sc.nextLine();

                System.out.print("Nhập lại giới tính: ");
                String newGender = sc.nextLine();
                genders.set(i, newGender);

                System.out.print("Nhập mức lương mới: ");
                Double newSalary = sc.nextDouble();
                salaries.set(i, newSalary);

                System.out.print("Nhập lại điểm TB mới: ");
                Double newAverage = sc.nextDouble();
                averages.set(i, newAverage);

                System.out.println("Đã cập nhật thành công!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy nhân viên có tên: " + name);
        }
    }

    static void findAverageEmployee() {
        System.out.println("====================================");
        System.out.println("a. Tìm kiếm nhân viên có điểm trung bình cao nhất, cao nhì:");

        // Lấy điểm trung bình cao nhất
        double max1 = Collections.max(averages);

        // Lấy điểm trung bình cao nhì
        double max2 = Double.NEGATIVE_INFINITY;

        for (double avg : averages) {
            if (avg > max1) {
                max2 = max1;
                max1 = avg;
            } else if (avg > max2 && avg < max1) {
                max2 = avg;
            }
        }

        for (int i = 0; i < averages.size(); i++) {
            if (averages.get(i) == max1) {
                System.out.println("Nhân viên: " + fullNames.get(i) + " + có điểm trung bình cao nhất: " + averages.get(i));
            } else if (averages.get(i) == max2) {
                System.out.println("Nhân viên: " + fullNames.get(i) + " + có điểm trung bình cao nhì: " + averages.get(i));
            }
        }
    }

    static void findFullNameEmployee() {
        System.out.println("====================================");
        System.out.print("b. Nhập họ và tên nhân viên cần tìm: ");
        String name = sc.next();

        if (fullNames.contains(name)) {
            System.out.println("Tìm thấy nhân viên: " + name);
        } else {
            System.out.println("Không tìm thấy nhân viên !");
        }
    }

    static void sortIncreaseEmployeeByAge() {
        System.out.println("====================================");
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            indices.add(i);
        }

        // Sắp xếp danh sách chỉ số theo tuổi tăng dần
        indices.sort(Comparator.comparingInt(i -> ages.get(i)));

        System.out.println("c. Danh sách nhân viên theo độ tuổi tăng dần:");
        for (int i = 0; i < n; i++) {
            int idx = indices.get(i);
            System.out.println("+) Nhân viên thứ " + (i + 1) + ": ");
            System.out.println("Họ và tên: " + fullNames.get(idx));
            System.out.println("Tuổi: " + ages.get(idx));
            System.out.println("Giới tính: " + genders.get(idx));
            System.out.println("Mức lương: " + salaries.get(idx));
            System.out.println("Điểm tốt nghiệp đại học: " + averages.get(idx));
        }
    }
}