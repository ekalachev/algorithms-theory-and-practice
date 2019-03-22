public class RaiseToPower {
    public static float raise(float a, int p) {
        if(p == 0)
            return 1;

        float tmp = raise(a, p/2);

        if(p % 2 == 0)
            return tmp * tmp;

        return tmp * tmp * a;
    }
}
