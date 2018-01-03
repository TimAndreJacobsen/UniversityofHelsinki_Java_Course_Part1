import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phonebook;

    public Phonebook() {
    }

    public void add(String name, String number) {
        this.phonebook.add(new Person(name, number));
    }

    public void printAll() {
        for (Person p : this.phonebook) {
            System.out.println(p.toString());
        }
    }

    public String searchNumber(String name) {
        for (Person p : this.phonebook) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p.getNumber();
            }
        } return "number not known";
    }



}
