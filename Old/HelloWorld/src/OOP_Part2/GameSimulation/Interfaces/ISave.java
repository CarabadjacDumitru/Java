package OOP_Part2.GameSimulation.Interfaces;

import OOP_Part2.GameSimulation.Classes.Monster;

import java.util.ArrayList;

public interface ISave {
    boolean Save();
    ArrayList<Monster> saveMonstersAlive();
    ArrayList<Monster> saveMonstersDead();
}
