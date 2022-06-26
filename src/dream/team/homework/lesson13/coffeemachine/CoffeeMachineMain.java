package dream.team.homework.lesson13.coffeemachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
        System.out.println("Enter Buy to confirm your order");
        while (READER.readLine().equals("Buy")) {
            System.out.println("Choose drink: ");
            System.out.println("Americano");
            System.out.println("Espresso");
            System.out.println("Cappuccino");
            System.out.println("Latte");
            System.out.println("Tea black");
            System.out.println("Tea green");
        }
        if (createDrink(DrinkType.valueOf(READER.readLine())) != null) {
            drinks.add(createDrink(DrinkType.valueOf(READER.readLine())));
        }
        return drinks;
    }

    public static Drink createDrink(DrinkType type) {
        Drink drink = switch (type) {
            case AMERICANO -> new Americano();
            case ESPRESSO -> new Espresso();
            case CAPPUCCINO -> new Cappuccino();
            case LATTE -> new Latte();
            case TEA_BLACK -> new Tea("BlackTea");
            case TEA_GREEN -> new Tea("GreenTea");
            default -> throw new IllegalArgumentException();
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
        System.out.println("Your check = " + sum);
    }

}



