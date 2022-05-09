package dream.team.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JoinIfElse {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int age = Integer.parseInt(reader.readLine());
        int weight = Integer.parseInt(reader.readLine());

        if (age <= 18 && weight > 60) {
            System.out.println("You are Fat");
        } else if (age > 18 && weight < 40) {
            System.out.println("You are Thin");
        }


    }
}
