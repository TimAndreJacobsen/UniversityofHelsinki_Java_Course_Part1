import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String s = reader.nextLine();
        System.out.println("First Character: " + firstCharacter(s));
    }


    public static char firstCharacter (String s) {
        return s.charAt(0);
    }

}
