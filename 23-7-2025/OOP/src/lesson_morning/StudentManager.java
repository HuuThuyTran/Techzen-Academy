package lesson_morning;

public class StudentManager {
    String name;
    int age;
    String hobby;

    public void running() {
        System.out.println("Im running...");
    }

    public static void main(String[] args) {
        StudentManager s1 = new StudentManager();
        s1.name = "Peter";
        s1.age = 22;
        s1.hobby = "Play Football";

        System.out.println("Information of student:");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Hobby: "+ s1.hobby);

        s1.running();

    }

}
