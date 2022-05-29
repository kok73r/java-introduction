package dream.team.homework.lesson9;

import java.util.Arrays;

public class ArraySorter {
    public static void main(String[] args) {

        int[] fantasticArray = {3, 6, 0, 4, 0, 3, 0, 8, 5, 0, 0, 1, 2, 8, 6, 9, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0, 4, 0, 5, 0, 8};

        long start = System.currentTimeMillis();
        Arrays.sort(fantasticArray);
        System.out.println(Arrays.toString(fantasticArray));
        long end = System.currentTimeMillis();
        System.out.println("Time1: " + (end - start));

        long start2 = System.currentTimeMillis();

        slowerSorter(fantasticArray);
        System.out.println(Arrays.toString(fantasticArray));
        long end2 = System.currentTimeMillis();
        System.out.println("Time2: " + (end2 - start2));

    }

    private static void slowerSorter(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int trump = array[j];
                    array[j] = array[i];
                    array[i] = trump;
                }
            }
        }
    }
}
