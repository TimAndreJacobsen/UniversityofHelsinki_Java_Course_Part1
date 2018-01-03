import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        do {
            System.out.print("Type a word: ");
            String s = getString();
            if (s.isEmpty()){
                break;
            }
            words.add(s);
        } while (true);

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
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
