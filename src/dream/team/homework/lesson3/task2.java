package dream.team.homework.lesson3;

import java.util.Arrays;

public class task2 {

    public static void main(String[] args) {

        int a = 16;
        System.out.println("a = " + a);
        int b = 10;
        System.out.println("b = " + b);
        int c = 6;
        System.out.println("c = " + c);

        System.out.println();

        double result = (Math.abs(a - b)) / Math.pow((a + b), 3) - Math.sqrt(c);


        System.out.println("Mathematical formula = |a - b|/(a + b)^3 + √c = " + result);
    }
}
