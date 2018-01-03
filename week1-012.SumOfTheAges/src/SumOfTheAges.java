
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here

        System.out.print("Type your name: ");
        String nameOne = reader.nextLine();
        System.out.println();
        System.out.println("Type your age: ");
        int ageOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String nameTwo = reader.nextLine();
        System.out.println();
        System.out.println("Type your age: ");
        int ageTwo = Integer.parseInt(reader.nextLine());

        System.out.println(nameOne + " and " + nameTwo + " are " + addition(ageOne,ageTwo) + " years old in total.");
    }

    public static int addition(int x,int y) {
        return x+y;
    }
}
