import java.util.Scanner;

public class practical6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of days
        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Number of days must be positive.");
            return;
        }

        // Fibonacci series initialization
        long a = 0, b = 1;

        // Output Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.println("Day " + i + ": " + a);
            long next = a + b;
            a = b;
            b = next;
        }
    }
}
