package afternoon;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Person> persons = new ArrayList<>();

    private static String getIdentityId(Class<?> clazz) {
        int max = 0;
        String prefix = "";

        if (clazz == StudentBE.class) {
            prefix = "SBE";
        } else if (clazz == StudentFT.class) {
            prefix = "SFT";
        } else if (clazz == Teacher.class) {
            prefix = "T";
        }

        for (Person p : persons) {
            if (clazz.isInstance(p)) {
                String idStr = p.getId().substring(prefix.length());
                int id = Integer.parseInt(idStr);
                if (id > max) {
                    max = id;
                }
            }
        }

        int numDigits = 10 - prefix.length();
        return String.format("%s%0" + numDigits + "d", prefix, max + 1);

    }

    public static void main(String[] args) {
        int choose;
        while (true) {
            do {
                System.out.println("\n===== Màn Hình =====\nDANH SÁCH THÀNH VIÊN");
                System.out.println("1. Thêm thành viên (học viên Backend / Fullstack hoặc giảng viên.)");
                System.out.println("2. Hiển thị danh sách thành viên");
                System.out.println("3. Tìm kiếm thành viên theo tên hoặc email");
                System.out.println("4. Thống kê:");
                System.out.println("    Số học viên Backend");
                System.out.println("    Số học viên Fullstack");
                System.out.println("    Số học viên Fullstack có ≥ 3 dự án");
                System.out.println("    Số giảng viên có hơn 30 giờ dạy");
                System.out.println("5. Hiển thị học viên giỏi nhất của từng loại");
                System.out.println("6. Tính tổng lương của toàn bộ giảng viên");
                System.out.println("7. Thoát...");
                System.out.println("8. Tính lương nhân viên");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(sc.nextLine());

                switch (choose) {
                    case 1 -> addPerson();
                    case 2 -> printPerson(persons);
                    case 3 -> findPeson(sc, persons);
                    case 4 -> showStudentStatistics();
                    case 5 -> showTopStudent(persons);
//                    case 6 -> total();
                    case 7 -> {
                        return;
                    }
                    case 8 -> calculateSalary();
                    case 9 -> findSupportsOfTeacherByName();
                    default -> System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }
            } while (choose < 1 || choose > 7);
        }
    }

    private static void addPerson() {
        System.out.println("Bạn muốn thêm thành viên nào?");
        System.out.println("1. Học viên Backend");
        System.out.println("2. Học viên Fullstack");
        System.out.println("3. Giảng viên");
        System.out.println("4. Trợ giảng");
        int choose;
        do {
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1 -> add(StudentBE.class);
                case 2 -> add(StudentFT.class);
                case 3 -> add(Teacher.class);
                case 4 -> add(TeacherSupport.class);
                default -> System.out.println("Bạn đã nhập sai ! Vui lòng chọn 1 - 4.");
            }
        } while (choose < 1 || choose > 4);
    }

    //1 them moi
    private static void add(Class<?> clazz) {
        String id = getIdentityId(clazz);
        System.out.println("Thêm thành viên với id #" + id);

        Person person = null;

        if (clazz == StudentBE.class) {
            person = new StudentBE();
        } else if (clazz == StudentFT.class) {
            person = new StudentFT();
        } else if (clazz == Teacher.class) {
            person = new Teacher();
        }

        if (person != null) {
            person.setId(id);
            person.input(sc);
            persons.add(person);
            System.out.println("Thêm thành công !!!");
        } else {
            System.out.println("Không xác định loại thành viên.");
        }
    }

    //2 in ra
    private static void printPerson(ArrayList<Person> persons) {
        boolean hasTeacher = false;
        boolean hasStudentFT = false;
        boolean hasStudentBE = false;

        // Kiểm tra trước
        for (Person p : persons) {
            if (p instanceof Teacher) hasTeacher = true;
            else if (p instanceof StudentFT) hasStudentFT = true;
            else if (p instanceof StudentBE) hasStudentBE = true;
        }

        if (hasTeacher) {
            System.out.println("============================================ Danh sách giảng viên ===========================================");
            new Teacher().printHeader();
            for (Person p : persons) {
                if (p instanceof Teacher) {
                    System.out.println(p);
                }
            }
            System.out.println("==================================================================================================");
        }

        if (hasStudentFT) {
            System.out.println("\n===================================== Danh sách học viên khóa FullStack =====================================");
            new StudentFT().printHeaderSFT();
            for (Person p : persons) {
                if (p instanceof StudentFT) {
                    System.out.println(p);
                }
            }
            System.out.println("==================================================================================================");
        }

        if (hasStudentBE) {
            System.out.println("\n===================================== Danh sách học viên khóa BackEnd =====================================");
            new StudentBE().printHeaderSBE();
            for (Person p : persons) {
                if (p instanceof StudentBE) {
                    System.out.println(p);
                }
            }
            System.out.println("==================================================================================================");
        }

        if (!hasTeacher && !hasStudentFT && !hasStudentBE) {
            System.out.println("❌ Không có dữ liệu để hiển thị.");
        }
    }

    //3
    public static void findPeson(Scanner sc, ArrayList<Person> listMembers) {
        System.out.print("Nhập từ khóa cần tìm (họ tên hoặc email): ");
        String keyword = sc.nextLine().trim().toLowerCase();

        // Kiểm tra là email hay tên
        if (isValidEmail(keyword)) {
            ArrayList<Person> ketQua = findByEmail(keyword, listMembers);
            if (ketQua.isEmpty()) {
                System.out.println("❌ Không tìm thấy thành viên nào với email \"" + keyword + "\"");
            } else {
                System.out.println("✅ Kết quả tìm kiếm theo email:");

                printPerson(ketQua);
            }
        } else if (isValidName(keyword)) {
            ArrayList<Person> ketQua = findByName(keyword, listMembers);
            if (ketQua.isEmpty()) {
                System.out.println("❌ Không tìm thấy thành viên nào với tên \"" + keyword + "\"");
            } else {
                System.out.println("✅ Kết quả tìm kiếm theo tên:");
                printPerson(ketQua);
            }
        } else {
            System.out.println("❌ Từ khóa không hợp lệ. Vui lòng nhập tên hoặc email đúng định dạng.");
        }
    }

    // Kiểm tra keyword có phải là tên (chỉ chứa chữ và khoảng trắng)
    public static boolean isValidName(String keyword) {
        return keyword.matches("[a-zA-Z\\s]+");
    }

    // Kiểm tra keyword có phải là email
    public static boolean isValidEmail(String keyword) {
        return keyword.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}$");
    }

    public static ArrayList<Person> findByName(String keyword, ArrayList<Person> list) {
        ArrayList<Person> dsTimTheoTen = new ArrayList<>();
        for (Person p : persons)
            if (p.getName().trim().toLowerCase().contains(keyword)) {
                dsTimTheoTen.add(p);
            }
        ;
        return dsTimTheoTen;
    }

    public static ArrayList<Person> findByEmail(String keyword, ArrayList<Person> list) {
        ArrayList<Person> dsTimTheoEmail = new ArrayList<>();
        for (Person p : persons)
            if (p.getEmail().trim().toLowerCase().contains(keyword)) {
                dsTimTheoEmail.add(p);
            }
        ;
        return dsTimTheoEmail;
    }

    //4
    private static void showStudentStatistics() {
        int countStudentBE = 0;
        int countStudentFT = 0;
        int countFTOver3Projects = 0;
        int countTeacherOver30h = 0;

        for (Person p : persons) {
            if (p instanceof StudentBE) {
                countStudentBE++;
            } else if (p instanceof StudentFT) {
                StudentFT ft = (StudentFT) p;
                countStudentFT++;
                if (ft.soDuAnThamGia >= 3) {
                    countFTOver3Projects++;
                }
            } else if (p instanceof Teacher) {
                Teacher t = (Teacher) p;
                if (t.getSoGioDay() > 30) {
                    countTeacherOver30h++;
                }
            }
        }

        System.out.println("Số học viên Backend: " + countStudentBE);
        System.out.println("Số học viên Fullstack: " + countStudentFT);
        System.out.println("Số học viên Fullstack có từ 3 dự án trở lên: " + countFTOver3Projects);
        System.out.println("Số giảng viên có hơn 30 giờ dạy: " + countTeacherOver30h);
    }

    //5
    public static void showTopStudent(ArrayList<Person> list) {
        StudentBE gioiNhatBackend = null;
        StudentFT gioiNhatFullstack = null;

        for (Person p : list) {
            if (p instanceof StudentBE) {
                StudentBE hv = (StudentBE) p;
                if (gioiNhatBackend == null || hv.getDiemTrungBinh() > gioiNhatBackend.getDiemTrungBinh()) {
                    gioiNhatBackend = hv;
                }
            } else if (p instanceof StudentFT) {
                StudentFT hv = (StudentFT) p;

                if (gioiNhatFullstack == null || hv.getDiemTrungBinh() / hv.getSoDuAnThamGia() > gioiNhatFullstack.getDiemTrungBinh() / gioiNhatFullstack.getSoDuAnThamGia()) {
                    gioiNhatFullstack = hv;
                }
            }
        }

        System.out.println("\n🏆 Học viên Backend giỏi nhất:");
        if (gioiNhatBackend != null) {
            new StudentBE().printHeaderSBE();
            System.out.println(gioiNhatBackend);
        } else {
            System.out.println("Không có học viên Backend.");
        }

        System.out.println("\n🏆 Học viên Fullstack giỏi nhất:");
        if (gioiNhatFullstack != null) {
            new StudentFT().printHeaderSFT();
            System.out.println(gioiNhatFullstack);
        } else {
            System.out.println("Không có học viên Fullstack.");
        }
    }

