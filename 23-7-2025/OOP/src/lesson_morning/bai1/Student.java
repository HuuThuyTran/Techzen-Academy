package lesson_morning.bai1;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    double calculateAverageScore() {
        return (mathScore + literatureScore) / 2;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nguyen Van A";
        s1.mathScore = 8.5;
        s1.literatureScore = 9.0;
        System.out.println("Information of student:");
        System.out.println("Name: " + s1.name);
        System.out.println("Math Score: " + s1.mathScore);
        System.out.println("Literature Score: " + s1.literatureScore);
        System.out.println("Average Score: " + s1.calculateAverageScore());
    }

}
