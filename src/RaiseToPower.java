public class RaiseToPower {
    // solve the problem by the recursive method
    public static float raise(float a, int p) {
        if (p == 0)
            return 1;

        float tmp = raise(a, p / 2);

        if (p % 2 == 0)
            return tmp * tmp;

        return tmp * tmp * a;
    }

    // solve the problem by two formulas
    // A^(2*M) = (A^M)^2
    // A^(M+N) = A^M * A^N
    public static float raise2(float a, int p) {
        if (p == 0)
            return 1;

        int power = 1;
        float result = a;
        while (power * 2 < p) {
            result *= result;
            power *= 2;
        }

        int power2 = 1;
        float result2 = a;
        while (power2 < p - power) {
            result2 = result2 * a;
            power2++;
        }

        return result * result2;
    }
}
