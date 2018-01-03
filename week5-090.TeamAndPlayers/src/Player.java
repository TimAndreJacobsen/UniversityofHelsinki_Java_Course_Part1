public class Player {
    private String name;
    private int goals;

    // Constructor
    public Player(String name) {
        this(name,0);
    }
    public Player(String name, int goals) {
        this.goals = goals;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player: " + name + ", goals " + goals;
    }

    public String getName() {
        return this.name;
    }

    public int goals() {
        return this.goals;
    }
}
