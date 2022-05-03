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


        double result = (Math.abs(a - b)) / Math.pow((a + b), 3) - Math.sqrt(c);
        for (String s : Arrays.asList("Mathematical formula = |a - b|/(a + b)^3 + √c", "Formula solution = " + result)) {
            System.out.println(s);
        }

    }
}
