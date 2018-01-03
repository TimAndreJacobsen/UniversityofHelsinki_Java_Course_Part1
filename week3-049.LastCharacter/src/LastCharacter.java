import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String s = reader.nextLine();
        System.out.println("Last Character: " + lastCharacter(s));
    }


    public static char lastCharacter (String s) {
        return s.charAt(s.length()-1);
    }

}
