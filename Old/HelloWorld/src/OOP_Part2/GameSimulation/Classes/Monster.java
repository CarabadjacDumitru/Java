package OOP_Part2.GameSimulation.Classes;

import OOP_Part2.GameSimulation.Interfaces.IIdentificator;
import OOP_Part2.GameSimulation.Interfaces.IMonster;
import OOP_Part2.GameSimulation.Interfaces.LEVEL;
import OOP_Part2.GameSimulation.Interfaces.IPosition;

public class Monster implements IMonster,IPosition,IIdentificator {
    private String name;
    private int hitPoints;
    private LEVEL powerClass = LEVEL.undefined;
    private boolean isAlive =true;
    private Coordinate position;
    private String ID;

    public Monster(String name, int hitPoints, LEVEL powerClass, Coordinate posit) {
        setID();
        setName(name);
        setAlive(true);
        setPosition(posit);
        setHitPoints(hitPoints);
        setPowerClass(powerClass);
    }

    private void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
    public int getHitPoints() {
        return hitPoints;
    }

    private void setPowerClass(LEVEL powerClass) {
        this.powerClass = powerClass;
    }
    public LEVEL getPowerClass() {
        return powerClass;
    }

    private void setAlive(boolean alive) {
        isAlive = alive;
    }
    public boolean getAlive() {
        return isAlive;
    }

    private void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPosition(Coordinate poos) {
        position=new Coordinate(poos.getX(),poos.getY());
    }
    public Coordinate getPosition() {
        return position;
    }

    private void setID() {
        ID = "Monster:"+Math.random();
    }
    public String getId() {
        return ID;
    }

    @Override
    public void lowerHitPoints() {
        if (--hitPoints==0)
            setAlive(false);
    }

    @Override
    public void raizeHitPoints() {
        hitPoints++;
    }
}
