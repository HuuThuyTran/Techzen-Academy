package BTVN;

import java.util.Scanner;

public class BTVN {
    public static void main(String[] args) {
        // In từ 1 -> n. Output: 1, 2, 3, 4, 5, ..., n
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập 1 số n: ");
        int n = sc.nextInt();

//        int i = 1;
//        for (; i < n; i++) {
//            System.out.print(i + ", ");
//        }
//        System.out.println(i);

        // In từ 1 -> n. Output: 1, 3, 5, 7, ..., n
//        int i = 1;
//        for (; i < n; i += 2) {
//            System.out.print(i + ", ");
//        }
//        System.out.println(i);
        // In dãy số 2, -4, 6, -8, ... n
//        for (int i = 2; i < n; i += 2) {
//            if (i % 4 == 0) System.out.print(-i + " ");
//            else System.out.print(i + " ");
//        }
        // In dãy số 2 4 -6 8 10 -12 ...
        // C1:
//        for (int i = 2; i < n; i += 2) {
//            if (i % 6 == 0) System.out.print(-i + " ");
//            else System.out.print(i + " ");
//        }
        // C2:
//        int distance = 3;
//        int count = 0;
//        for (int i = 2; i < n; i+=2) {
//            if (++count % distance == 0) {
//                System.out.print(-i + " ");
//            }
//            else System.out.print(i + " ");
//        }
        // In dãy số 2 -4 6 8 -10 12 14 16 -18 … n
//        int distance = 2;
//        int count = 0;
//
//        for (int i = 2; i < n; i += 2) {
//            if (++count == distance) {
//                distance++;
//                count = 0;
//                System.out.print(-i + " ");
//            }
//            else System.out.print(i + " ");
//        }
        // In số fibonacci
//        int a = 0; int b = 1;
//        int i, next;
//        for (i = 0; i < n; i++) {
//            next = a + b;
//            System.out.print(next + " ");
//            a = b;
//            b = next;
//        }
        // Tính tổng S= 1 + 1/2 + 1/3 +.... + 1/n
//        double s = 0;
//        for (int i = 1; i <= n; i++) {
//            s += 1.0 / i;
//        }
//        System.out.println("Tổng S = " + s);
        // Tính tổng T = 1 + 1/3! + … + 1/(2n-1)!)
//        double t = 0;
//        int i, factorial = 1;
//        for (i = 1; i <= n; i++) {
//            t += (1.0 / factorial);
//            factorial *= (i * 2) * (i * 2 + 1);
//        }
//        System.out.println("Tổng T: " + t);
        // Tìm Ưóc số lơn nhất
//        int a, b;
//        System.out.print("Nhập số a: ");
//        a = sc.nextInt();
//        System.out.print("Nhập số b: ");
//        b = sc.nextInt();
//        int min = Math.min(a, b);
//
//        for (int i = min; ; i--) {
//            if (a % i == 0 && b % i == 0) {
//                System.out.println("ước số chung lớn nhất: " + i);
//                break;
//            }
//        }
//        // Tìm Bội số nhỏ nhất
//        for (int i = min; ; i++) {
//            if (i % a == 0 && i % b == 0) {
//                System.out.println("bội số chung nhỏ nhất: " + i);
//                break;
//            }
//        }
        // Tính tổng S = a! + b! + c!
//        long a = 2, b = 3, c = 4;
//        long s = factorial(a) + factorial(b) + factorial(c);
//        System.out.println("Tổng S = " + s);


        // In hình chữ nhật
        System.out.println("Hình chữ nhật");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        // In hình sao: hình a
        System.out.println("Hình a");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }// In hình sao: hình b
        System.out.println("Hình b");
        for (int i = 1; i <= n; i++) { // i: 1, 2, 3, 4, 5
            for (int j = 1; j <= n; j++) { // j: 1, 2, 3, 4, 5 (x5)
                if (i == 1 || i == n || j == n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        // In hình sao: hình c
        System.out.println("Hình c");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == 5 || i == n) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
        // In hình tam giác
        System.out.println("Hình tam giác");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // In hình tam giác: b
        System.out.println("Hình b");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // In hình tam giác: c
        System.out.println("Hình c");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((j <= n - i) ? " " : "*");
            }
            System.out.println();
        }
        // In hình tam giác: d
        System.out.println("Hình d");

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print((i == 0 || j == 1 || j == n - i) ? "*" : " ");
            }
            System.out.println();
        }
        // In hình tam giác: e
        System.out.println("Hình e");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                System.out.print((n - i <= j && j <= n + i) ? "*" : " ");
            }
            System.out.println();
        }
    }
}
