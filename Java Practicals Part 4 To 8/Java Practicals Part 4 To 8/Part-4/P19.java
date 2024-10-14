import java.util.Scanner;

class Rectangle
{
    double length, breadth;

    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea()
    {
        System.out.println("Area: " + (length * breadth));
    }

    public void printPerimeter()
    {
        System.out.println("Perimeter: " + (2 * (length + breadth)));
    }
}
class Square extends Rectangle
{
    public Square(double side)
    {
        super(side, side);
    }
}
public class P19
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Rectangle[] shapes = new Rectangle[2];

        System.out.println("Enter length of Rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter breadth of Rectangle: ");
        double breadth = scanner.nextDouble();

        shapes[0] = new Rectangle(length, breadth);
        System.out.println("Enter side of Square: ");
        
        double side = scanner.nextDouble();
        shapes[1] = new Square(side);

        System.out.println("------------------");

        for (Rectangle shape : shapes)
        {
            shape.printArea();
            shape.printPerimeter();
            System.out.println();
        }

        scanner.close();
    }
}