package homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class PhoneManager {
    private final ArrayList<Phone> phones;
    private final Scanner sc;
    private Phone phone;
    private int choice;

    public PhoneManager() {
        phones = new ArrayList<>();
        sc = new Scanner(System.in);
        initSampleData();
    }

    // Hàm khởi tạo dữ liệu
    private void initSampleData() {
        phones.add(new NewPhone("iPhone 15", 25000000, LocalDate.of(2026, 6, 22), "iOS", "Apple", 10));
        phones.add(new NewPhone("Samsung Galaxy S24", 20000000, LocalDate.of(2026, 4, 15), "Android", "Samsung", 5));
        phones.add(new NewPhone("Samsung Galaxy S25", 35000000, LocalDate.of(2026, 8, 9), "Android", "Samsung", 8));
        phones.add(new OldPhone("iPhone 12", 15000000, LocalDate.of(2026, 8, 7), "iOS", "Apple", 85));
        phones.add(new OldPhone("Samsung Galaxy S21", 12000000, LocalDate.of(2026, 7, 12), "Android", "Samsung", 90));
        phones.add(new OldPhone("Samsung Galaxy Z Fold7", 44990000, LocalDate.of(2026, 8, 4), "Android", "Samsung", 100));
    }

    // Hàm xem menu chính của chương trình
    public void displayMenu() {
        while (true) {
            System.out.println("======== CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI ========\n" + "1. Xem danh sách điện thoại\n" + "2. Thêm mới\n" + "3. Cập nhật\n" + "4. Xóa\n" + "5. Sắp xếp theo giá\n" + "6. Tìm kiếm\n" + "7. Tính tổng tiền\n" + "8. Giảm giá cho điện thoại cũ\n" + "9. Thoát chương trình");
            System.out.print("Chọn chức năng từ (1-9): ");
            choice = getValidChoice(1, 9);

            switch (choice) {
                case 1 -> displayViewMenu();
                case 2 -> displayAddMenu();
                case 3 -> updatePhone();
                case 4 -> deletePhoneById();
                case 5 -> displaySortMenu();
                case 6 -> displaySearchMenu();
                case 7 -> viewTotal();
                case 8 -> applyPromotionToOldPhones();
                case 9 -> {
                    System.err.println("Chương trình kết thúc!");
                    return;
                }
            }
        }
    }

    // Hàm lấy giá trị của biến choice có hợp lệ ko
    private int getValidChoice(int min, int max) {
        while (true) {
            try {
                choice = sc.nextInt();
                sc.nextLine();
                if (choice >= min && choice <= max) {
                    return choice;
                } else {
                    System.out.print("Vui lòng chọn từ " + min + " đến " + max + ": ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Vui lòng nhập số hợp lệ: ");
                sc.nextLine();
            }
        }
    }

    // ------------- Bài 1: Hàm xem menu danh sách điện thoại -------------
    // *. Hàm xem menu danh sách điện thoại
    public void displayViewMenu() {
        while (true) {
            System.out.println("\n=== MENU XEM DANH SÁCH ĐIỆN THOẠI ===\n" + "1. Xem tất cả\n" + "2. Xem điện thoại cũ\n" + "3. Xem điện thoại mới\n" + "4. Trở về menu chính");
            System.out.print("Chọn từ (1-4): ");
            choice = getValidChoice(1, 4);

            switch (choice) {
                case 1 -> viewAllPhones();
                case 2 -> viewOldPhones();
                case 3 -> viewNewPhones();
                case 4 -> {
                    System.out.println("Đã quay về menu chính! \n");
                    return;
                }
            }
        }
    }

    // a. Hàm xem tất cả danh sách điện thoại
    private void viewAllPhones() {
        System.out.println("\n=== DANH SÁCH TẤT CẢ ĐIỆN THOẠI ===");
        if (phones.isEmpty()) {
            System.out.println("Danh sách tất cả điện thoại đang trống!");
        }
        for (Phone phone : phones) {
            phone.displayInfo();
        }
    }

    // b. Hàm xem danh sách điện thoại cũ
    private void viewOldPhones() {
        System.out.println("\n=== DANH SÁCH ĐIỆN THOẠI CŨ ===");
        if (phones.isEmpty()) {
            System.out.println("Danh sách điện thoại cũ đang trống!");
        }
        for (Phone phone : phones) {
            if (phone instanceof OldPhone) {
                phone.displayInfo();
            }
        }
    }

    // c. Hàm xem danh sách điện thoại cũ
    private void viewNewPhones() {
        System.out.println("\n=== DANH SÁCH ĐIỆN THOẠI MỚI ===");
        if (phones.isEmpty()) {
            System.out.println("Danh sách điện thoại mới đang trống!");
        }
        for (Phone phone : phones) {
            if (phone instanceof NewPhone) {
                phone.displayInfo();
            }
        }
    }

    // ------------- Bài 2: Hàm xem menu thêm mới điện thoại -------------
    // *. Hàm xem menu thêm mới điện thoại
    public void displayAddMenu() {
        while (true) {
            System.out.println("\n=== MENU THÊM MỚI ĐIỆN THOẠI ===\n" + "1. Thêm mới điện thoại cũ\n" + "2. Thêm mới điện thoại mới\n" + "3. Trở về menu chính");
            System.out.print("Chọn (1-3): ");
            choice = getValidChoice(1, 3);

            switch (choice) {
                case 1 -> addOldPhone();
                case 2 -> addNewPhone();
                case 3 -> {
                    System.out.println("Đã quay về menu chính! \n");
                    return;
                }
            }
        }
    }

    // a. Hàm thêm mới điện thoại cũ
    private void addOldPhone() {
        System.out.println("\n=== THÊM MỚI ĐIỆN THOẠI CŨ ===");
        phone = new OldPhone("", 0, LocalDate.now(), "", "", 0);
        phone.input(sc);
        phones.add(phone);
        System.out.println("Đã thêm điện thoại cũ thành công!");
    }

    // b. Hàm thêm mới điện thoại mới
    private void addNewPhone() {
        System.out.println("\n=== THÊM MỚI ĐIỆN THOẠI MỚI ===");
        phone = new NewPhone("", 0, LocalDate.now(), "", "", 0);
        phone.input(sc);
        phones.add(phone);
        System.out.println("Đã thêm điện thoại mới thành công!");
    }

    // ------------- Bài 3: chức năng cập nhật một điện thoại trong danh sách -------------
    // *. Hàm update thông tin 1 điện thoại
    public void updatePhone() {
        while (true) {
            System.out.println("\n=== CẬP NHẬT ĐIỆN THOẠI ===");
            System.out.print("Nhập ID (DTM/DTC + 3 số - Vd: DTM001, DTC002...) hoặc Enter để thoát: ");
            String id = sc.nextLine().trim().toUpperCase();

            if (id.isEmpty()) {
                System.out.println("Đã thoát cập nhật.\n");
                break;
            }

            // Kiểm tra format của ID
            if (!isValidIdFormat(id)) {
                System.out.println("Lỗi: ID không đúng định dạng! (VD: DTM001 hoặc DTC002)");
                continue;
            }

            // Tìm phone theo ID
            Phone phoneToUpdate = findPhoneById(id);
            if (phoneToUpdate == null) {
                System.out.println("Không tìm thấy điện thoại có ID: " + id);
                continue;
            }

            // Cập nhật thông tin
            System.out.println("=== ĐI CẬP NHẬT THÔNG TIN ĐIỆN THOẠI ===");
            if (phoneToUpdate instanceof NewPhone) {
                inputPhoneInfo(phoneToUpdate);
            } else if (phoneToUpdate instanceof OldPhone) {
                inputPhoneInfo(phoneToUpdate);
            }

            System.out.println("Cập nhật thành công cho điện thoại: " + id + "\n");
            break;
        }
    }

    // *. Kiểm tra format ID hợp lệ
    private boolean isValidIdFormat(String id) {
        // Kiểm tra độ dài = 6 ký tự
        if (id.length() != 6) {
            return false;
        }

        // Kiểm tra 3 ký tự đầu là DTM hoặc DTC
        String prefix = id.substring(0, 3);
        if (!prefix.equals("DTM") && !prefix.equals("DTC")) {
            return false;
        }

        // Kiểm tra 3 ký tự cuối là số
        String suffix = id.substring(3);
        try {
            Integer.parseInt(suffix);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // *. Tìm điện thoại theo ID
    private Phone findPhoneById(String id) {
        for (Phone phone : phones) {
            if (phone.getId().equals(id)) {
                System.out.println("=> Đã tìm thấy id!");
                phone.displayInfo();
                return phone;
            }
        }
        return null;
    }

    // *. Hàm nhập thông tin cho điện thoại mới và cũ
    private void inputPhoneInfo(Phone phone) {
        System.out.print("Nhập tên điện thoại mới (Enter để giữ nguyên): ");
        String name = sc.nextLine().trim();
        if (!name.isEmpty()) phone.setName(name);

        System.out.print("Nhập giá bán mới (Enter để giữ nguyên): ");
        String priceStr = sc.nextLine().trim();
        if (!priceStr.isEmpty()) {
            try {
                double price = Double.parseDouble(priceStr);
                if (price > 0) phone.setPrice(price);
                else System.out.println("Giá phải > 0. Giữ nguyên giá cũ.");
            } catch (NumberFormatException e) {
                System.out.println("Giá không hợp lệ. Giữ nguyên giá cũ.");
            }
        }

        System.out.print("Nhập thời gian bảo hành mới (dd/MM/yyyy) (Enter để giữ nguyên): ");
        String warrantyStr = sc.nextLine().trim();
        if (!warrantyStr.isEmpty()) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate newWarrantyDate = LocalDate.parse(warrantyStr, formatter);
                phone.setWarrantyDate(newWarrantyDate);
            } catch (DateTimeParseException e) {
                System.out.println("Ngày không hợp lệ. Giữ nguyên.");
            }
        }

        System.out.print("Nhập hệ điều hành mới (Android/iOS) (Enter để giữ nguyên): ");
        String os = sc.nextLine().trim();
        if (!os.isEmpty()) {
            if (os.equalsIgnoreCase("Android") || os.equalsIgnoreCase("iOS")) {
                phone.setOs(os);
            } else {
                System.out.println("Hệ điều hành không hợp lệ. Giữ nguyên.");
            }
        }

        System.out.print("Nhập hãng sản xuất mới (Enter để giữ nguyên): ");
        String brand = sc.nextLine().trim();
        if (!brand.isEmpty()) phone.setBrand(brand);

        // Nếu là NewPhone thì xử lý quality
        if (phone instanceof NewPhone) {
            System.out.print("Nhập số lượng mới (Enter để giữ nguyên): ");
            String qualityStr = sc.nextLine().trim();
            if (!qualityStr.isEmpty()) {
                try {
                    int quality = Integer.parseInt(qualityStr);
                    if (quality >= 0) ((NewPhone) phone).setQuality(quality);
                    else System.out.println("Số lượng phải >= 0. Giữ nguyên.");
                } catch (NumberFormatException e) {
                    System.out.println("Số lượng không hợp lệ. Giữ nguyên.");
                }
            }
        }

        // Nếu là OldPhone thì xử lý batteryStatus
        if (phone instanceof OldPhone) {
            System.out.print("Nhập tình trạng pin mới (%) (Enter để giữ nguyên): ");
            String batteryStr = sc.nextLine().trim();
            if (!batteryStr.isEmpty()) {
                try {
                    int battery = Integer.parseInt(batteryStr);
                    if (battery >= 0 && battery <= 100) ((OldPhone) phone).setBatteryStatus(battery);
                    else System.out.println("Pin phải từ 0 đến 100%. Giữ nguyên.");
                } catch (NumberFormatException e) {
                    System.out.println("Tình trạng pin không hợp lệ. Giữ nguyên.");
                }
            }
        }

        System.out.println("=> Cập nhật thông tin điện thoại thành công!");
    }

    // ------------- Bài 4: chức năng xóa một điện thoại trong danh sách -------------
    // *. Hàm xóa 1 điện thoại theo ID
    public void deletePhoneById() {
        System.out.print("Nhập ID điện thoại cần xóa: ");
        String id = sc.nextLine().trim();

        // Tìm điện thoại theo ID
        Phone phoneToDelete = null;
        for (Phone phone : phones) {
            if (phone.getId().equalsIgnoreCase(id)) {
                phoneToDelete = phone;
                break;
            }
        }

        if (phoneToDelete == null) {
            System.out.println("Không tìm thấy điện thoại với ID: " + id);
            return;
        }

        // Xác nhận xóa
        System.out.print("Bạn có chắc muốn xóa điện thoại này? (y/n): ");
        String confirm = sc.nextLine().trim().toLowerCase();

        if (confirm.equals("y")) {
            phones.remove(phoneToDelete);
            System.out.println("Đã xóa điện thoại với ID: " + id + "\n");
        } else {
            System.out.println("Hủy xóa.\n");
        }
    }

    // ------------- Bài 5: Hàm xem menu sắp xếp theo giá -------------
    // *. Hàm xem menu sắp xếp
    public void displaySortMenu() {
        while (true) {
            System.out.println("\n=== MENU SẮP XẾP THEO GIÁ TIỀN ĐIỆN THOẠI ===\n" + "1. Tăng dần\n" + "2. Giảm dần\n" + "3. Trở về menu chính");
            System.out.print("Chọn (1-3): ");
            choice = getValidChoice(1, 3);

            switch (choice) {
                case 1 -> sortByPriceAscending();
                case 2 -> sortByPriceDescending();
                case 3 -> {
                    System.out.println("Đã quay về menu chính! \n");
                    return;
                }
            }
        }
    }

    // a. Hàm sắp xếp giá tiền điện thoại tăng dần
    private void sortByPriceAscending() {
        // Tạo bản sao của phones là sortedPhones
        ArrayList<Phone> sortedPhones = new ArrayList<>(phones);

        // Đi sắp xếp tăng dần theo giá tiền
        // sortedPhones.sort(Comparator.comparingDouble(Phone::getPrice));
        sortedPhones.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        // Rồi in thông tin đã sắp xếp ra
        System.out.println("Đã sắp xếp theo giá tăng dần!");
        for (Phone phone : sortedPhones) {
            phone.displayInfo();
        }
    }

    // b. Hàm sắp xếp giá tiền điện thoại giảm dần
    private void sortByPriceDescending() {
        // Tạo bản sao của phones là sortedPhones
        ArrayList<Phone> sortedPhones = new ArrayList<>(phones);

        // Đi sắp xếp tăng dần theo giá tiền
        // sortedPhones.sort(Comparator.comparingDouble(Phone::getPrice));
        sortedPhones.sort((p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice()));

        // Rồi in thông tin đã sắp xếp ra
        System.out.println("Đã sắp xếp theo giá giảm dần!");
        for (Phone phone : sortedPhones) {
            phone.displayInfo();
        }
    }

    // ------------- Bài 6: Hàm xem menu tìm kiếm -------------
    // *. Hàm xem menu tìm kiếm
    public void displaySearchMenu() {
        while (true) {
            System.out.println("\n=== MENU TÌM KIẾM ĐIỆN THOẠI ===\n" + "1. Tìm kiếm tất cả điện thoại\n" + "2. Tìm kiếm điện thoại cũ\n" + "3. Tìm kiếm điện thoại mới\n" + "4. Trở về menu chính");
            System.out.print("Chọn (1-4): ");
            choice = getValidChoice(1, 4);

            switch (choice) {
                case 1 -> displaySearchDetailMenu("all");
                case 2 -> displaySearchDetailMenu("old");
                case 3 -> displaySearchDetailMenu("new");
                case 4 -> {
                    System.out.println("Đã quay về menu chính! \n");
                    return;
                }
            }
        }
    }

    // *. Hàm xem menu chi tiết tìm kiếm
    private void displaySearchDetailMenu(String phoneType) {
        while (true) {
            System.out.println("\n=== TÌM KIẾM CHI TIẾT ===\n" + "1. Tìm kiếm theo giá (Nhập khoảng từ bao nhiêu đến bao nhiêu)\n" + "2. Tìm kiếm theo tên\n" + "3. Tìm kiếm theo hãng\n" + "4. Trở về menu Tìm kiếm");
            System.out.print("Chọn (1-4): ");
            choice = getValidChoice(1, 4);

            switch (choice) {
                case 1 -> searchByPriceRange(phoneType);
                case 2 -> searchByName(phoneType);
                case 3 -> searchByBrand(phoneType);
                case 4 -> {
                    System.out.println("Đã quay về menu tìm kiếm! \n");
                    return;
                }
            }
        }
    }

    // a. Hàm tìm kiếm theo khoảng giá của điện thoại
    private void searchByPriceRange(String phoneType) {
        System.out.print("Nhập giá từ: ");
        double minPrice = sc.nextDouble();
        System.out.print("Nhập giá đến: ");
        double maxPrice = sc.nextDouble();
        sc.nextLine();

        System.out.println("\n=== KẾT QUẢ TÌM KIẾM (GIÁ: " + minPrice + " - " + maxPrice + ") ===");
        boolean found = false;

        for (Phone phone : phones) {
            boolean typeMatch = phoneType.equals("all") || phoneType.equals("old") && phone instanceof OldPhone || phoneType.equals("new") && phone instanceof NewPhone;
            if (typeMatch && phone.getPrice() >= minPrice && phone.getPrice() <= maxPrice) {
                phone.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy điện thoại nào trong khoảng giá đó!");
        }
    }

    // b. Hàm tìm kiếm theo tên của điện thoại
    private void searchByName(String phoneType) {
        System.out.print("Nhập tên điện thoại muốn tìm: ");
        String searchName = sc.nextLine().toLowerCase();

        System.out.println("\n=== KẾT QUẢ TÌM KIẾM (TÊN: " + searchName + ") ===");
        boolean found = false;

        for (Phone phone : phones) {
            boolean typeMatch = phoneType.equals("all") || phoneType.equals("old") && phone instanceof OldPhone || phoneType.equals("new") && phone instanceof NewPhone;
            if (typeMatch && phone.getName().toLowerCase().contains(searchName)) {
                phone.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy tên điện thoại nào có tên: " + searchName);
        }
    }

    // c. Hàm tìm kiếm theo tên hãng sản xuất của điện thoại
    private void searchByBrand(String phoneType) {
        System.out.print("Nhập tên hãng điện thoại muốn tìm: ");
        String searchBrandName = sc.nextLine().toLowerCase();

        System.out.println("\n=== KẾT QUẢ TÌM KIẾM (HÃNG: " + searchBrandName + ") ===");
        boolean found = false;

        for (Phone phone : phones) {
            boolean typeMatch = phoneType.equals("all") || phoneType.equals("old") && phone instanceof OldPhone || phoneType.equals("new") && phone instanceof NewPhone;
            if (typeMatch && phone.getBrand().toLowerCase().contains(searchBrandName)) {
                phone.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy tên hãng điện thoại nào có hãng: " + searchBrandName);
        }
    }

    // ------------- Bài 7: chức năng tính tổng giá tất cả các điện thoại trong danh sách -------------
    // *. Hàm xem tổng giá tất cả điện thoại
    public void viewTotal() {
        double totalPrice = 0;
        for (Phone phone : phones) {
            totalPrice += phone.totalPrice();
        }
        System.out.println("Tổng giá tất cả điện thoại: " + String.format("%,.0f", totalPrice) + " VNĐ\n");
    }

    // ------------- Bài 8: chức năng giảm giá cho điện thoại cũ -------------
    // *. Hàm áp dụng mã khuyến mãi cho điện thoại cũ
    public void applyPromotionToOldPhones() {
        System.out.print("Nhập số % vào: ");
        double percent = sc.nextDouble();

        boolean found = false;
        for (Phone phone : phones) {
            if (phone instanceof Promotion promotionPhone) {
                promotionPhone.promote(percent);
                found = true;
            }
        }

        if (found) {
            System.out.println("Đã giảm giá " + percent + "% cho các điện thoại cũ.\n");
        } else {
            System.out.println("Không có điện thoại cũ nào được giảm giá.\n");
        }
    }
}
