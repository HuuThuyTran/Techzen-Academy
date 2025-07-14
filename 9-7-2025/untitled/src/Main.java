import java.util.Scanner;

public class Main {
    // Phương thức tính giai thừa:
    public static int tinhGiaiThua(int n) {
        if (n == 1 || n == 0) return 1;
        return n * tinhGiaiThua(n - 1);
    }
    // Bài 2:
    public static boolean kiemTraSoNguyenTo(int n) {
        if (n > 1 && n % 2 != 0 ) return true;
        return false;
    }

    // Bài 3:
    public static int soSanhHaiSoLonHon(int x, int y) {
        return (x > y) ? x : y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập một nguyên bất kỳ: ");
        int n = sc.nextInt();
        System.out.print("Nhập một nguyên bất kỳ: ");
        int n2 = sc.nextInt();

        // Bài 1:
        System.out.println("Kết quả " + n + "! : " + tinhGiaiThua(n));
        // Bài 2:
        System.out.println("Kiểm tra số " + n + " có phải là số nguyên tố: " + (kiemTraSoNguyenTo(n) ? "phải" : "không phải") );
        // Bài 3:
        System.out.println("So sánh 2 số lớn hơn của " + n + " và " + n2 + ": " + soSanhHaiSoLonHon(n, n2));
    }
}