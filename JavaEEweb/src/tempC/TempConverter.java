package tempC;

public class TempConverter {
    public TempConverter() {
    }

    public String convert(String temp){
        String result = "Bad Input";
        try {
            float t = Float.parseFloat(temp);
            float f = c2f(t);
            float c=f2c(t);
            result = temp + " _ _ " + String.valueOf(c) + "F : " + String.valueOf(f) + "C";
        }
        catch (NumberFormatException e){}
        return result;
    }

    private float f2c(float t){
        return (5.0f/9f)*(t-32f);
    }

    private float c2f(float t){
        return (9f/5f * t) + 32f ;
    }
}
