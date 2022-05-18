package dream.team.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RandomNumber {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int min = 0;
        int max = 10;
        int randomNumber = (int) (min + Math.random() * max);
        System.out.println(randomNumber);
        System.out.println("Enter number from 0 to 10: ");

        int enteredNumber = Integer.parseInt(reader.readLine());
        while (enteredNumber != randomNumber) {
            System.out.println("Your entered number " + enteredNumber + " wrong ");
            enteredNumber = Integer.parseInt(reader.readLine());
        }
        System.out.println("Congratulation you win!");
    }
}




