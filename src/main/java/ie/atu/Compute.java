package ie.atu;

public class Compute {
    public float calc(float arg1, float arg2) {
        float x = arg1;
        float y = arg2;

        if (x != 0) {
            y += 10;
        }
        y = y / x;
        System.out.println(x + " " + y);
        return y;
    }
}
