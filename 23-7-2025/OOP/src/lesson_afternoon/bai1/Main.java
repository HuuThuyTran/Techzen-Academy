package lesson_afternoon.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Khởi tạo biến đối tượng fraction
        Fraction fraction = new Fraction();

        Fraction fraction1 = new Fraction();
        System.out.println("Nhập phân số thứ nhất:");

        // Khởi tạo phân số thứ nhất
        System.out.print("Nhập tử số thứ 1: ");
        fraction1.numerator = sc.nextInt();
        System.out.print("Nhập mẫu số thứ 1: ");
        fraction1.denominator = sc.nextInt();

        Fraction fraction2 = new Fraction();
        System.out.println("Nhập phân số thứ hai:");

        // Khởi tạo phân số thứ hai
        System.out.print("Nhập tử số thứ 2: ");
        fraction2.numerator = sc.nextInt();
        System.out.print("Nhập mẫu số thứ 2: ");
        fraction2.denominator = sc.nextInt();

        // a. In ra phân số rút gọn
        fraction1.input(fraction1.numerator, fraction1.denominator);
        System.out.println("\u001B[33mPhân số thứ nhất: \u001B[33m");
        fraction1.output();
        fraction2.input(fraction2.numerator, fraction2.denominator);
        System.out.println("\u001B[33mPhân số thứ hai: \u001B[33m");
        fraction2.output();

        // b. Tính tổng của phân số
        fraction.sumFractions(fraction1, fraction2);

        // c. Tính hiệu của phân số
        fraction.subFractions(fraction1, fraction2);

        // d. Tính tích của phân số
        fraction.multipFractions(fraction1, fraction2);

        // e. Tính thương của phân số
        fraction.divFractions(fraction1, fraction2);

        // c. Kiểm tra phân số có phải là phân số âm hay dương hay bằng ko
        fraction.checkFraction(fraction1);
        fraction.checkFraction(fraction2);
    }
}
