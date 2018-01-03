import java.util.ArrayList;

public class Grades {

    private int score;
    private int grade;
    private int accepted = 0;
    private int amountOfScores = 0;


    public Grades(int score) {
        this.score = score;
        this.grade = calcGrade(this.score); // passes score into a method that assigns grade
    }

    public Grades() {
    }

    public Grades(int accepted, int amountOfScores) {
        this.accepted = accepted;
        this.amountOfScores = amountOfScores;
        this.score = -1;
        this.grade = calcGrade(this.score);
    }

    public int calcGrade(int score) {
        if (checkIfValidScore(score)){
            if (score >= 0 && score < 30) {
                return 0;
            } else if (score >= 30 && score < 35) {
                return 1;
            } else if (score <= 39 && score >= 35) {
                return 2;
            } else if (score <= 44) {
                return 3;
            } else if (score <= 49) {
                return 4;
            } else {
                return 5;
            }
        } return -1;
    }
    // Checks if the score is valid and adds to counter
    public boolean checkIfValidScore(int score) {
        if (score >= 0 && score <= 60) {
            return true;
        } return false;
    }


    public void printGrades(ArrayList<Grades> list) {
        System.out.println("Grade distribution:");

        //prints first column
        for (int j = 5; j >= 0; j--) {
            System.out.print(j + ": ");

            //prints 1 star per grade of current value(j)
            for (int i = 0; i < list.size(); i++){
                if (list.get(i).grade == j) {
                    System.out.print("*");
               }
            }System.out.println();
        }
    }

    //calculates percentage of valid grades.
    //grade 0 = failed
    //grade 1-5 = passed
    public double acceptPercentage() {
        if (this.amountOfScores > 0 && this.accepted > 0) {
            return 100 * this.accepted / this.amountOfScores;
        } return 0.0;
    }

    public void incrementAmountOfScores() {
        this.amountOfScores++;
    }

    public void incrementAcceptedGrades() {
        this.accepted++;
    }

}
