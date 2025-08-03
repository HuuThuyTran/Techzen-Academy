public class ProductionEmployee extends Employee{
    private int numberProducts = 20;


    @Override
    public double calculateSalary() {
        return numberProducts * 100;
    }
}
