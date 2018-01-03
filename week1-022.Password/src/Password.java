import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.print("Type the password: ");
            String userInp = reader.nextLine();
            if (userInp.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar!");
                break;
            }
            System.out.println("Wrong!");
        }
 
 
 
 
 
 
        /*System.out.println("Type the password: ");
        String psw = reader.nextLine();
 
        while (!password.equals(psw)){
            System.out.println("Wrong!");
            System.out.println("Type the password: ");
            String psw1;
            psw1 = reader.nextLine();
        }
        if (String.equals(psw1)){
            System.out.println("Right!");
            System.out.println("The secret is: jryy qbar!");
        }
        */

    }
}