package dream.team.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suitcase {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Insert size value of your suitcase(lenght, width, height): ");

        int length = Integer.parseInt(reader.readLine());
        int width = Integer.parseInt(reader.readLine());
        int height = Integer.parseInt(reader.readLine());


        if (length <= 40 && width <= 22 && height <= 53) {
            System.out.println("Your suitcase is the right size");
        } else if (length <= 55 && width <= 20 && height <= 40) {
            System.out.println("Your suitcase is the right size");
        } else {
            System.out.println("Your suitcase does not right size.");
        }


    }

}
