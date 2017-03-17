package OOP_Part1.CarAnalogy;

public class Cylinder {
    private String _name;
    private int _radius;
    private int _volume;


    public Cylinder(String name, int radius, int volume) {
        this._name = name;
        this._radius = radius;
        this._volume = volume;
    }

    public String get_name() {
        return _name;
    }

    public int get_radius() {
        return _radius;
    }

    public double get_volume() {
        return 3.14*get_radius();
    }
}
