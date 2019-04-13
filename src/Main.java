import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number:");

        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int input = sc.nextInt();

        int[] arr = Fibonacci.getFibonaccList(input);

        for (int num : arr)
            System.out.printf("%d ", num);
    }

}
