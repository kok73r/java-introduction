package dream.team.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers: ");
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());


        System.out.println("Min number = " + findMinNumber(n1,n2,n3));


    }

    public static int findMinNumber(int n1, int n2, int n3) {
        if (n1 <= n2 && n1 <= n3) {
            return n1;
        }
        if (n2 <= n1 && n2 <= n3) {
            return n2;
        } else {
            return n3;
        }

    }

}
