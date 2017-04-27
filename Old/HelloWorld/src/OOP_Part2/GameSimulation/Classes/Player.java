package OOP_Part2.GameSimulation.Classes;


import OOP_Part2.GameSimulation.Interfaces.IIdentificator;
import OOP_Part2.GameSimulation.Interfaces.IPlayer;

public class Player implements IPlayer,IIdentificator {
    private String ID;
    private String name;

    public Player(String Name) {
        setName(Name);
        setID();
    }

    private void setID() {
        ID = "Player:" + Math.random();
    }
    @Override
    public String getId() {
        return ID;
    }


    private void setName(String name) {
        this.name = name;
    }
    private String getName() {
        return name;
    }

}

