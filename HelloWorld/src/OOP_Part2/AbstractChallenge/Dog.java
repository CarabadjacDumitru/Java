package OOP_Part2.AbstractChallenge;

public class Dog extends  Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping");
    }
}
