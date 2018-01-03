import java.util.ArrayList;

public class Team {
    // Initializations
    private String name;
    private int maxSize;
    private ArrayList<Player> team = new ArrayList<Player>();

    // Constructors
    public Team(String name) {
        this.name = name;
        this.maxSize = 16;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int size() {
        return this.team.size();
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int goals() {
        int teamGoals = 0;
        for (Player p : this.team) {
            teamGoals += p.goals();
        }
        return teamGoals;
    }

    // Setters
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    // Methods
    public void addPlayer(Player player) {
        if (this.size() < this.getMaxSize()){
            this.team.add(player);
        }
    }

    // Enhanced for loop, print all the players on a team
    public void printPlayers() {
            for (Player p : this.team) {
            System.out.println(p);
        }
    }






}

