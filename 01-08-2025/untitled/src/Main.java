//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new ManagementEmployee();
        Employee employee2 = new ProductionEmployee();

        System.out.println("Salary of Management Employee: " + employee1.calculateSalary());
        System.out.println("Salary of Production Employee: " + employee2.calculateSalary());
    }
}