package BaiSang;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;

        System.out.print("Nhập a: ");
        a = sc.nextLine();
        System.out.print("Nhập b: ");
        b = sc.nextLine();

        String compare = a.compareTo(b) > 0 ? "a > b" : "b < a";
        System.out.println("So sánh 2 chuỗi a với b: " + compare);
    }
}
