package homework;

import java.time.LocalDate;

public class PhoneManagementApp {
    public static void main(String[] args) {
//        // Thêm điện thoại mới
//        Phone dtm1 = new NewPhone("iPhone 15 Pro", 25000000, LocalDate.of(2026, 6, 7),
//                "iOS", "Apple", 50);
//        Phone dtm2 = new NewPhone("Samsung Galaxy S24", 22000000, LocalDate.of(2026, 4, 11),
//                "Android", "Samsung", 30);
//        Phone dtm3 = new NewPhone("Xiaomi 14", 15000000, LocalDate.of(2026, 7, 31),
//                "Android", "Xiaomi", 25);
//
//        // Thêm điện thoại cũ
//        Phone dtc1 = new OldPhone("iPhone 13", 18000000, LocalDate.of(2026, 12, 7),
//                "iOS", "Apple", 85);
//        Phone dtc2 = new OldPhone("Samsung Note 20", 12000000, LocalDate.of(2026, 3, 11),
//                "Android", "Samsung", 70);
//        Phone dtc3 = new OldPhone("iPhone 12", 15000000, LocalDate.of(2026, 7, 25),
//                "iOS", "Apple", 60);
//
//        dtm3.displayInfo();
//        dtm2.displayInfo();
//        dtm1.displayInfo();
//
//        dtc3.displayInfo();
//        dtc2.displayInfo();
//        dtc1.displayInfo();

        PhoneManager phoneManager = new PhoneManager();
        phoneManager.displayMenu();
    }
}
