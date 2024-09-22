import java.util.Scanner;

public class Area {
    private int length, breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = scanner.nextInt();

        Area rectangle = new Area(length, breadth);
        System.out.println("Area of the rectangle: " + rectangle.returnArea());
        scanner.close();
    }
}
