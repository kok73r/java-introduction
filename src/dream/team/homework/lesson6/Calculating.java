package dream.team.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculating {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter operation next field: ");

        double n1 = Integer.parseInt(reader.readLine());
        double n2 = Integer.parseInt(reader.readLine());



        System.out.println(n1);

    }
   /* public static double getNumber(){
        System.out.println("Enter your number: ");
    }*/
}
