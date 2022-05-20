package dream.team.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        try {
            Integer num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException exception) {
            System.out.println("Error" + exception.getMessage());
        }
        System.out.println("Continue...");
    }
}
