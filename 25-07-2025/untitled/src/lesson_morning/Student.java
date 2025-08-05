package lesson_morning;

// Kỹ thuật: Alt + Insert

public class Student {
    static String name;
    static int age;
    static String address;

    public Student(String name, int age) {
        Student.name = name;
        Student.age = age;
    }

    public Student(String name, int age, String address) {
        this(name,age);
        Student.address = address;
    }
}