package dream.team.homework.algorithmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumOfNumbers {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter arrays size: ");
        int size = Integer.parseInt(READER.readLine());
        int[] array = new int[size];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Set sum of numbers for find: ");
        int sum = Integer.parseInt(READER.readLine());

        sumInArray(array, sum);
    }

    public static void fillArray(int[] array) {
        System.out.println("Filled array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    private static void sumInArray(int[] array, int sum) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (sum - array[i] == array[j]) {
                    System.out.println(" First number index = " + i + " Second number index = " + j);
                }
            }
        }
    }
}

