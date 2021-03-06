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


        String answerForSuitcase = sizeSuitcaseCorrect(length, width, height) ?
                "Your suitcase is the right size" : "Your suitcase does not right size!";
        System.out.println(answerForSuitcase);

    }

    public static boolean sizeSuitcaseCorrect(int length, int width, int height) {
        if ((length <= 40 && width <= 22 && height <= 53) || (length <= 55 && width <= 20 && height <= 40)) {
            return true;
        } else {
            return false;
        }
    }

}
