package dream.team.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) throws IOException {

        int size = 5;
        int[] numbers = new int[size];
        int[] newNumbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(newNumbers));


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] = i);
        }

        String[] students = {"Tania", "Kostia", "Olena", "Olenka", "Anton"};
        for (String student : students) {
            System.out.println(student + " Hi!");
        }

        String[] students2 = new String[students.length];
        for (int i = 0; i < students.length; i++) {
            students2[i] = students[i];
        }
        students[0] = "Katia";
        students[2] = "Serhii";

        System.out.println(Arrays.toString(students));


        String[] fruit = new String[3];
        fillArray(fruit);
        System.out.println(Arrays.toString(fruit));
    }

    public static void fillArray(String[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();

        }
    }

}
