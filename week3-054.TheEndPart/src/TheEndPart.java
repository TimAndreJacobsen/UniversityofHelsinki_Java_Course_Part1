import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: "); //word to be broken up into parts
        String word = reader.nextLine(); //accepting input and assigning it to string word
        System.out.println(); // clean line for partitioning up the console output
        System.out.print("Lenght of the last part: "); //promt user input for the lenght of last part
        int lenghtLastPart = Integer.parseInt(reader.nextLine()); // assigning it to a int variable

        System.out.println("Result: " + substringString(word, lenghtLastPart)); //calling substring method
    }
    public static String substringString(String text, int lenghtLastPart) {
        int totalLenght = text.length();
        String result = text.substring(totalLenght-lenghtLastPart);
        return result;
    }
}