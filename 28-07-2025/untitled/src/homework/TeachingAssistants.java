package homework;

// Trợ giảng
public class TeachingAssistants extends Personnel {
    private String subjectInCharge;

    public TeachingAssistants() {}

    public TeachingAssistants(String name, int age, int numberOfWorkingHours, int numberOfEmployees, String subjectInCharge) {
        super(name, age, numberOfWorkingHours, numberOfEmployees);
        this.subjectInCharge = subjectInCharge;
    }

    public String calculateSalaryOfTeachingAssistants() {
        return String.format("%,d VNĐ", getNumberOfWorkingHours() * 100000);
    }

    @Override
    public void displayInfo() {
        System.out.println("===== Thông tin trợ giảng =====");
        super.displayInfo();
        System.out.println("Bộ môn phụ trách: " + subjectInCharge);
        System.out.println("Lương: " + calculateSalaryOfTeachingAssistants());
    }
}
