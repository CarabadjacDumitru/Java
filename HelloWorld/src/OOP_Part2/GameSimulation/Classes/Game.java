package OOP_Part2.GameSimulation.Classes;

import OOP_Part2.GameSimulation.Interfaces.IGame;
import OOP_Part2.GameSimulation.Interfaces.IPlayer;
import OOP_Part2.GameSimulation.Interfaces.LEVEL;

import java.util.ArrayList;


public class Game implements IGame {
    private ArrayList<Monster> listMonsters;
    private ArrayList<Monster> listSaves;
    private String name;

    public Game(String name) {
        InitializeGame();
        this.name = name;
    }


    @Override
    public void InitializeGame() {
        CreateVirtualWorld();
        CreateMonsters();
        System.out.println("Game is INITIALIZED");
    }

    @Override
    public void CreateMonsters() {
        Monster monster1 = new Monster("Taran",10, LEVEL.POOR,0);
        Monster monster2 = new Monster("Guard",50, LEVEL.LOW,1);
        Monster monster3 = new Monster("Paladin",100, LEVEL.HIGH,2);
        Monster monster4 = new Monster("Booss",550, LEVEL.BOSS,3);
        Monster monster5 = new Monster("BigBoss",1000, LEVEL.ULTIMATE,4);
        listMonsters= new ArrayList<>();
        listSaves= new ArrayList<>();
        listMonsters.add(monster1);
        listMonsters.add(monster2);
        listMonsters.add(monster3);
        listMonsters.add(monster4);
        listMonsters.add(monster5);
    }

    @Override
    public void CreateVirtualWorld() {
        System.out.println("The WORLD is created");
    }

    @Override
    public void RegisterPlayer(IPlayer player) {
    }

    @Override
    public void PlayGame() {
        System.out.println("Game is started");
    }


    @Override
    public boolean HitPlayer(int hitAmount) {
        return false;
    }

    @Override
    public boolean HealPlayer(int healAmount) {
        return false;
    }

    @Override
    public boolean GameOver() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean Save() {
        return false;
    }

    @Override
    public ArrayList<Monster> saveMonstersAlive() {
        return null;
    }

    @Override
    public ArrayList<Monster> saveMonstersDead() {
        return null;
    }

    @Override
    public boolean Load() {
        return false;
    }

    @Override
    public ArrayList<Monster> LoadMonstersAlive() {
        return null;
    }

    @Override
    public ArrayList<Monster> LoadMonstersDead() {
        return null;
    }
}
