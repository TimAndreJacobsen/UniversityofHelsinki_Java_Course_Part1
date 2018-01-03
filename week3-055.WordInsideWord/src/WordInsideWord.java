import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the first word: ");
        String wordOne = reader.nextLine();

        System.out.print("Type the second word: ");
        String wordTwo = reader.nextLine();
        System.out.println();

        Ispartof(wordOne, wordTwo);

    }

    public static void Ispartof(String first, String second) {
        int index = first.indexOf(second);

        if (index >= 0) {
            System.out.println("The word '" + second + "' is found in the word '" + first + "'.");
        }
        else if (index == -1) {
            System.out.println("The word '" + second + "' is not found in the word '" + first + "'.");
        }
    }
}