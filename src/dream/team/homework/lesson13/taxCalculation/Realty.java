package dream.team.homework.lesson13.taxCalculation;

public class Realty {
    protected int totalArea;
    protected int taxK;

    public Realty(int totalArea, int taxK) {
        this.totalArea = totalArea;
        this.taxK = taxK;
    }

    public int calculateTax() {
        int tax = totalArea * taxK;
        return tax;
    }

    @Override
    public String toString() {
        return "Realty{" +
                "totalArea=" + totalArea +
                ", taxK=" + taxK +
                '}';
    }
}
