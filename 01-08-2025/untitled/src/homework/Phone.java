package homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Phone {
    private String id;
    private String name;
    private double price;
    private LocalDate warrantyDate;
    private String os;
    private String brand;

    public Phone(String name, double price, LocalDate warrantyDate, String os, String brand) {
        this.name = name;
        this.price = price;
        this.warrantyDate = warrantyDate;
        this.os = os;
        this.brand = brand;
    }

    // Các hàm Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getWarrantyDate() {
        return warrantyDate;
    }

    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    // Các hàm Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWarrantyDate(LocalDate warrantyDate) {
        this.warrantyDate = warrantyDate;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Hàm hiển thị thông tin cơ bản của 1 chiếc điện thoại
    public void infoBasic() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("ID: %s | Tên: %s | Giá: %.0f VND | Bảo hành: %s | Hệ điều hành: %s | Hãng: %s\n", id, name, price, warrantyDate.format(formatter), os, brand);
    }

    // Hàm nhập thông tin cơ bản của 1 chiếc thoại
    public void inputInfoBasic(Scanner sc) {
        System.out.println("=== NHẬP THÔNG TIN ĐIỆN THOẠI ===");
        System.out.print("Nhập tên điện thoại: ");
        name = sc.nextLine();

        System.out.print("Nhập giá bán: ");
        price = sc.nextDouble();
        sc.nextLine();

        System.out.print("Nhập thời gian bảo hành (dd/MM/yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String warrantyStr = sc.nextLine();
        warrantyDate = LocalDate.parse(warrantyStr, formatter);
        sc.nextLine();

        System.out.print("Nhập hệ điều hành (Android/iOS): ");
        os = sc.nextLine();

        System.out.print("Nhập hãng sản xuất: ");
        brand = sc.nextLine();
    }

    // Hàm abstract
    public abstract String generateId();
    public abstract void displayInfo();
    public abstract void input(Scanner sc);
    public abstract void update(Scanner sc);
}
