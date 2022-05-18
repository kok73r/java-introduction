package dream.team.homework.lesson7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UnluckyNumbers {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {
            if ( i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {
                continue;
            }
                System.out.println("i = " + i);
        }
    }
}
