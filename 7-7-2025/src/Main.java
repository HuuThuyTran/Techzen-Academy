import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String output1 = "Số chẵn", output2 = "Yếu", output3 = "Thứ ";

        // Bài 1:
        System.out.println("Nhập một số bất kỳ cho bài 1:");
        int number1 = sc.nextInt();
        if (number1 % 2 != 0) {
            output1 = "Số lẻ";
        }
        System.out.println("Bài 1: " + output1);

        // Bài 2:
        System.out.println("Nhập một số bất kỳ cho bài 2:");
        int number2 = sc.nextInt();
        if (number2 >= 5) {
            output2 = "Trung bình";
        } else if (number2 >= 6.5) {
            output2 = "Khá";
        } else if (number2 >= 8){
            output2 = "Giỏi";
        }
        System.out.println("Bài 2: " + output2);

        // Bài 3:
        System.out.println("Nhập số thứ tự ngày trong tuần cho bài 3:");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                output3 += day;
                break;
            case 2:
                output3 += day;
                break;
            case 3:
                output3 += day;
                break;
            case 4:
                output3 += day;
                break;
            case 5:
                output3 += day;
                break;
            case 6:
                output3 += day;
                break;
            case 7:
                output3 = "Chủ nhật";
                break;
            default:
                output3 = "Không ngày nào cả";
                break;
        }
        System.out.println("Bài 3: " + output3);
    }
}