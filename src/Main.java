import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        leftRotation(sc);
    }

    private static void leftRotation(Scanner sc) {
        System.out.println("Enter your left rotation:");

        do {
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int[] arr = new int[]{1, 2, 3, 4, 5};

            arr = LeftRotation.rotLeft(arr, sc.nextInt());

            for (int e : arr) {
                System.out.printf("%s ", e);
            }

            System.out.println();
        }
        while (sc.hasNextInt());
    }

    private static void raiseToPower(Scanner sc) {
        System.out.println("Enter the number and it's power:");

        do {
            float a = sc.nextFloat();
            int p = sc.nextInt();

            float result = RaiseToPower.raise2(a, p);
            System.out.println(result);
        }
        while (sc.hasNextFloat());
    }

    private static void ra() {
        String[] array = new String[]{"Hi", "Hello", "Greetings", "Good morning", "Good evening"};

        RandomizeArray<String> ra = new RandomizeArray<String>();
        ra.Randomize(array);

        for (String s : array) {
            System.out.println(s);
        }
    }

    private static void gcd() {
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
