import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Vd1:
        System.out.print("Nhập số dòng: ");
        int n = sc.nextInt();
        System.out.print("Nhập số cột: ");
        int m = sc.nextInt();

        int [][] arr = new int[n][m];
        System.out.println("Độ dài của arr: " + arr.length);

        System.out.println("Nhập các phần tử trong mảng arr[n][m]:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Xuất các phần tử trong mảng arr[n][m]:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

//        // Vd2:
//        System.out.print("Kiểm tra mảng toàn chẵn: ");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (arr[i][j] % 2 != 0) {
//                    System.out.println("Mảng có 1 số lẻ !");
//                    break;
//                } else {
//                    System.out.println("Mảng toàn chẵn !");
//                }
//            }
//        }
//
//        // Vd3:
//        int[] x = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            int max = arr[i][0];
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//            }
//            x[i] = max;
//        }
//        System.out.println("Mảng X: " + Arrays.toString(x));

        // Vd4:
        int row1 = 2, row2 = 2;
        for (int i = 0; i < arr[row1].length; i++) {
            int temp = arr[row1][i];
            arr[row1][i] = arr[row2][i];
            arr[row2][i] = temp;
        }


    }

    static void swapRows(int[][] matrix, int row1, int row2) {
            int[] temp = matrix[row1];
            matrix[row1] = matrix[row2];
            matrix[row2] = temp;
    }
}