package dream.team.homework.algorithmic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShiftArray {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter arrays size: ");
        int size = Integer.parseInt(READER.readLine());
        int[] array = new int[size];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        int shiftArray = 2;

        shiftArrayRight(array,shiftArray);
        System.out.println(Arrays.toString(array));

        shiftArrayLeft(array, shiftArray);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(int[] array) {
        System.out.println("Filled array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }

    public static void shiftArrayRight(int[] array, int shift) {
        for (int i = 0; i < array.length + shift; i++) {
            int index = 0;
            for (int j = 0; j < array.length; j++) {
                int temp = array[j];
                array[j]= array[index];
                array[index] = temp;
            }
        }
    }

    public static void shiftArrayLeft(int[] array, int shift) {
        for (int i = 0; i < array.length - shift; i++) {
            int index = 0;
            for (int j = 0; j < array.length; j++) {
                int temp = array[j];
                array[j]= array[index];
                array[index] = temp;
            }
        }
    }
}
