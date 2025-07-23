package lesson_afternoon.bai1;

public class Fraction {
    int numerator;
    int denominator;

    // phương thức nhập tử số và mẫu số
    public void input(int numerator1, int denominator1) {
        numerator = numerator1;
        if (denominator1 != 0) {
            denominator = denominator1;
        } else {
            System.out.println("Mẫu số không được bằng 0");
            denominator = 1; // mặc định mẫu số là 1 nếu nhập sai
        }
    }

    // tìm UCLN của hai số
    private int findGCD(int a, int b) {
        if (b == 0) return Math.abs(a);
        return findGCD(b, a % b);
    }

    // phương thức rút gọn phân số
    public void output() {
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        if (denominator == 1) {
            System.out.println("\u001B[35mRút gọn: " + numerator + "\u001B[35m");
        } else if (denominator == -1) {
            System.out.println("\u001B[35mRút gọn: " + (-numerator) + "\u001B[35m");
        } else {
            System.out.println("\u001B[35mRút gọn: " + numerator + "/" + denominator + "\u001B[35m");
        }
    }

    // phương thức tính tổng của 2 phân số
    public void sumFractions(Fraction fraction1, Fraction fraction2) {
        // Giả sử có hai phân số a/b và c/d
        int a = fraction1.numerator;
        int b = fraction1.denominator;
        int c = fraction2.numerator;
        int d = fraction2.denominator;

        // Tính tổng: (a/b) + (c/d) = (ad + bc) / (bd)
        int numeratorSum = (a * d) + (b * c);
        int denominatorSum = b * d;

        // Rút gọn phân số
        int gcd = findGCD(numeratorSum, denominatorSum);
        numeratorSum /= gcd;
        denominatorSum /= gcd;

        System.out.println("\u001B[34mTổng của hai phân số: " + numeratorSum + "/" + denominatorSum + "\u001B[0m");
    }

    // phương thức tính hiệu của 2 phân số
    public void subFractions(Fraction fraction1, Fraction fraction2) {
        // Giả sử có hai phân số a/b và c/d
        int a = fraction1.numerator;
        int b = fraction1.denominator;
        int c = fraction2.numerator;
        int d = fraction2.denominator;

        // Tính hiệu: (a/b) - (c/d) = (ad - bc) / (bd)
        int numeratorSub = (a * d) - (b * c);
        int denominatorSub = b * d;

        // Rút gọn phân số
        int gcd = findGCD(numeratorSub, denominatorSub);
        numeratorSub /= gcd;
        denominatorSub /= gcd;

        System.out.println("\u001B[34mHiệu của hai phân số: " + numeratorSub + "/" + denominatorSub + "\u001B[0m");
    }

    // phương thức tính tích của 2 phân số
    public void multipFractions(Fraction fraction1, Fraction fraction2) {
        // Giả sử có hai phân số a/b và c/d
        int a = fraction1.numerator;
        int b = fraction1.denominator;
        int c = fraction2.numerator;
        int d = fraction2.denominator;

        // Tính tích: (a/b) * (c/d) = (ac) / (bd)
        int numeratorMultip = a * c;
        int denominatorMultip = b * d;

        // Rút gọn phân số
        int gcd = findGCD(numeratorMultip, denominatorMultip);
        numeratorMultip /= gcd;
        denominatorMultip /= gcd;

        System.out.println("\u001B[34mTích của hai phân số: " + numeratorMultip + "/" + denominatorMultip + "\u001B[0m");
    }

    // phương thức tính tích của 2 phân số
    public void divFractions(Fraction fraction1, Fraction fraction2) {
        // Giả sử có hai phân số a/b và c/d
        int a = fraction1.numerator;
        int b = fraction1.denominator;
        int c = fraction2.numerator;
        int d = fraction2.denominator;

        // Tính thương: (a/b) / (c/d) = (a * d) / (b * c)
        int numeratorDiv = a * d;
        int denominatorDiv = b * c;

        // Rút gọn phân số
        int gcd = findGCD(numeratorDiv, denominatorDiv);
        numeratorDiv /= gcd;
        denominatorDiv /= gcd;

        System.out.println("\u001B[34mThương của hai phân số: " + numeratorDiv + "/" + denominatorDiv + "\u001B[0m");
    }

    // kiểm tra phân số đó là phân số âm hay dương hay bằng 0
    public void checkFraction(Fraction fraction) {
        System.out.println("\u001B[31mKiểm tra phân số: "+ fraction.numerator + "/" + fraction.denominator + "\u001B[0m");
        if (fraction.numerator == 0) {
            System.out.println("\u001B[32mPhân số bằng 0 \u001B[0m");
        } else if (fraction.numerator < 0 && fraction.denominator < 0) {
            System.out.println("\u001B[32mPhân số dương \u001B[32m");
        } else if (fraction.numerator < 0 || fraction.denominator < 0) {
            System.out.println("\u001B[32mPhân số âm \u001B[32m");
        } else if (fraction.denominator == 0) {
            System.out.println("\u001B[32mPhân số không hợp lệ do mẫu số bằng 0 \u001B[0m");
        } else {
            System.out.println("\u001B[32mPhân số dương \u001B[32m");
        }
    }

}
