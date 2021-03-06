package dream.team.homework.lesson13.realty;

public class CommercialRealEstate extends Realty {

    private final int revenue;

    protected CommercialRealEstate(int totalArea, int taxK, int revenue) {
        super(totalArea, taxK);
        this.revenue = revenue;
    }

    public int calculateTax() {
        if (revenue < 100) {
            System.out.println("You don`t pay tax, because your proceed is < 100grn.");
            return 0;
        } else {
            return super.calculateTax();
        }
    }

    @Override
    public String toString() {
        return "CommercialRealEstate{" +
                "revenue=" + revenue +
                ", totalArea=" + totalArea +
                ", taxK=" + taxK +
                '}';
    }
}

