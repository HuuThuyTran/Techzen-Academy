import java.util.Scanner;

public class BaiTapBuoiSang {
    public static void chuyenChuHoaSangThuong(char c) {
        System.out.println(c + " chuyển sang chữ thường: " + (char) (c + 32));
    }

    public static void giaiPhuongTrinhBacNhat(int a, int b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT có vô số nghiệm");
            } else {
                System.out.println("PT vô nghiệm");
            }
        } else {
            System.out.println("PT có nghiệm là: " + (-b / a));
        }
    }

    public static void giaiPhuongTrinhBacHai(int a, int b, int c) {
        double x1, x2;
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.print("PT vô nghiệm");
        } else if (delta == 0) {
            System.out.println("PT có nghiệm kép: x1 = x2 = " + (-b / (2 * a)));
        } else {
            x1 = (-b + Math.sqrt(delta) / (2 * a));
            x2 = (-b - Math.sqrt(delta) / (2 * a));
            System.out.println("PT có 2 nghiệm phân biệt: x1 = " + x1 + " x2 = " + x2);
        }
    }

    public static int returnMinNumber(int x, int y, int z, int t) {
        int min = Math.min(x, y);
        min = Math.min(min, z);
        min = Math.min(min, t);
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A.
        System.out.print("Nhập 1 ký tự in hoa: ");
        char kyTu = sc.nextLine().charAt(0);
        chuyenChuHoaSangThuong(kyTu);
        // B.
        System.out.println("Giải phương trình bậc 1:");
        giaiPhuongTrinhBacNhat(2, 3);
        // C.
        System.out.println("Giải phương trình bậc 2");
        giaiPhuongTrinhBacHai(2, 7, 3);
        // D.
        System.out.println("Giá trị nhỏ nhất: " + returnMinNumber(82, 54, 64, 39));
    }
}
