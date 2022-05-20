package dream.team.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Palindrome {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int size = 3;

        String[] array = new String[size];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        checkReverseArray(array);

    }

    public static boolean checkReverseArray(String[] array) throws IOException {
        int[] numbers = new int[Integer.parseInt(reader.readLine())];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
            System.out.println(numbers[i]);
        }
        int[]numbersRevers = new int[numbers[Integer.parseInt(reader.readLine())]];
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbersRevers[i]);
        }
        if (numbers!=numbersRevers)
            System.out.println("Your array palindrome");
        else System.out.println("Your array palindrome");
        return true;
    }
    public static void fillArray(String[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();

        }
    }
}
