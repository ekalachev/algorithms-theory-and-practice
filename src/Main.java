import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");

        do {
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            List<Integer> arr = FindPrimeNumbers.findPrimeNumbers(sc.nextInt());

            for (int e : arr) {
                System.out.printf("%s ", e);
            }

            System.out.println();
        }
        while (sc.hasNextInt());
    }
}
