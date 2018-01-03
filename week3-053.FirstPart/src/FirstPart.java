
import java.util.Scanner;

public class FirstPart {

        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            System.out.println();
            System.out.print("Lenght of the first part: ");
            int lenghtFirstPart = Integer.parseInt(reader.nextLine());

            System.out.println("Result: " + substringString(word, lenghtFirstPart));

        }
        public static String substringString(String text, int lenghtFirstPart){
            String result = text.substring(0, (lenghtFirstPart));
            return result;
        }








/*
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String s = reader.nextLine();
        System.out.print("\nLenght of the first part: ");
        int x = getInt();
        System.out.println("Result: " + printChars(s,x));

    }

    public static String printChars (String s, int x){
        String chars = "";
        for (int i = 0; i < x; i++){
            chars += s.charAt(i);
        }
        return chars;
    }

    public static int getInt() {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        do {
            try {
                x = scan.nextInt();
            } catch (Exception e) {
                System.out.println("not an int.");
            }
            break;
        } while (true);
        return x;
    }
*/
}
