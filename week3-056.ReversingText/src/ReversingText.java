
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String s) {
        String reverse = "";
        char read;
        int lenght = s.length();

        for (int i = 0; i < lenght; lenght--) {
            reverse += s.charAt(lenght-1);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
