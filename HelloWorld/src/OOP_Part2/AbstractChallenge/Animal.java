package OOP_Part2.AbstractChallenge;

public abstract class Animal {
    private String Name;
    public Animal(String name) {
        Name = name;
    }

    public String getName(){return  Name;}

    public abstract void eat();
    public abstract void sleep();

}
