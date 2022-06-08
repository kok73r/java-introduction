package dream.team.homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TransposingMatrix {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter size of MultiArray: rows, colums");

        int[][] matrix = createAndFillMultiArray();
        printMultiArray(matrix);
        int[][] transposeMatrix = transposingMatrix(matrix);
        printMultiArray(transposeMatrix);

    }

    public static int[][] createAndFillMultiArray() throws IOException {
        int rows = Integer.parseInt(READER.readLine());
        int colums = Integer.parseInt(READER.readLine());
        int[][] array = new int[rows][colums];
        System.out.println("Enter values of array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(READER.readLine());
            }
            System.out.println();
        }
        return array;
    }

    public static void printMultiArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposingMatrix(int[][] array) {
        int[][] transArray = new int[array[0].length][array.length];
        for (int i = 0; i < transArray.length; i++) {
            for (int j = 0; j < transArray[i].length; j++) {
                transArray[i][j] = array[j][i];
            }
        }
        return transArray;
    }
}
