package OOP_Part2.GameSimulation.Interfaces;


public interface IGame extends ISave, ILoad {
    void InitializeGame();
    void CreateMonsters();
    void CreateVirtualWorld();
    void PlayGame();
    void RegisterPlayer(IPlayer player);
    boolean HitPlayer(int hitAmount);
    boolean HealPlayer(int healAmount);
    boolean GameOver();

    String getName();
}
