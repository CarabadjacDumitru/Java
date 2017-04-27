package OOP_Part1.CarAnalogy;

public class Car {

    private String _name;
    private boolean _brake;
    private int    _speed;
    private int _gear;
    private Engine _engine;
    private Wheel _wheel;


    private int _numberWheel;

    public int get_numberWheel() {
        return _numberWheel;
    }
    public void set_numberWheel(int numberWheel) {
        this._numberWheel = numberWheel;
    }

    public String get_name() {
        return _name;
    }
    private void set_name(String name) {
        this._name = name;
    }

    public int get_speed() {
        return _speed;
    }
    private void set_speed(int speed) {
        this._speed = speed;
    }

    private void set_gear(int gear) {
        this._gear = gear;
    }
    private int get_gear() {
        return _gear;
    }

    private void set_engine(Engine engine) {
        this._engine = engine;
    }

    private void set_wheel1(Wheel wheel1) {
        this._wheel = _wheel;
    }

    public boolean get_brake() {
        return _brake;
    }
    public void set_brake(boolean brake) {
        this._brake = brake;
        if (get_brake()==true)
            set_speed(--_speed);
    }

    private  void calc_gear() {
        int local_speed = get_speed();

        if (local_speed < 10)
            set_gear(1);
        else if (local_speed < 20)
            set_gear(2);
        else if (local_speed < 30)
            set_gear(3);
        else if (local_speed < 40)
            set_gear(4);
        else if (local_speed < 50)
            set_gear(5);
        else
            set_speed(50);
    }

    public Car(Engine _engine, Wheel wheel,int numberWheel) {
        set_engine(_engine);
        set_wheel1(wheel);
        set_numberWheel(numberWheel);
        set_brake(false);
        set_speed(0);
        set_gear(0);
    }

    public  void StartEngine(){
        if (get_speed() >0) {
            set_brake(false);
            set_speed(1);
            set_gear(1);
        }
        else
            System.out.println("Engine already started");
    }

    public  void StopEngine(){
        if (get_speed()==0) {
            set_brake(true);
            set_speed(0);
            set_gear(0);
        }
        else
            System.out.println("Engine already stopped");
    }

    public  void Accelerate(){
        set_brake(false);
        _speed++;
        calc_gear();
    }

    public void GetCarStatus(){
        System.out.println("Car:"+get_name()+" has speed " + get_speed());
    }
}
