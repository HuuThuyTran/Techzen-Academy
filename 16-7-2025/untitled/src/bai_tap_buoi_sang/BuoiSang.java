package bai_tap_buoi_sang;

import java.util.Scanner;

public class BuoiSang {
    static Scanner sc = new Scanner(System.in);

    static void baiA() {
        System.out.print("Nhập số dòng: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("Độ dài của arr: " + arr.length);

        System.out.println("Nhập các phần tử trong mảng arr[n][m]:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Xuất các phần tử trong mảng arr[n][m]:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // a.
        baiA();

        // b.





    }

    static void baiB() {
        int[][] matrix = {
                {1, 2, 3},
                {3, 4, 6},
                {7, 8, 9},
        };

        

    }
}
