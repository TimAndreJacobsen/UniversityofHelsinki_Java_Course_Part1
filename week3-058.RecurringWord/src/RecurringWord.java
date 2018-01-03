import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String s = "a";
        while (!s.equals("")) {
            System.out.println("Type a word: ");
            s = reader.nextLine();

            if (words.contains(s)) { break; }
            else { words.add(s); }
        }
        System.out.println("You gave the word " + s + " twice");
    }
    public static String getString() {
        Scanner scan = new Scanner(System.in);
        String s = "";
        do {
            try {
                s = scan.nextLine();
            } catch (Exception e)  {
                System.out.println("not a string.");
            }
            break;
        } while(true);
        return s;
    }
}