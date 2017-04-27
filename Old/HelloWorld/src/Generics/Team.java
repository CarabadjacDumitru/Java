package Generics;


import java.lang.reflect.Member;
import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>>{
    private String name;
    private ArrayList<T> listMembers = new ArrayList<>();
    private int won =0;
    private int lost =0;
    private int tied=0;
    private int played=0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean AddPlayer(T inPlayer) {
        if (listMembers.contains(inPlayer)) {
            System.out.println("Player already exists");
            return false;
        } else {
            System.out.println("Player " + inPlayer.getName() + " added");
            listMembers.add(inPlayer);
            return true;
        }
    }

    public int numPlayers(){
        return listMembers.size();
    }

    public void matchResult(Team<T> oponent,int ourScore,int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " won ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " tie ";
        } else {
            lost++;
            message = " tie ";
        }
        played++;
        System.out.println(getName() + message + "from opponent" + oponent.getName()
        );
        if (oponent != null) {
            System.out.println(this.getName() + message + oponent.getName());
            oponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
