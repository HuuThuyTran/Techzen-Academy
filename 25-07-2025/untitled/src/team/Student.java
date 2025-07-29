package team;

public class Student {
    private int id;
    private String name;
    private int age;
    private double avgScore;

    private static int autoId = 1;
    private static int countStudent = 0;

    public Student() {
    }

    public Student(String name, int age, double avgScore) {
        this.id = autoId++;
        this.name = name;
        this.age = age;
        this.avgScore = avgScore;

        countStudent++;
    }

    public String getName() {
        return name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        String RESET = "\u001B[0m";
        String GREEN = "\u001B[32m";

        return String.format(GREEN + "%-5d | %-20s | %-5d | %-8.2f" + RESET,
                id, name, age, avgScore);
    }
}
