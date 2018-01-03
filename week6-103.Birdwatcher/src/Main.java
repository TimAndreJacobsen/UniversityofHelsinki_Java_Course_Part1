import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Bird seagull = new Bird("Seagull", "Dorkus Dorkus");
        //Bird raven = new Bird("Raven", "Corvus Corvus");
        ArrayList<Bird> database = new ArrayList();

        //Watcher spots a bird and sends input
        while (true) {
            String userInput;
            System.out.println("?");
            userInput = scan.nextLine();

            if (userInput.contains("Quit")){
                break;
            } else if (userInput.contains("Add")) {

                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Latin name: ");
                String latinName = scan.nextLine();
                database.add(new Bird(name, latinName));
            } else if (userInput.contains("Observation")) {

                System.out.println("What was observed:?");
                userInput = scan.nextLine();

                for (Bird bird : database) {
                    if (bird.getName().equals(userInput)) {
                        bird.observed();
                    } else {
                        System.out.println("Is not a bird!");
                    }
                }

            } else if (userInput.contains("Show")) {
                System.out.println("What?");
                userInput = scan.nextLine();
                for (Bird bird : database) {
                    if (bird.getName().contains(userInput)) {
                        System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObserved() + "observations");
                    }

                }
            } else if (userInput.contains("Statistics")) {
                for (Bird bird : database) {
                    System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObserved() + "observations");
                }
            }
        }
    }
}
