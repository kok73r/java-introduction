package dream.team.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculating {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your number, operation and second number: ");
        int number1 = Integer.parseInt(reader.readLine());
        char operation = in.readLine().charAt(0);
        int number2 = Integer.parseInt(reader.readLine());
        if(number2==0){
            System.out.println("We can`t divide for 0");
        }
        int answer = calculating(number1, number2, operation);


        System.out.println("Your answer = " + answer);

    }

    public static char getOperation() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char operation;
        if (in.readLine().isEmpty()) {
            operation = in.readLine().charAt(0);
        } else {
            in.readLine();
            operation = getOperation();
        }
        return operation;
    }

    public static int calculating(int num1, int num2, char operation) throws IOException {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Operation wrong. Try again.");
                result = calculating(num1, num2, getOperation());
        }
        return result;
    }
}
