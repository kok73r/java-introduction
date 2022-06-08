package dream.team.classwork.lesson9;

import dream.team.classwork.lesson8.Array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] numbers = new int[100000];
        fill(numbers);


        long start = System.currentTimeMillis();

        //bubblesort(numbers);
        Arrays.sort(numbers);


        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end-start));
        //System.out.println(Arrays.toString(numbers));

    }

    public static void fill(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }

    private static void bubblesort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }
}
