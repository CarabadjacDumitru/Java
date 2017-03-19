package OOP_Part2.GameSimulation.Classes;

public class Coordinate {
    private int X = 0;
    private int Y =0;

    public Coordinate(int x, int y) {
        X = x;
        Y = y;
    }

    public int getX() {
        return X;
    }

    private void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    private void setY(int y) {
        Y = y;
    }

    public void MoveUP()
    {
        Y++;
    }

    public void MoveDown()
    {
        Y--;
    }

    public void MoveLEFT()
    {
        X++;
    }

    public void MoveRIGHT()
    {
        X--;
    }
}
