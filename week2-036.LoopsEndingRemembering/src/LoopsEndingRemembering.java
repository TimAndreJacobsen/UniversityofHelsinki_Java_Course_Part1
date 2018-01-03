import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int userInput;
        int sum = 0;
        int counter = 0;
        double avg = 0;
        int odd = 0;
        int even = 0;

        System.out.println("Type numbers: ");

        do {
            userInput = Integer.parseInt(reader.nextLine());
            if (userInput != -1) {
                sum += userInput;
                counter++;
                if (userInput % 2 == 0){even++;}
                else {odd++;}
            }
        } while (userInput != -1);

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + (double)sum/(double)counter);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
