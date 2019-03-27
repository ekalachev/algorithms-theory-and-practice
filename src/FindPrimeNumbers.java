import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumbers {
    public static List<Integer> findFactors(int number) {
        List<Integer> factors = new ArrayList<Integer>();
        // check to divide on 2
        while (number % 2 == 0) {
            factors.add(2);
            number = number / 2;
        }

        int i = 3;
        int maxFactor = (int) Math.sqrt(number);
        while (i <= maxFactor) {
            // check to divide on i
            while (number % i == 0) {
                // i is multiplier. Add i to factor list
                factors.add(i);

                // divide the number on i
                number = number / i;

                // set new upper bound
                maxFactor = (int) Math.sqrt(number);
            }

            i += 2;
        }

        if (number > 1)
            factors.add(number);

        return factors;
    }

    public static List<Integer> findPrimeNumbers (int maxNumber) {
        boolean[] composites = new boolean[maxNumber + 1];

        // exclude multiples of 2
        for (int i = 4; i <= maxNumber; i+= 2) {
            composites[i] = true;
        }

        // exclude multiples of prime numbers
        int nextPrime = 3;
        int stopAt = (int) Math.sqrt(maxNumber);
        while (nextPrime <= stopAt) {
            // exclude multiples of a given prime number
            for (int i = nextPrime * 2; i < maxNumber; i += nextPrime) {
                composites[i] = true;
            }

            // move on to the next prime number skipping even numbers
            nextPrime += 2;

            while (nextPrime <= maxNumber && composites[nextPrime]) {
                nextPrime += 2;
            }
        }

        // put prime numbers in the list
        List<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i < maxNumber; i++) {
            if (!composites[i])
                primes.add(i);
        }

        return primes;
    }
}

