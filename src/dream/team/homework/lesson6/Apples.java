package dream.team.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apples {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Insert count of apples");
        countRemainderApples(Integer.parseInt(reader.readLine()));


    }

    public static void countRemainderApples(int apples) {
        int bigBottle = apples / 5;
        System.out.println("Big Bottles = " + bigBottle);
        int remainderInBigBottle = apples%5;
        int mediumBottle = remainderInBigBottle / 3;
        int remainderMediumBottle =  remainderInBigBottle%3;
        System.out.println("Medium Bottles = " + mediumBottle);
        System.out.println("Small Bottle = " + remainderMediumBottle);
        return ;
    }
}
