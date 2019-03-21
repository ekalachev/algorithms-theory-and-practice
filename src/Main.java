import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello to the program 'The biggest common divisor'");

        Scanner sc = new Scanner(System.in);
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();

        System.out.println("Please, enter two numbers (to terminate, enter any character except a number):");

        do {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(gcd.GCD(a, b));
        }
        while (sc.hasNextInt());

        System.out.println("The program has finished!");
    }
}
