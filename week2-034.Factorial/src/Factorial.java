import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        System.out.println("Factorial is " + recursion(x));
    }


    public static int recursion(int x) {
        if (x == 1) {
            return 1;
        } else {
            return x * recursion(x - 1);
        }
    }


}
