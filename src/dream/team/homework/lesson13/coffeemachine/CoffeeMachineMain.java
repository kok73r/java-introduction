package dream.team.homework.lesson13.coffeemachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

public class CoffeeMachineMain {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        ArrayList<Drink> drinks = orderDrink();
        System.out.println(drinks);
        cooking(drinks);
        totalCheck(drinks);
    }

    public static ArrayList<Drink> orderDrink() throws IOException {
        ArrayList<Drink> drinks = new ArrayList<>();
        System.out.println("For finish the order input [Finish], to add drink [Continue or anything else]");
        while (!(READER.readLine().equalsIgnoreCase("finish"))) {
            System.out.println("Choose drink: \n1)AMERICANO, \n2)ESPRESSO, \n3)CAPPUCCINO, \n4)LATTE, \n5)BLACK_TEA, \n6)GREEN_TEA");
            DrinkType type = inputType();
            drinks.add(createDrink(type));
            System.out.println("For finish the order input [Finish], to add drink [Continue or anything else]");
        }
        return drinks;
    }

    public static Drink createDrink(DrinkType type) {
        Drink drink = switch (type) {
            case AMERICANO -> new Americano();
            case ESPRESSO -> new Espresso();
            case CAPPUCCINO -> new Cappuccino();
            case LATTE -> new Latte();
            case BLACK_TEA -> new Tea("Black Tea");
            case GREEN_TEA -> new Tea("Green Tea");
        };
        return drink;
    }

    public static void cooking(ArrayList<Drink> drinks) {
        for (Drink drink : drinks) {
            drink.cooking();
        }
    }

    public static void totalCheck(ArrayList<Drink> drinks) {
        int sum = 0;
        for (Drink drink : drinks) {
            sum += drink.getPrice();
        }
        System.out.println("Your total check = " + sum + " grn");
    }

    public static DrinkType inputType() throws IOException {
        DrinkType type = null;
        try {
            type = DrinkType.valueOf(READER.readLine().toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid input. Try again:");
            return inputType();
        }
        return type;
    }
}



