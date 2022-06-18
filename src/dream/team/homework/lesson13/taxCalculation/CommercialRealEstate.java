package dream.team.homework.lesson13.taxCalculation;

public class CommercialRealEstate extends Realty {

    private final int revenue;

    protected CommercialRealEstate(int totalArea, int taxK, int revenue) {
        super(totalArea, taxK);
        this.revenue = revenue;
    }

    public int calculateTax() {
        int sizeOfRevenue = 100;
        int percentageOfRevenue = sizeOfRevenue / 100 * 5;
        if (revenue < sizeOfRevenue) {
            System.out.println("You don`t pay tax, because your proceed is < 100grn.");
            return 0;
        } else {
            int tax = (totalArea * taxK) + percentageOfRevenue;
            return tax;
        }
    }
}

