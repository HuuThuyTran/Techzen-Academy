package bai_tap_chieu;

import java.util.Scanner;

public class PrintOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số n: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }
    }
}
