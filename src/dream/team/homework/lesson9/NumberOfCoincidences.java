package dream.team.homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NumberOfCoincidences {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int countOfNumbersInArray = 7;
        int[] randomArray = new int[countOfNumbersInArray];
        fillRandomArray(randomArray);
        int[] usersArray = new int[countOfNumbersInArray];
        System.out.println("Input 7 numbers from 0 to 9: ");
        fillUserArray(usersArray);
        Arrays.sort(randomArray);
        Arrays.sort(usersArray);
        System.out.println(Arrays.toString(randomArray));
        System.out.println(Arrays.toString(usersArray));
        System.out.println(counterOfCoincidences(randomArray, usersArray));

    }

    public static int counterOfCoincidences(int[] number1, int[] number2) {
        int counter = 0;
        for (int i = 0; i < number1.length; i++) {
            if (number1[i] == number2[i]) {
                counter++;
            }
        }
        return counter;
    }

    public static void fillRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    public static void fillUserArray(int[] array) {
        int minEnteredNumber = 0;
        int maxEnteredNumber = 9;
        for (int i = 0; i < array.length; i++) {
            array[i] = readNumber(minEnteredNumber, maxEnteredNumber);

        }
    }

    public static int readNumber(int min, int max) {
        System.out.println("input number:");
        try {
            int number = Integer.parseInt(READER.readLine());
            if (number < min || number > max) {
                System.out.println("input number must be in range from " + min + " to " + max);
                return readNumber(min, max);
            }
            return number;
        } catch (Exception e) {
            System.out.println("incorrect input");
            return readNumber(min, max);
        }
    }
}
