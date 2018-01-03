
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        String userInputName;
        String userInputStudentNumber;
        String searchParam;

        Student alanTuring = new Student("Alan Turing", "017635727");
        Student linusTorvalds = new Student("Linus Torvalds", "011288989");
        Student steveJobs = new Student("Steve Jobs", "013672548");
        Student slapstick = new Student("Homeboy simspons", "013123548");
        Student nofunallwork = new Student("Homer Simpsons", "0133548");
        list.add(linusTorvalds);
        list.add(alanTuring);
        list.add(steveJobs);
        list.add(slapstick);
        list.add(nofunallwork);

        /*
        System.out.println("name: " + alanTuring.getName());
        System.out.println("studentnumber: " + alanTuring.getStudentNumber());

        System.out.println("name: " + linusTorvalds.getName());
        System.out.println("studentnumber: " + linusTorvalds.getStudentNumber());

        System.out.println("name: " + steveJobs.getName());
        System.out.println("studentnumber: " + steveJobs.getStudentNumber());
        */

        // ask for student information
        do {
            System.out.println("Name: ");
            userInputName = scan.nextLine();
            //ask until user gives empty name.
            if (userInputName.isEmpty()) {
                break;
            }
            System.out.println("Student number: ");
            userInputStudentNumber = scan.nextLine();
            list.add(new Student(userInputName, userInputStudentNumber));
        } while (true);

        for (Student i : list) {
            System.out.println(i.toString());
        }

        // The search bit
        System.out.println("Give search term: ");
        searchParam = scan.nextLine();
        System.out.println("Result: ");
        for (Student i : list) {
            if (i.getName().contains(searchParam)) {
                System.out.println(i.toString());
            }

        }
    }
}
