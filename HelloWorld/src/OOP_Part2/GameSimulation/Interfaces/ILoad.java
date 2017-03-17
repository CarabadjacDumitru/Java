package OOP_Part2.GameSimulation.Interfaces;

import OOP_Part2.GameSimulation.Classes.Monster;

import java.util.ArrayList;

public interface ILoad {
    boolean Load();
    ArrayList<Monster> LoadMonstersAlive();
    ArrayList<Monster> LoadMonstersDead();


}
