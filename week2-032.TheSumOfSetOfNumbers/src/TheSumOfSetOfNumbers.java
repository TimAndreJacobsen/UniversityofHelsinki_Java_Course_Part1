
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what? ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Sum is " + recursiveAddition(x));
    }

    public static int recursiveAddition(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x + recursiveAddition(x - 1);
        }
    }

}
