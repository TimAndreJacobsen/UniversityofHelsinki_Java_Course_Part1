
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int x;

        // Write your code here
        System.out.println("Up to what number? ");
        x = getInt();
        printInt(x);


    }
        public static void printInt (int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }


    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        int userInput;

        do {
            try {
                userInput = Integer.parseInt(scan.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Retry: ");
            }
        } while (true);
        return userInput;
    }

}
