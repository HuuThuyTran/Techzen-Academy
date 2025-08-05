import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Bài 1
        int rows = 3;
        for (int i = 0; i < rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" "); // j: x3 (loop: 1)
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*"); // k: x1 (loop: 1)
            }
            System.out.println();
        }
    }
//    // Bài 2
//    static Scanner sc = new Scanner(System.in);
//    static int n;
//    static int[] arr;
//    static int[] arrSumEven, arrSumOdd;
//
//    static void inputArr() {
//        arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Nhập phần tử arr[" + i + "]: ");
//            arr[i] = sc.nextInt();
//        }
//    }
//
//    static void outputArr() {
//        System.out.println("Các phần tử arr: " + Arrays.toString(arr));
//    }
//
//    public static void main(String[] args) {
//        System.out.print("Nhập số lượng phần tử n (n <= 20): ");
//        n = sc.nextInt();
//
//        if (n > 20 || n < 1) {
//            System.out.println("Nhập quá 20 phần tử");
//        }
//
//        // Nhập các phần tử mảng
//        inputArr();
//        // Xuất các phẩn tử mảng
//        outputArr();
//        // Hiệu của tổng
//        int sub;
//        sub = calculatorSumEven() - calculatorSumOdd();
//        System.out.println("Hiệu của tổng của các số chẵn và lẻ: " + Arrays.toString(arrSumEven).replace("0, ", "") + " + " + Arrays.toString(arrSumOdd).replace("0, ", "") + sub);
//    }
//
//    static int calculatorSumEven() {
//        int sumEven = 0;
//        arrSumEven = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                arrSumEven[i] = arr[i];
//                sumEven += arr[i];
//            }
//        }
//        return sumEven;
//    }
//
//    static int calculatorSumOdd() {
//        int sumOdd = 0;
//        arrSumOdd = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                arrSumOdd[i] = arr[i];
//                sumOdd += arr[i];
//            }
//        }
//        return sumOdd;
//    }
//    // Bài 3:
//    static Scanner sc = new Scanner(System.in);
//
//    static int countCharUpper(String string) {
//        int count = 0;
//        String charUpper = string.toUpperCase();
//        for (int i = 0; i < string.length(); i++) {
//            if (string.charAt(i) == charUpper.charAt(i)) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        System.out.print("Nhập 1 chuỗi bất kỳ: ");
//        String str = sc.nextLine();
//
//        System.out.println(countCharUpper(str) == 0 ? "Không tìm thấy ký tự hoa" : ("Số ký tự " + countCharUpper(str)));
//    }
//    // Bài 4:
//    static int[] findPrimeNumber(int[] arr) {
//        int[] arr2 = new int[arr.length];
//        int[] arrTemp = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 2 || arr[i] % 2 == 0) {
//                arrTemp[i] = arr[i];
//            } else {
//                arr2[i] = arr[i];
//            }
//        }
//        return arr2;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 5, 6, 23, 8, 47, 10, 3};
//        System.out.println("Mảng: " + Arrays.toString(findPrimeNumber(arr)).replace("0, ", ""));
//    }
//    // Bài 5
//    public static void main(String[] args) {
//        int[] arr = {20, 20, 20};
//
//        int max1 = arr[0];
//        int max2 = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max1) {
//                max2 = max1;
//                max1 = arr[i];
//            } else if (arr[i] > max2 && arr[i] < max1) {
//                max2 = arr[i];
//            } else {
//                max2 = -1;
//            }
//        }
//
//        System.out.println(max2 == -1 ? "Không tìm thấy số lớn nhì" : ("Số lớn nhì: " + max2));
//    }
}