package CarAnalogy;

/**
 * Created by simd0922 on 10/03/2017.
 */
public class Engine {
    private String _name;
    private Cylinder _cylinder;
    private int _numberCylinders;
    private double _power;


    public String get_name() {
        return _name;
    }
    private void set_name(String name) {
        this._name = name;
    }

    private Cylinder get_cylinder1() {
        return _cylinder;
    }
    private void set_cylinder1(Cylinder cylinder1) {
        this._cylinder = cylinder1;
    }

    public int get_quantCylinders() {
        return _numberCylinders;
    }
    public void set_quantCylinders(int numberCylinders) {
        this._numberCylinders = numberCylinders;
    }

    public double get_power() {
        return _power;
    }
    private void set_power() {
        this._power = (get_cylinder1().get_volume() * get_quantCylinders());
    }


    public Engine(String name, Cylinder cylinder,int numbCylinders) {
        set_name(name);
        set_cylinder1(cylinder);
        set_quantCylinders(numbCylinders);
        set_power();
    }


}
