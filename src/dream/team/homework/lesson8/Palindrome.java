package dream.team.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Palindrome {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int size = 4;
        String[] array = new String[size];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(checkReverseArray(array));
    }
//Винести в метод перевертання масиву.
// Користувач вводив цілістну строку і розбити на масив. Все привести в 1 регістр і видалити пробіли

    public static boolean checkReverseArray(String[] array) throws IOException {
        String[] arraysRevers = new String[array.length];
        for (int i = arraysRevers.length - 1; i >= 0; i--) {
            arraysRevers[arraysRevers.length - 1 - i] = array[i];

        }
        System.out.println(Arrays.toString(arraysRevers));
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(arraysRevers[i])) {
                return false;
            }
        }
        return true;
    }

    public static void fillArray(String[] array) throws IOException {

        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();

        }
    }
}
