package OOP_Part1.CarAnalogy;

/**
 * Created by simd0922 on 10/03/2017.
 */
public class Wheel {
    private String _name;
    private int _radius;
    private String _color;


    public Wheel(String name, int radius, String color) {
        this._name = name;
        this._radius = radius;
        this._color = color;
    }

    public String get_name() {
        return _name;
    }

    public int get_radius() {
        return _radius;
    }

    public String get_color() {
        return _color;
    }
}
