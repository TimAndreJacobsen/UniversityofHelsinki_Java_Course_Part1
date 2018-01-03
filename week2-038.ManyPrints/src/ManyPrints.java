
import java.util.Scanner;

public class ManyPrints {
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        // ask the user how many times the text should be printed
        // use the while structure to call the printText method several times
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        int userInput = getInt();
        for (int i = 0; i < userInput; i++) {
            printText();
        }

    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        do {
            try {
                x = scan.nextInt();
            } catch (Exception e) {
                System.out.println("not an int.");
            }
            break;
        } while (true);
        return x;
    }
}
