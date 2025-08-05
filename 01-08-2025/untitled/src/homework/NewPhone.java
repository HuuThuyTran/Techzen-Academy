package homework;

import java.time.LocalDate;
import java.util.Scanner;

public class NewPhone extends Phone {
    private int quality;
    private static int countNewPhone = 0;

    public NewPhone(String name, double price, LocalDate warrantyDate, String os, String brand, int quality) {
        super(name, price, warrantyDate, os, brand);
        this.quality = quality;
        setId(generateId());
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public String generateId() {
        return String.format("DTM%03d", ++countNewPhone);
    }

    @Override
    public void displayInfo() {
        super.infoBasic();
        System.out.println("Số lượng: " + quality + " chiếc");
    }

    @Override
    public void input(Scanner sc) {
        super.inputInfoBasic(sc);
        System.out.print("Nhập số lượng: ");
        quality = sc.nextInt();
    }

    @Override
    public double totalPrice() {
        return this.getPrice() * this.getQuality();
    }
}
