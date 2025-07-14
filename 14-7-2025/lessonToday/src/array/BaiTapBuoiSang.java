package array;

import java.util.Scanner;

public class BaiTapBuoiSang {

    static void enterArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập các phần từ thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
    }

    static void printArray(int[] arr) {
        for (int newArr : arr) {
            System.out.print(newArr + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Bài 1
        enterArray(arr, sc);
        printArray(arr);

        // Bài 2
        String checkArray;
        // a.
        checkArray = isArrayEvenNumber(arr) ? "Có" : "Không";
        System.out.println("Mảng có phải là mảng toàn số chẵn ko: " + checkArray);
        // b.
        checkArray = isArrayPrimeNumber(arr) ? "Có" : "Không";
        System.out.println("Mảng có phải là mảng toàn số nguyên tố ko: " + checkArray);
        // c.
        checkArray = isArrayIncrease(arr) ? "Có" : "Không";
        System.out.println("Mảng có phải là mảng tăng dần ko: " + checkArray);
    }

    static boolean isArrayEvenNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                return false;
        }
        return true;
    }

    static boolean isArrayPrimeNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 || arr[i] == 1) return false;
        }
        return true;
    }

    static boolean isArrayIncrease(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }
        return true;
    }

}
