package homework;

public class Personnel {
    private String name;
    private int age;
    private int numberOfWorkingHours;
    private int numberOfEmployees;

    public Personnel() {
    }

    public Personnel(String name, int age, int numberOfWorkingHours, int numberOfEmployees) {
        this.name = name;
        this.age = age;
        this.numberOfWorkingHours = numberOfWorkingHours;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWorkingHours() {
        return numberOfWorkingHours;
    }

    public void displayInfo() {
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Số giờ làm việc: " + numberOfWorkingHours + " giờ");
        System.out.println("Số lượng nhân sự: " + numberOfEmployees);
    }
}
