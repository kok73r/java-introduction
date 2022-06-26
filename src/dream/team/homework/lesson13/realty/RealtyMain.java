package dream.team.homework.lesson13.realty;

import java.util.ArrayList;
import java.util.List;

public class RealtyMain {
    public static void main(String[] args) {

        int subsidies = 15;
        int revenue = 1500;
        int taxK = 30;
        int totalFlatArea = 52;
        int totalShopArea = 150;
        int totalFactoryArea = 300;


        Realty resident = new ResidentialRealEstate(totalFlatArea, taxK, subsidies);
        Realty shop = new CommercialRealEstate(totalShopArea, taxK, revenue);
        Realty factory = new IndustrialRealEstate(totalFactoryArea, taxK);

        List<Realty> realEstateObjects = new ArrayList<>();
        realEstateObjects.add(resident);
        realEstateObjects.add(shop);
        realEstateObjects.add(factory);

        showObjectsTax(realEstateObjects);
    }

    public static void showObjectsTax(List<Realty> realEstateObjects) {
        for (Realty realty : realEstateObjects) {
            System.out.println(realty.calculateTax() + " grn");
        }
    }
}
