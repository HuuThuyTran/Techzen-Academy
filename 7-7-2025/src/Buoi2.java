import java.util.Scanner;

public class Buoi2 {
    public static void main(String[] args) {
//        cách format code: Ctrl + Alt + L

//        Làm bài tập:
        int diem;
        String giaTri = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập điểm của bạn vào:");
        diem = sc.nextInt();

        switch (diem) {
            case 1: giaTri = " Trung bình yếu"; break;
            case 2: giaTri = " Trung bình"; break;
            case 3: giaTri = "Khá"; break;
            default: giaTri = "Giỏi";
        }

        System.out.println(giaTri);
    }
}
