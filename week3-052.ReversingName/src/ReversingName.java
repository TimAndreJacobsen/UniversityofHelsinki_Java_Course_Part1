import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type you name: ");
        String s = reader.nextLine();
        System.out.println("In reverse order: " + reversed(s));
    }

    public static String reversed(String s) {
        String reverse = "";
        char read;
        int lenght = s.length();

        for (int i = 0; i < lenght; lenght--) {
            reverse += s.charAt(lenght-1);
        }
        return reverse;
    }
}
