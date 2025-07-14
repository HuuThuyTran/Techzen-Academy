import java.util.Scanner;

public class BaiTapBuoiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Nhập TNCT vào kiểu int: ");
//        int TNCT = sc.nextInt();
//
//        double heSo = 1.92;
//        if (TNCT >= 12 && TNCT < 36) {
//            heSo = 2.34;
//            System.out.println("Vào nhánh if thì heSo: " + heSo);
//        } else if (TNCT >= 36 && TNCT < 60) {
//            heSo = 3.0;
//            System.out.println("Vào nhánh if thì heSo: " + heSo);
//        } else if (TNCT >= 60) {
//            heSo = 4.5;
//            System.out.println("Vào nhánh if thì heSo: " + heSo);
//        }
//
//        double luong = heSo * 650000;
//        System.out.println("Tính lương của nhân viên: " + String.format("%,.0f", luong));

        // Nhập số tháng và năm
//        System.out.println("Nhập số tháng (1-12):");
//        int thang = sc.nextInt();
//        System.out.println("Nhập số năm:");
//        int nam = sc.nextInt();
//
//        // Khai báo năm nhuận và ngày
//        boolean namNhuan = (nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0;
//        String ngay;
//
//        // Kiểm tra tháng và năm nhuận
//        if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
//            ngay = "30 ngày";
//        } else if (thang == 2 && namNhuan) {
//            ngay = "29 ngày";
//        } else if (thang == 2) {
//            ngay = "28 ngày";
//        } else {
//            ngay = "31 ngày";
//        }
//
//        // In số ngày trong năm tháng đó
//        if (thang > 12 || thang <= 0 || nam <= 0) {
//            System.out.println("Tháng năm không hợp lệ");
//        } else {
//            System.out.println("Số ngày trong tháng " + thang + " và trong năm " + nam + " đó là: " + ngay);
//        }

//        System.out.print("Nhập 1 chữ cái bất kỳ (không quá 1 chữ): ");
//        String chuCai = sc.nextLine();
//        char chuCaiHoa = ' ';
//
//        if (chuCai.length() != 1) {
//            System.out.println("+) Bạn đã nhập quá 1 chữ cái / hoặc không nhập gì!");
//        } else if (Character.isLetter(chuCai.charAt(0))) {
//            chuCaiHoa = (char) (chuCai.charAt(0) - 32);
//            System.out.println("+) Chữ cái " + chuCai + " thành chữ hoa: " + chuCaiHoa);
//        } else {
//            System.out.println("+) Bạn đã nhập sai!");
//        }

//        System.out.print("Nhập một số nguyên dương bất kỳ: ");
//        int x = sc.nextInt();
//        if (x < 0) {
//            return;
//        }
//        double squareRoot = Math.sqrt(x);
//
//        String result = "";
//        if (squareRoot % 1 == 0) {
//            result = x + " chính là số chính phương";
//        } else {
//            result = x + " không phải là số chính phương";
//        }
//
//        System.out.println(result);

        System.out.print("Nhập ngày: ");
        int ngay = sc.nextInt();

        System.out.print("Nhập tháng: ");
        int thang = sc.nextInt();

        System.out.print("Nhập năm: ");
        int nam = sc.nextInt();


    }
}
