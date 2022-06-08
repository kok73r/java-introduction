package dream.team.classwork.lesson10;

import java.util.Arrays;

public class ArrayShuffle {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shuffle(array);
        System.out.println(Arrays.toString(array));
        
    }

    private static void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp;
            int indexShuffle;
            indexShuffle = (int) Math.random() * array.length;
            swap(array, i, indexShuffle);
        }
    }

    private static void swap(int[] array, int i, int indexShuffle) {
        int temp;
        temp = array[i];
        array[i] = array[indexShuffle];
        array[indexShuffle] = temp;
    }


}
