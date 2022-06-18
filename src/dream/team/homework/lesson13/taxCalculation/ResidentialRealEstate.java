package dream.team.homework.lesson13.taxCalculation;

public class ResidentialRealEstate extends Realty {
    private final int subsidies;

    public ResidentialRealEstate(int totalArea, int taxK, int subsidies) {
        super(totalArea, taxK);
        this.subsidies = subsidies;

    }

    public int calculateTax() {
        if (totalArea > 50) {
            int tax = totalArea * taxK;
            return tax;
        } else {
            int subsidies = (totalArea * taxK) / 100 * 20;
            int tax = (totalArea * taxK) - subsidies;
            return tax;
        }
    }

    @Override
    public String toString() {
        return "ResidentialRealEstate{" +
                "subsidies=" + subsidies +
                ", totalArea=" + totalArea +
                ", taxK=" + taxK +
                '}';
    }
}
