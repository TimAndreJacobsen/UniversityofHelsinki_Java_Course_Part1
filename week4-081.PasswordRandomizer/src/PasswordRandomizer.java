import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();

    // Selection from which createPassword() will draw from.
    private String chars = "abcdefghijklmnopqrstuvwxyz";
    // variable needed to set length in constructor
    private int length;

    // Constructor
    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        // Initializing the string that will hold our password.
        String createdPassword = "";

        // For loop. Adds a random char per iteration.
        // Stops and returns generated password on
        for (int i=0; i<this.length; i++) {
            createdPassword += chars.charAt(random.nextInt(26));
        }
        return createdPassword;
    }
}
