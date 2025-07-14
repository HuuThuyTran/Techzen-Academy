package bai_tap_chieu;

import java.util.Scanner;

public class FractionNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số n: ");
        int n = sc.nextInt();

        double sum = 0.0;

        for (double i = 1; i <= n; i++) {
            sum += ((double) 1 / i);
        }
        System.out.println("Tổng các số thập phân: " + sum);
    }
}
