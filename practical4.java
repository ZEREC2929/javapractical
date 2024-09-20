import java.util.Scanner;

public class practical4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days in the month: ");
        int days = scanner.nextInt();

        double[] expenses = new double[days];

        for (int i = 0; i < days; i++) {
            System.out.print("Enter expense for day " + (i + 1) + ": ");
            expenses[i] = scanner.nextDouble();
        }

        double totalExpenses = 0;
        for (double expense : expenses) {
            totalExpenses += expense;
        }

        System.out.printf("Total expenses for the month: %.2f%n", totalExpenses);
    }
}
