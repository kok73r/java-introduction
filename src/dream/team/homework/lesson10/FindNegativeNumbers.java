package dream.team.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindNegativeNumbers {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Enter array size: rows and colums");
        int rows = Integer.parseInt(READER.readLine());
        int colums = Integer.parseInt(READER.readLine());
        int[][] array = createAndFillArray(rows, colums);
        printMultiArray(array);
        findingNegativeNumbersIndex(array);
    }

    private static int[][] createAndFillArray(int rows, int colums) {
        int[][] array = new int[rows][colums];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getNumber();
            }
        }
        return array;
    }

    public static int getNumber() {
        int minNumber = -50;
        int maxNumber = 50;
        return (int) (Math.random() * (maxNumber - minNumber) + minNumber);
    }

    public static void printMultiArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void findingNegativeNumbersIndex(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int cellContent = array[i][j];
                if (cellContent < 0)
                    System.out.println(cellContent);
            }
        }
    }
}
