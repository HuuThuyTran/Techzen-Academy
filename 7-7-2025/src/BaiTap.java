import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Cách 1 -> Dùng if-else
        // System.out.println("Nhập một số từ 1-10:");
        // int number = sc.nextInt();
        String output = "One";

        // Cách 2 -> Dùng switch-case
//        switch (number) {
//            case 2 -> output = "Two";
//            case 3 -> output = "Three";
//            case 4 -> output = "Four";
//            case 5 -> output = "Five";
//            case 6 -> output = "Six";
//            case 7 -> output = "Seven";
//            case 8 -> output = "Eight";
//            case 9 -> output = "Nine";
//            case 10 -> output = "Ten";
//            default -> output = "Not within scope from 1 to 10";
//        }

        // System.out.println("Output: " + output);

//        int a, b, c;
//        a = 10;
//        b = 20;
//        System.out.println("1.0/ Trước: " + "a = " + a + " , " + "b = " + b);
//        // Cách 1: Sử dụng biến tạm
//        c = a;
//        a = b;
//        b = c;
//        System.out.println("2.1/ Sau: " + "a = " + a + " , " + "b = " + b);
//
//        // Cách 2: Không sử dụng biến tạm
//        a += b;
//        b = a - b;
//        a = a - b;
//        System.out.println("2.2/ Sau: " + "a = " + a + " , " + "b = " + b);

//        int num1, num2;
//        System.out.println("Nhập số thứ nhất:");
//        num1 = sc.nextInt();
//        System.out.println("Nhập số thứ hai:");
//        num2 = sc.nextInt();
//
//        // Cách 1: if-else hoặc toán tứ 3 ngôi
//        String max, min;
//        if (num1 > num2) {
//            max = "C1/ Số lớn nhất: " + num1;
//            min = "Số nhỏ nhất: " + num2;
//            System.out.println(max + ", " + min);
//        }
//
//        // Cách 2: sử dụng hàm từ Math
//        int result2 = Math.max(num1, num2);
//        int result3 = Math.min(num1, num2);
//        System.out.println("C2/ Số lớn nhất trong 2 số C2: " + result2);
//        System.out.println("C2/ Số nhỏ nhất trong 2 số C2: " + result3);

//        double a, b, x;
//        System.out.println("Nhập số a:");
//        a = sc.nextDouble();
//        System.out.println("Nhập số b:");
//        b = sc.nextDouble();
//
//        String result = "";
//        if ((a == 0 && b == 0) || (a == 0 && b != 0)) {
//            result = "Vô nghiệm";
//        } else if (a != 0) {
//            x = Math.round((-b / a * 1000) / 1000);
//            result = "Có nghiệm x = " + x;
//        }
//        System.out.printf("Kết quả của PT bậc 1:  " + result);

        double a, b, c, delta;
        System.out.println("Nhập số a:");
        a = sc.nextDouble();
        System.out.println("Nhập số b:");
        b = sc.nextDouble();
        System.out.println("Nhập số c:");
        c = sc.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("PT vô nghiệm");
        } else if (delta == 0) {
            System.out.println("PT có nghiệm kép x1 = x2 = " + (-b / 2 * a));
        } else {
            System.out.println("PT có 2 nghiệm phân biêt: x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)) + ", x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
        }

    }
}
