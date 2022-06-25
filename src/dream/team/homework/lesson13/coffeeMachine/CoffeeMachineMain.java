package dream.team.homework.lesson13.coffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeMachineMain {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Drink espresso = new Espresso();
        Drink americano = new Americano();
        Drink cappuccino = new Cappuccino();
        Drink latte = new Latte();
        Drink teaBlack = new Tea("Black Tea");
        Drink teaGreen = new Tea("Green Tea");
        latte.cooking();
        DrinkType teaBlack1 = DrinkType.TEA_BLACK;
        System.out.println(teaBlack1);
        System.out.println(espresso);
        System.out.println(americano);
        System.out.println(cappuccino);
        System.out.println(latte);
        System.out.println(teaBlack);
        System.out.println(teaGreen);
        String type = READER.readLine();
                System.out.println();
        System.out.println();
    }

    public enum DrinkType {
        ESPRESSO,
        AMERICANO,
        LATTE,
        CAPPUCCINO,
        TEA_BLACK,
        TEA_GREEN
    }


}
