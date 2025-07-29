package lesson_afternoon.bai2;

public class PlaneOXY {
    double x;
    double y;

    public void input(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public double distanceBetweenTwoPoints(PlaneOXY point1, PlaneOXY point2) {
        double expression = Math.pow(point2.x - point1.x, 2) + Math.pow(point2.y - point1.y, 2);
        return Math.sqrt(expression);
    }
}
