package BaiChieu;

import java.util.Scanner;

public class Bai2 {
    // Kiểm tra có đủ 8 ký tự
    static boolean kiemTraDu8KyTu(String password) {
        return password.length() >= 8;
    }

    // Kiểm tra có 1 ký tự đặc biệt
    static boolean kiemTraKyTuDacBiet(String password) {
        String kyTuDacBiet = "@#$%!&*()_+-=[]{}|;:,.<>?";

        for (int i = 0; i < password.length(); i++) {
            char c = kyTuDacBiet.charAt(i);

            for (int j = 0; j < password.length(); j++) {
                if (c == password.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Kiểm tra 1 số
    static boolean kiemTraMotSo(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            for (int j = 0; j < password.length(); j++) {
                if (Character.isDigit(c)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Kiểm tra có 1 chữ hoa, 1 chữ thường
    static boolean kiemTraMotChuHoaHayThuong(String password) {
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            for (int j = 0; j < password.length(); j++) {
                if (Character.isUpperCase(c)) {
                    return true;
                }
            }
        }
        return false;
    }

    static void yeuCauDeBai() {
        System.out.println("==== KIỂM TRA MẬT KHẨU ĐỦ MẠNH ====");
        System.out.println("Đáp ứng đủ điều kiện:");
        System.out.println("1. ít nhất đủ 8 ký tự");
        System.out.println("2. Có ít nhất 1 chữ hoa, 1 chữ thường");
        System.out.println("3. Có 1 số");
        System.out.println("4. Có 1 ký tự đặc biệt (@, #, $, %, !...)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        yeuCauDeBai();
        do {
            System.out.print("Nhập mật khẩu của bạn: ");
            String password = sc.nextLine();

            if (kiemTraDu8KyTu(password) && kiemTraKyTuDacBiet(password) && kiemTraMotSo(password) && kiemTraMotChuHoaHayThuong(password)) {
                System.out.println("=> Thông báo: mật khẩu của bạn mạnh !");
                break;
            } else {
                if (!kiemTraDu8KyTu(password)) {
                    System.out.println("=> Mật khẩu bạn chưa nhập đủ 8 ký tự !");
                } else if (!kiemTraKyTuDacBiet(password)) {
                    System.out.println("=> Mật khẩu của bạn thiếu 1 ký tự đặc biệt !");
                } else if (!kiemTraMotSo(password)) {
                    System.out.println("=> Mật khẩu của bạn thiếu 1 số !");
                } else if (!kiemTraMotChuHoaHayThuong(password)) {
                    System.out.println("=> Mật khẩu của bạn nên có 1 chữ cái viết hoa hoặc viết thường !");
                }
            }
        } while (true);

    }
}
