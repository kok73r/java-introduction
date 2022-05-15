package dream.team.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculating {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number, operation and second number: ");
        double number1 = Integer.parseInt(reader.readLine());
        char operation = reader.readLine().charAt(0);
        double number2 = Integer.parseInt(reader.readLine());
        if (number2 == 0 && operation == '/') {
            System.out.println("We can`t divide for 0");
            return;
        }
        double answer = calculating(number1, operation, number2);
        System.out.println("Your answer = " + answer);
    }

    public static double calculating(double num1, char operation, double num2) {
        double result = 0;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            default -> {
                System.out.println("Operation wrong. Try again.");
            }
        }
        return result;
    }
}