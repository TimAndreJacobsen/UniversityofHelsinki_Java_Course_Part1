public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        letter = letter.toUpperCase();

        if (this.guessedLetters.contains(letter)) {
            } else if (this.word.contains(letter)) {
            this.guessedLetters += letter;
        } else {
            this.guessedLetters += letter;
            this.numberOfFaults++;
        }
    }

    public String hiddenWord() {
        String hiddenWord = "";
        for (int i = 0; i < this.word.length(); i++) {
            String charToString = "" + this.word.charAt(i);
            if (guessedLetters.contains(charToString)) {
                hiddenWord += charToString;
            } else {
                hiddenWord += "_";
            }
        }
        return hiddenWord;
        // program here the functionality for building the hidden word
        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word
        // return the hidden word at the end
    }
}
