package dream.team.classwork.lesson8;


import java.io.IOException;

import static dream.team.classwork.lesson8.Array.READER;

public class ArrayReverse {

    public static void main(String[] args) throws IOException {

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(READER.readLine());

        }

        for (int i = numbers.length - 1; i >= 0;i-- ){
            System.out.println(numbers[i]);
        }

    }

}
