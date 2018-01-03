import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Grades grades = new Grades();
        Grades grades1 = new Grades(0,0);
        ArrayList<Grades> gradeList = new ArrayList();
        int userInput = 0;

        System.out.println("Type exam scores, -1 completes:");

        while (userInput != -1) {
            userInput = Integer.parseInt(scan.nextLine());
            if (userInput >= 0 && userInput <= 60) {
                gradeList.add(new Grades(userInput));

                if (userInput >= 30 && userInput <= 60) {
                    grades1.incrementAcceptedGrades();
                    grades1.incrementAmountOfScores();

                } else if (userInput >= 0 && userInput < 30){
                    grades1.incrementAmountOfScores();
                }
            }
        }
        grades.printGrades(gradeList);
        System.out.println("Acceptance percentage: " + grades1.acceptPercentage());
    }
}
