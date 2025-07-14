import java.util.Scanner;

public class Main {
    static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static boolean checkArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    static int findLastIndex(int[] arr, int x) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                index = (i + 1);
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Bài 1:
        int[] arr = new int[5];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử mảng vị trí " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("+ Xuất giá trị của mảng: ");
        show(arr);
        // Bài 2:
        System.out.println("+ Kiểm tra mảng có toàn chẵn hay không: " + checkArr(arr));
        // Bài 3:
        System.out.println("+ Tổng: " + sum(arr));
        // Bài 4:
        System.out.print("Nhập số x cần tìm: ");
        int x = sc.nextInt();
        System.out.println("+ Vị trí cuối cùng của phần tử " + x + ": " + findLastIndex(arr, x));
    }
}