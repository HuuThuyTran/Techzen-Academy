package lesson_afternoon;

public class Teacher {
    private String fullName;
    private int age;
    private String subject;
    private int hourInMonth;
    private static int totalTeacher;

    public Teacher(String fullName, int age, String subject, int hourInMonth) {
        this.fullName = fullName;
        this.age = age;
        this.subject = subject;
        this.hourInMonth = hourInMonth;
        totalTeacher++;
    }

    public void showInfo() {
        System.out.println("Teacher Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Hours in Month: " + hourInMonth + " hours / month");
    }

    static void showTotalNumberOfTeachers() {
        System.out.println("Total number of teachers: " + totalTeacher);
    }

    public String getFullName() {
        return fullName;
    }

    public int getHourInMonth() {
        return hourInMonth;
    }
}
