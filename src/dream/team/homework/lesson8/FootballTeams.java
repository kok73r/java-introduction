package dream.team.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FootballTeams {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter count of team members: ");
        int teamSize = Integer.parseInt(reader.readLine());

        int[] footballPlayersAgeFirstTeam = new int[teamSize];
        int[] footballPlayersAgeSecondTeam = new int[teamSize];

        System.out.println("First team: ");
        fillArray(footballPlayersAgeFirstTeam);
        System.out.println(Arrays.toString(footballPlayersAgeFirstTeam));
        System.out.println("Second team: ");
        fillArray(footballPlayersAgeSecondTeam);
        System.out.println(Arrays.toString(footballPlayersAgeSecondTeam));

        int average1 = countAverageAge(footballPlayersAgeFirstTeam);
        int average2 = countAverageAge(footballPlayersAgeSecondTeam);
        comparisonAverageAge(average1, average2);

    }

    private static void comparisonAverageAge(int average1, int average2) {
        if (average1 < average2) {
            System.out.println("Average age second team is greater: " + average2);
        } else if (average1 > average2) {
            System.out.println("Average age first team is greater: " + average1);
        } else {
            System.out.println("Team have the same age");
        }
    }

    public static int countAverageAge(int[] ageOfPlayers) {
        int sum = 0;
        for (int ageOfPlayer : ageOfPlayers) {
            sum += ageOfPlayer;
        }
        return sum / ageOfPlayers.length;
    }

    public static int ageOfPlayers() {
        int minAge = 18;
        int maxAge = 45;
        return (int) (Math.random() * (maxAge - minAge) + minAge);
    }

    public static void fillArray(int[] footballPlayersAge) {
        for (int i = 0; i < footballPlayersAge.length; i++) {
            footballPlayersAge[i] = ageOfPlayers();
        }
    }

}