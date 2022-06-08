package dream.team.homework.lesson10;

public class FindNegativeNumbers {

    public static void main(String[] args) {
        int rows = 3;
        int colums = 4;
        int[][] array = new int[rows][colums];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getNumber();
            }
        }
        printMultiArray(array);
        findingNegativeNumbersIndex(array);
    }

    public static int getNumber() {
        int minNumber = -50;
        int maxNumber = 50;
        int randomNumber = (int) (Math.random() * (maxNumber - minNumber) + minNumber);
        return randomNumber;
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
