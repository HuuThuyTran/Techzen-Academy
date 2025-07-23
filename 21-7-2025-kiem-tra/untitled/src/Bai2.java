import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    // Bài 2
    static Scanner sc = new Scanner(System.in);
    static int n;
    static int[] arr;
    static int[] arrSumEven, arrSumOdd;

    static void inputArr() {
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
    }

    static void outputArr() {
        System.out.println("Các phần tử arr: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        System.out.print("Nhập số lượng phần tử n (n <= 20): ");
        n = sc.nextInt();

        if (n > 20 || n < 1) {
            System.out.println("Nhập quá 20 phần tử");
        }

        // Nhập các phần tử mảng
        inputArr();
        // Xuất các phẩn tử mảng
        outputArr();
        // Hiệu của tổng
        int sub;
        sub = calculatorSumEven() - calculatorSumOdd();
        System.out.println("Hiệu của tổng của các số chẵn và lẻ: " + Arrays.toString(arrSumEven).replace("0, ", "") + " + " + Arrays.toString(arrSumOdd).replace("0, ", "") + sub);
    }

    static int calculatorSumEven() {
        int sumEven = 0;
        arrSumEven = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrSumEven[i] = arr[i];
                sumEven += arr[i];
            }
        }
        return sumEven;
    }

    static int calculatorSumOdd() {
        int sumOdd = 0;
        arrSumOdd = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arrSumOdd[i] = arr[i];
                sumOdd += arr[i];
            }
        }
        return sumOdd;
    }
}
