package dream.team.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialOfN {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter your number for count:");
        int userNumber = Integer.parseInt(READER.readLine());
        System.out.println(countFactorial(userNumber));

    }

    public static int countFactorial(int number) {
        if (number == 1) {
            return number;
        }
        return number * countFactorial(number - 1);
    }

}