import java.util.Arrays;

public class Bai4 {
    // Bài 4:
    static int[] findPrimeNumber(int[] arr) {
        int[] arr2 = new int[arr.length];
        int[] arrTemp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 2 || arr[i] % 2 == 0) {
                arrTemp[i] = arr[i];
            } else {
                arr2[i] = arr[i];
            }
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 23, 8, 47, 10, 3};
        System.out.println("Mảng: " + Arrays.toString(findPrimeNumber(arr)).replace("0, ", ""));
    }
}
