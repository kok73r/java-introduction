package dream.team.homework.lesson13.realty;

public class IndustrialRealEstate extends Realty {


    protected IndustrialRealEstate(int totalArea, int taxK) {
        super(totalArea, taxK);
    }

    @Override
    public String toString() {
        return "IndustrialRealEstate { " +
                "totalArea = " + totalArea +
                ", taxK = " + taxK +
                '}';
    }
}

