import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divisors {
    public  static BigInteger gcd2(BigInteger a, BigInteger b) {
        if (a.equals(BigInteger.ZERO) || b.equals(BigInteger.ZERO))
            return null;

        while (b.compareTo(BigInteger.ZERO) > 0) {
            a = a.divideAndRemainder(b)[1];

            BigInteger tmp = a;
            a = b;
            b = tmp;
        }

        return a;
    }

    public static BigInteger gcd(BigInteger a, BigInteger b) {
        if (BigInteger.ZERO.equals(a))
            return b;

        if (BigInteger.ZERO.equals(b))
            return a;

        if(a.compareTo(b) > 0)
            return gcd(a.mod(b), b);

        if (b.compareTo(a) > 0)
            return gcd(a, b.mod(a));

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your numbers in the format: 100 25");

        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] ab = sc.nextLine().split(" ");
        BigInteger a = new BigInteger(ab[0]);
        BigInteger b = new BigInteger(ab[1]);

        System.out.println(Divisors.gcd2(a, b));
    }
}
