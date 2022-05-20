package dream.team.homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FootballTeams {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter count of team memmbers: ");
        int teamAmount = Integer.parseInt(reader.readLine());

        int[] footballPlayersAgeFirstTeam = new int[teamAmount];
        int[] footballPlayersAgeSecondTeam = new int[teamAmount];

        System.out.println("First team: ");
        fillAndPrintArray(footballPlayersAgeFirstTeam);
        System.out.println("Second team: ");
        fillAndPrintArray(footballPlayersAgeSecondTeam);

        int average1 = countAverageAge(footballPlayersAgeFirstTeam);
        int average2 = countAverageAge(footballPlayersAgeSecondTeam);
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

    public static void fillAndPrintArray(int[] footballPlayersAge) {
        for (int i = 0; i < footballPlayersAge.length; i++) {
            footballPlayersAge[i] = ageOfPlayers();
            System.out.println(" Football player age: " + ageOfPlayers() + ",");
        }
    }

}