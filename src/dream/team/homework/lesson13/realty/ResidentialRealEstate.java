package dream.team.homework.lesson13.realty;

public class ResidentialRealEstate extends Realty {
    private final int subsidies;

    public ResidentialRealEstate(int totalArea, int taxK, int subsidies) {
        super(totalArea, taxK);
        this.subsidies = subsidies;

    }

    public int calculateTax() {

        if (totalArea < 70) {
            int tax = (totalArea * taxK) - (totalArea * taxK) * subsidies / 100;
            System.out.print("You have subsidies, ");
            return tax;
        } else {
            {
                return super.calculateTax();
            }
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
