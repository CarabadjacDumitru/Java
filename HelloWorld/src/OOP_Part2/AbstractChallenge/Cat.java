package OOP_Part2.AbstractChallenge;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping");
    }
}
