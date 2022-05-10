package dream.team.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarship {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Insert your grades for subject1, subject2, subject3, subject4, subject5: ");
        int subject1 = Integer.parseInt(reader.readLine());
        int subject2 = Integer.parseInt(reader.readLine());
        int subject3 = Integer.parseInt(reader.readLine());
        int subject4 = Integer.parseInt(reader.readLine());
        int subject5 = Integer.parseInt(reader.readLine());

        int averageGrade = countAverageGrade(subject1, subject2, subject3, subject4, subject5);
        System.out.println("Average Grade of student = " + averageGrade);

        if (averageGrade >= 10 && averageGrade <= 12) {
            System.out.println("You have HIEST scholarship!!!");
        } else if (averageGrade >= 8 && averageGrade < 10) {
            System.out.println("You have scholarship!");
        } else if (averageGrade > 0 && averageGrade < 8) {
            System.out.println("You have no scholarship.");
        } else {
            System.out.println("Impossible value");
        }

    }

    public static int countAverageGrade(int s1, int s2, int s3, int s4, int s5) {
        int averageGrade = ((s1 + s2 + s3 + s4 + s5) / 5);
        return averageGrade;

    }
}
