package buoi_5.chieu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.Scanner;

public class Schedule {
    private LocalDate day;
    private String content;

    public Schedule() {
    }

    public Schedule(LocalDate day, String content) {
        this.day = day;
        this.content = content;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        // Nhập ngày
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            System.out.print("Nhập ngày (dd/MM/yyyy): ");
            String dayInput = sc.nextLine().trim();
            try {
                this.day = LocalDate.parse(dayInput, formatter);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Ngày không hợp lệ! Vui lòng nhập đúng định dạng dd/MM/yyyy.\n");
            }
        }

        // Nhập nội dung
        while (true) {
            System.out.print("Nhập nội dung: ");
            this.content = sc.nextLine().trim();
            if (!this.content.isEmpty()) {
                break;
            } else {
                System.out.println("Nội dung không được để trống.\n");
            }
        }
        System.out.println("=> Thêm thành công!");
    }

    public void output() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dayFormatted = (this.getDay() != null) ? this.getDay().format(formatter) : "Chưa có ngày";
        String content = (this.getContent() != null && !this.getContent().isEmpty()) ? this.getContent() : "Chưa có nội dung";

        System.out.println("Ngày: " + dayFormatted);
        System.out.println("Nội dung: " + content);
        System.out.println("---------------------------\n");
    }
}



