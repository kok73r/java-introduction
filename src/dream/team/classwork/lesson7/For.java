package dream.team.classwork.lesson7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class For {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0 || i % 5 == 0)
                System.out.println("i = " + i);
        }
    }

}
