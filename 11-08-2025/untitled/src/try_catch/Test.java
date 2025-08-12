package try_catch;

import java.util.Scanner;

public class Test {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        bai1();
        bai2();
    }

    // Bài 1
    static void bai1() {
        System.out.println("=== Bài 1 ===");
        int n;
        while (true) {
            try {
                System.out.print("Nhập một số n: ");
                n = Integer.parseInt(sc.nextLine());

                if (n < 0) {
                    throw new IllegalArgumentException("Không thể tính căn bậc hai của số âm");
                }

                double sqrt = Math.sqrt(n);
                System.out.println("Căn bậc hai: " + sqrt);
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Lỗi nhập chữ cái");
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi nhập số âm");
            } finally {
                System.out.println("Chương trình kết thúc");
            }
        }
    }

    // Bài 2
    static double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho 0");
        }
        return (double) a / b;
    }

    static void bai2() {
        System.out.println("=== Bài 2 ===");
        while (true) {
            try {
                System.out.print("Nhập số a: ");
                int a = sc.nextInt();

                System.out.print("Nhập số b: ");
                int b = sc.nextInt();

                double result = divide(a, b);
                System.out.println("Kết quả: " + result);
                break;
            } catch (ArithmeticException arithmeticException) {
                System.out.println("Lỗi: " + arithmeticException.getMessage());
            } finally {
                System.out.println("Chương trình kết thúc");
            }
        }
    }
}
