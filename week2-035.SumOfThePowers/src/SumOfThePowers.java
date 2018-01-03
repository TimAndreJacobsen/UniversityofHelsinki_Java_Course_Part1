import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type a number: ");
        int userInput = Integer.parseInt(scan.nextLine());

        int result = 0;
        int i = 0;
        while (i <= userInput) {
            result += (int)Math.pow(2, i);
            i++;
        }

        System.out.println("The result is " + result);




    }
}
