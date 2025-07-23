package lesson_afternoon.bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Tạo một biến đối tượng planeOXY để tính khoảng cách giữa hai điểm I, M
        PlaneOXY planeOXY = new PlaneOXY();

        // Nhập tọa độ của điểm I
        PlaneOXY I = new PlaneOXY();

        System.out.print("Nhập tọa độ x của điểm I: ");
        int x1 = sc.nextInt();
        System.out.print("Nhập tọa độ y của điểm I: ");
        int y1 = sc.nextInt();
        I.input(x1, y1);

        // Nhập tọa độ của điểm M
        PlaneOXY M = new PlaneOXY();

        System.out.print("Nhập tọa độ x của điểm M: ");
        int x2 = sc.nextInt();
        System.out.print("Nhập tọa độ y của điểm M: ");
        int y2 = sc.nextInt();
        M.input(x2, y2);

        double distance = planeOXY.distanceBetweenTwoPoints(I, M);
        System.out.println("Khoảng cách giữa hai điểm I, M là: " + distance);
    }
}
