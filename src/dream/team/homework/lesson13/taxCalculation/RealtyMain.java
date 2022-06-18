package dream.team.homework.lesson13.taxCalculation;

import java.util.ArrayList;
import java.util.List;

public class RealtyMain {
    public static void main(String[] args) {

        int taxK = 30;
        int totalFlatArea = 20;
        int totalShopArea = 150;
        int totalFactoryArea = 300;


        Realty resident = new ResidentialRealEstate(totalFlatArea, taxK, 5);
        Realty shop = new CommercialRealEstate(totalShopArea, taxK, 150);
        Realty factory = new IndustrialRealEstate(totalFactoryArea, taxK);

        System.out.println(shop.calculateTax());
        System.out.println(resident.calculateTax());
        System.out.println(factory.calculateTax());

        List<Realty> realEstateObjects = new ArrayList<>();
        realEstateObjects.add(resident);
        realEstateObjects.add(shop);
        realEstateObjects.add(factory);

       /* System.out.println(checkObjects(realEstateObjects));*/
    }

   /* public static Realty checkObjects(List<Realty> realEstateObjects) {
         for (Realty realty:realEstateObjects) {
            realty.calculateTax();
             return realty;
        }

        return null;
    }*/
}
