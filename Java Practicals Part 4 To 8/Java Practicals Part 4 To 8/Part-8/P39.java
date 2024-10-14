import java.util.Arrays;
import java.util.Scanner;

public class P39 {

    public static <T extends Comparable<T>> void sort(T[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            products[i] = new Product(name, price);
        }

        sort(products);

        System.out.println("Sorted products by price:");
        for (Product product : products) {
            System.out.println(product);
        }

        scanner.close();
    }
}

class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}