import java.util.Scanner;

public class Bai3 {
    // Bài 3:
    static Scanner sc = new Scanner(System.in);

    static int countCharUpper(String string) {
        int count = 0;
        String charUpper = string.toUpperCase();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == charUpper.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Nhập 1 chuỗi bất kỳ: ");
        String str = sc.nextLine();

        System.out.println(countCharUpper(str) == 0 ? "Không tìm thấy ký tự hoa" : ("Số ký tự " + countCharUpper(str)));
    }
}
