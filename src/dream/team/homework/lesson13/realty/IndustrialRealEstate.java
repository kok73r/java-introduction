package dream.team.homework.lesson13.realty;

public class IndustrialRealEstate extends Realty {


    protected IndustrialRealEstate(int totalArea, int taxK) {
        super(totalArea, taxK);
    }

    public int calculateTax() {
        int tax = totalArea * taxK;
        System.out.print("Tax for factory: ");
        return tax;
    }

    @Override
    public String toString() {
        return "IndustrialRealEstate { " +
                "totalArea = " + totalArea +
                ", taxK = " + taxK +
                '}';
    }
}

