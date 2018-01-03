import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String s = "a";

        while(!s.isEmpty()){
            System.out.print("Type a word: ");
            s = reader.nextLine();
            words.add(s);
        }
        Collections.reverse(words);
        System.out.println("You typed the following words:");
        for(String i : words){
            System.out.println(i);
        }
    }
}