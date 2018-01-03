
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        double x = Double.parseDouble(reader.nextLine());

        System.out.println("Type another number: ");
        double y = Double.parseDouble(reader.nextLine());

        System.out.println("Division: " +  x + " / " + y + " = " + (x/y));
    }
}
