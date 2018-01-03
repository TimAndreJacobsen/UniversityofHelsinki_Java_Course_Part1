import java.util.Scanner;

import jdk.nashorn.internal.objects.NativeJava;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.sortByPoints();// Print the top ten players sorted by points.
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals();// Print the top ten players sorted by goals.
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();//  Print the top ten players sorted by assists.
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();//  Print the top ten players sorted by penalties.
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                System.out.print("Please type player name: ");
                String name = reader.nextLine();
                NHLStatistics.searchByPlayer(name);// Ask the user first which player's statistics are needed and then print them.
            } else if (command.equals("club")) {
                NHLStatistics.sortByPoints();
                System.out.print("Please type club name: ");
                String clubName = reader.nextLine();
                NHLStatistics.teamStatistics(clubName);
                // Ask the user first which club's statistics are needed and then print them.
                // Note: When printing statistics they should be ordered by points (so the players with the most points come first).
            }

        }
    }
}