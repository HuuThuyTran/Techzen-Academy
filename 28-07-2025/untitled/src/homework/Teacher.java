package homework;

// Giảng viên
public class Teacher extends Personnel {
    private String subjectTeaching;

    public Teacher() {}

    public Teacher(String name, int age, int numberOfWorkingHours, int numberOfEmployees, String subjectTeaching) {
        super(name, age, numberOfWorkingHours, numberOfEmployees);
        this.subjectTeaching = subjectTeaching;
    }

    public String calculateSalaryOfTeacher() {
        return String.format("%,d VNĐ", getNumberOfWorkingHours() * 200000);
    }

    @Override
    public void displayInfo() {
        System.out.println("===== Thông tin giảng viên =====");
        super.displayInfo();
        System.out.println("Môn giảng dạy: " + subjectTeaching);
        System.out.println("Lương: " + calculateSalaryOfTeacher());
    }
}
