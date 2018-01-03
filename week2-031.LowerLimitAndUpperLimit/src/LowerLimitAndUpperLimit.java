
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());

        while (first <= last) {
            System.out.println(first);
            first++;
        }

        /*
        //Asks for input, use getInt method
        System.out.print("First: ");
        int first = getInt();
        System.out.print("Last: ");
        int last = getInt();
        //Calls printing method and passes ints as params
        printNumbersLimit(first, last);
        */

    }

    /*
    //Method for getting int from user
    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        int getInt;

        do {
            try {
                getInt = Integer.parseInt(scan.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Was it that hard to type a number?");
            }
        } while (true);
        return getInt;
    }


    //Prints numbers from x to y
    public static void printNumbersLimit(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }
    */
}
