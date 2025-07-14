package bai_tap_chieu;

import java.util.Scanner;

public class ConvertBinaryNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương n: ");
        int n = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (n > 0) {
            int phanDu = n % 2;
            n = n / 2;
            output.insert(0, phanDu);
        }

        System.out.println("output: " + output);
    }
}
