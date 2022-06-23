package dream.team.homework.lesson13.taxCalculation;

import java.util.ArrayList;
import java.util.List;

public class RealtyMain {
    public static void main(String[] args) {

        int subsidies = 15;
        int revenue = 90;
        int taxK = 30;
        int totalFlatArea = 49;
        int totalShopArea = 150;
        int totalFactoryArea = 300;


        Realty resident = new ResidentialRealEstate(totalFlatArea, taxK, subsidies);
        Realty shop = new CommercialRealEstate(totalShopArea, taxK, revenue);
        Realty factory = new IndustrialRealEstate(totalFactoryArea, taxK);

        System.out.println(shop.calculateTax());
        System.out.println(resident.calculateTax());
        System.out.println(factory.calculateTax());

        List<Realty> realEstateObjects = new ArrayList<>();
        realEstateObjects.add(resident);
        realEstateObjects.add(shop);
        realEstateObjects.add(factory);

        showObjects(realEstateObjects);
    }

    public static Realty showObjects(List<Realty> realEstateObjects) {
        for (Realty realty : realEstateObjects) {
            System.out.println(realEstateObjects);
            return realty;

        }
        return null;
    }
}
