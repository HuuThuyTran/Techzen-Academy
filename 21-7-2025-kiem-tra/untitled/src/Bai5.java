import java.util.Arrays;

public class Bai5 {
    // Bài 5
    public static void main(String[] args) {
        int[] arr = {19, 20, 32};

        int max1 = arr[0];
        int max2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            } else {
                max2 = -1;
            }
        }

        System.out.println(max2 == -1 ? "Không tìm thấy số lớn nhì" : ("Số lớn nhì: " + max2));
    }
}
