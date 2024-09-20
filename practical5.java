import java.util.Scanner;

public class practical5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int numberOfProducts = scanner.nextInt();

        double totalBill = 0;

        for (int i = 0; i < numberOfProducts; i++) {
            System.out.print("Enter product code for product " + (i + 1) + ": ");
            int code = scanner.nextInt();
            System.out.print("Enter price for product " + (i + 1) + ": ");
            double price = scanner.nextDouble();
      
            double taxRate = switch (code) {
                case 1 -> 0.08;  
                case 2 -> 0.12;  
                case 3 -> 0.05;  
                case 4 -> 0.075;
                default -> 0.03;
            };

            double taxAmount = price * taxRate;
            double totalCost = price + taxAmount;

            System.out.printf("Product code: %d, Price: %.2f, Tax Rate: %.2f%%, Tax Amount: %.2f, Total Cost: %.2f%n",
                    code, price, taxRate * 100, taxAmount, totalCost);

            totalBill += totalCost;
        }

        System.out.printf("Total bill amount: %.2f%n", totalBill);
    }
}
