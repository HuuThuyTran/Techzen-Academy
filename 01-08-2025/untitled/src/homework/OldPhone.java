package homework;

import java.time.LocalDate;
import java.util.Scanner;


public class OldPhone extends Phone implements Promotion {
    private int batteryStatus;
    private static int countOldPhone = 0;

    public OldPhone(String name, double price, LocalDate warrantyDate, String os, String brand, int batteryStatus) {
        super(name, price, warrantyDate, os, brand);
        this.batteryStatus = batteryStatus;
        setId(generateId());
    }

    public int getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    @Override
    public String generateId() {
        return String.format("DTC%03d", ++countOldPhone);
    }

    @Override
    public void displayInfo() {
        super.infoBasic();
        System.out.println("Tình trạng pin: " + batteryStatus + "%");
    }

    @Override
    public void input(Scanner sc) {
        super.inputInfoBasic(sc);
        System.out.print("Nhập số phần trăm % pin: ");
        batteryStatus = sc.nextInt();
    }

    @Override
    public double totalPrice() {
        return this.getPrice() * this.getBatteryStatus();
    }

    @Override
    public void promote(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Phần trăm giảm giá không hợp lệ cho điện thoại " + getId());
            return;
        }
        double discountAmount = getPrice() * percent / 100;
        setPrice(getPrice() - discountAmount);
    }
}
