
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");
        String s = reader.nextLine();

        for (int i = 0; i < s.length(); i++){
            System.out.println(i+1 + ". character: " + s.charAt(i));
        }
    }
}