//    //6
//    private static void total() {
//        BigDecimal sum = BigDecimal.ZERO;
//        for (Person p : persons) {
//            if (p instanceof Teacher) {
//                sum = sum.add(((Teacher) p).luong());
//            }
//        }
//        System.out.println("Tổng lương của toàn bộ giảng viên là: " + sum.setScale(2, RoundingMode.HALF_UP) + " VND");
//    }

    //8
    private static void calculateSalary() {
        System.out.println("Hãy lựa chọn:");
        System.out.println("1. Giảng viên");
        System.out.println("2. Trợ giảng");
        System.out.print("Mời bạn nhập: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            double totalSalaryTeacher = 0;
            for (Person p : persons) {
                if (p instanceof Teacher teacher) {
                    totalSalaryTeacher += teacher.getSalary();
                }
            }
            System.out.println("=> Tổng lương của các giảng viên: " + totalSalaryTeacher);
        } else if (choice == 2) {
            double totalSalaryTeacherSupport = 0;
            for (Person p : persons) {
                if (p instanceof TeacherSupport teacherSupport) {
                    totalSalaryTeacherSupport += teacherSupport.getSalary();
                }
            }
            System.out.println("=> Tổng lương của các trợ giảng: " + totalSalaryTeacherSupport);
        } else {
            System.out.println("Lựa chọn không hợp lệ! Chỉ chọn 1 hoặc 2.");
        }
    }

    //9
    private static void findSupportsOfTeacherByName() {
        sc.nextLine();
        System.out.print("Nhập id giảng viên cần tra cứu: ");
        String id = sc.nextLine().trim();

        Teacher foundTeacher = null;

        // Tìm giảng viên theo ID
        for (Person p : persons) {
            if (p instanceof Teacher && id.equals(p.getId())) {
                foundTeacher = (Teacher) p;
                break;
            }
        }
        // Nếu không tìm thấy
        if (foundTeacher == null) {
            System.out.println("Không tìm thấy giảng viên với ID: " + id);
            return;
        }
        // Duyệt toàn bộ danh sách để tìm các trợ giảng hỗ trợ giảng viên này
        ArrayList<TeacherSupport> teacherSupports = new ArrayList<>();
        for (Person p : persons) {
            if (p instanceof TeacherSupport ts) {
                for (Teacher supported : ts.getTeachers()) {
                    if (supported.equals(foundTeacher)) {
                        teacherSupports.add(ts);
                        break;
                    }
                }
            }
        }
        // In kết quả
        System.out.println("Giảng viên: " + foundTeacher);
        System.out.println("Số lượng trợ giảng hỗ trợ: " + teacherSupports.size());

        if (teacherSupports.isEmpty()) {
            System.out.println("Không có trợ giảng nào hỗ trợ giảng viên này.");
        } else {
            System.out.println("Danh sách trợ giảng:");
            for (TeacherSupport ts : teacherSupports) {
                System.out.println(" - " + ts);
            }
        }
    }


}

