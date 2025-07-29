package lesson_morning;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 23, "123 Main Street");
        System.out.println("Name: " + Student.name);
        System.out.println("Age: " + Student.age);
        System.out.println("Address: " + Student.address);
    }
}
