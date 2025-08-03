public class ManagementEmployee extends Employee {
    private double basicSalary = 10;
    private double coefficientSalary = 100;

    @Override
    public double calculateSalary() {
        return basicSalary * coefficientSalary;
    }



}
