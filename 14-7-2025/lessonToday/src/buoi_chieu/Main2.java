package buoi_chieu;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    static Scanner sc = new Scanner(System.in);

    static void enterArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập các phần từ thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }

    static void printArray(int[] arr, int deBai) {
        switch (deBai) {
            case 1 -> System.out.println("1. Mảng sau khi sửa: " + Arrays.toString(arr));
            case 2 -> System.out.println("2. Mảng sau khi chèn: " + Arrays.toString(arr));
            default -> System.out.println("In mảng: " + Arrays.toString(arr));
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[5];

        enterArray(arr, sc);
        printArray(arr, 0);

        // a.
        for (int i = 0; i < arr.length; i++) {
            if (isPrimeNumber(arr[i])) arr[i] = 0;
        }
        printArray(arr, 1);
    }

    static boolean isPrimeNumber(int n) {
        if (n <= 1 || n % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
