package dream.team.homework.lesson8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysBigInLess {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Insert size of array: ");
        String[] arrayBy20Lines = createAndFill(Integer.parseInt(READER.readLine()));
        printArray(arrayBy20Lines);

        System.out.println("Insert size of array: ");
        String[] firstArray10Lines = new String[10];
        for (int i = 0; i < 10; i++) {
            firstArray10Lines[i] = arrayBy20Lines[i];
        }
        System.out.println("First small array: ");
        printArray(firstArray10Lines);

        String[] secondArray10Lines = new String[10];
        for (int i = 0; i < secondArray10Lines.length; i++) {
            secondArray10Lines[i] = arrayBy20Lines[i+10];
        }
        System.out.println("Second small array:");
        printArray(secondArray10Lines);
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

    public static String[] createAndFill(int size) throws IOException {
        String[] strings = new String[size];
        fillArray(strings);
        return strings;
    }


}
