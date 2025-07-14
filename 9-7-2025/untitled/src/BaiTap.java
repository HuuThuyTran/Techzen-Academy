import java.util.Scanner;

public class BaiTap {
    static void questions() {
        System.out.println("a. Trả về số đảo của số đó");
        System.out.println("b. Có phải số đối xứng ko (T/F)");
        System.out.println("c. Có phải là số chính phương");
        System.out.println("d. Có phải số nguyên tố");
        System.out.println("e. Tổng các số lẻ");
        System.out.println("f. Tổng các số nguyên tô");
        System.out.println("g. Tổng các số chính phương");
    }

    static int returnInvertedNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    static boolean checkSymmetricalNumber(int n) {
        String str = String.valueOf(n);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    static boolean checkMainNumber(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    static boolean checkPrimeNumber(int n) {
        if (n < 2) return false;
        for (int i = 0; i < Math.sqrt(n); i++) {
            if (i % 2 == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a.
        System.out.print("a. Nhập số nguyên dương: ");
        int n = sc.nextInt();
        System.out.println("Số đảo ngược: " + returnInvertedNumber(n));

        // b.
        System.out.print("b. Nhập số nguyên dương: ");
        int n1 = sc.nextInt();
        System.out.println("Kiểm tra có phải số đối xứng: " + checkSymmetricalNumber(n1));

        // c.
        System.out.println("c. Kiểm tra số chính phương: ");
        System.out.println("Kiểm tra số chính phương: " + checkMainNumber(n));

        // d.
        System.out.println("d. Kiểm tra số nguyên tố: ");
        System.out.println("Kiểm tra số nguyên tố: " + checkPrimeNumber(n));

        // e.

    }
}
