
public class Bird {

    private String name;
    private String latinName;
    private int observed;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
        System.out.println("Created bird: " + this.name + " " + this.latinName);
    }


    public String getName() {
        return name;
    }

    public void observed() {
        this.observed++;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObserved() {
        return observed;
    }
}
