public class GreatestCommonDivisor {
    public int GCD(int a, int b) {
        while (b != 0) {
            int reminder = a % b;
            a = b;
            b = reminder;
        }

        return a;
    }
}
