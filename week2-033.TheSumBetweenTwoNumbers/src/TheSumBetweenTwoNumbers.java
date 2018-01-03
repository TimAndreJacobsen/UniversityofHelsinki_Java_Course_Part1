
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());


        System.out.println("The sum is " + sumBetweenTwoNumbers(first, last));
    }

    public static int sumBetweenTwoNumbers(int lowerBound, int upperBound) {
        int sum = 0;
        while (lowerBound <= upperBound) {
            sum += lowerBound;
            lowerBound++;
        }
        return sum;


    }
}
