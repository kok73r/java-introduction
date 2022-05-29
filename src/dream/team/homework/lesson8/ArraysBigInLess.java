package dream.team.homework.lesson8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysBigInLess {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Insert size of array: ");
        String[] arrayBy20Lines = createArray(Integer.parseInt(READER.readLine()));
        fillArray(arrayBy20Lines);
        printArray(arrayBy20Lines);

        System.out.println("Insert size of array: ");
        String[] firstSmallArray = createArray(Integer.parseInt(READER.readLine()));
        for (int i = 0; i < arrayBy20Lines.length / 2; i++) {
            firstSmallArray[i] = arrayBy20Lines[i];
        }
        System.out.println("First small array: ");
        printArray(firstSmallArray);
        System.out.println("Insert size of array: ");
        String[] secondSmallArray = createArray(Integer.parseInt(READER.readLine()));
        for (int i = 0; i < secondSmallArray.length; i++) {
            secondSmallArray[i] = arrayBy20Lines[i + 10];
        }
        System.out.println("Second small array:");
        printArray(secondSmallArray);
    }

    public static void printArray(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void fillArray(String[] strings) throws IOException {
        System.out.println("Fill array: ");
        for (int i = 0; i < strings.length; i++) {
            strings[i] = READER.readLine();
        }
    }

    public static String[] createArray(int size) {
        String[] strings = new String[size];
        return strings;
    }


}
