import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String s = reader.nextLine();

        if (s.length() < 3) {
            //do nothing
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". character: " + s.charAt(i));
            }
        }
    }
}