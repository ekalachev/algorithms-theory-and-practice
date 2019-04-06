import java.util.ArrayList;
import java.util.List;

public class Divisors {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int reminder = a % b;
            a = b;
            b = reminder;
        }

        return a;
    }

    public static int[] findAllDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i == 0) {
                int divisor = n/i;
                divisors.add(divisor);

                if (divisor != i) {
                    divisors.add(i);
                }
            }
        }

        return divisors.stream().mapToInt(x -> x).toArray();
    }
}
