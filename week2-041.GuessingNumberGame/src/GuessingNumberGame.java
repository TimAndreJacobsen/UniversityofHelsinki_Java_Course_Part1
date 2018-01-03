
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        // program your solution here. Do not touch the above lines!
        int tries = 0;
        int guess;

        while (true){
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
            tries++;
            if (guess > numberDrawn){
                System.out.println("The number is lesser, guesses made " + tries);
            } else if (guess < numberDrawn){
                System.out.println("The number is greater, guesses made "+ guess);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }

    }

    private static int drawNumber() {
        return new Random().nextInt(101);
    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        do {
            try { x = scan.nextInt(); }
            catch (Exception e) { System.out.println("not an int."); }
            break;
        } while (true);
        return x;
    }
}