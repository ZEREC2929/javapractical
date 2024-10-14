import java.util.Scanner;

interface Shape
{
    double area();
    default String description()
    {
        return "This is a shape.";
    }
    default String color()
    {
        return "Color not specified.";
    }
}

class Circle implements Shape
{
    private double radius;
    private String color;

    public Circle(double radius, String color)
    {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double area()
    {
        return Math.PI * radius * radius;
    }

    @Override
    public String description()
    {
        return "This is a circle with radius " + radius + " and color " + color + ".";
    }

    @Override
    public String color()
    {
        return color;
    }
}

class Rectangle implements Shape
{
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double area()
    {
        return length * width;
    }

    @Override
    public String description()
    {
        return "This is a rectangle with length " + length + ", width " + width + " and color " + color + ".";
    }

    @Override
    public String color()
    {
        return color;
    }
}

class Sign
{
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text)
    {
        this.shape = shape;
        this.text = text;
    }

    public void displaySign()
    {
        System.out.println(shape.description());
        System.out.println("Text on the sign: " + text);
        System.out.println("Area of the shape: " + shape.area());
        System.out.println("Color of the shape: " + shape.color());
    }
}

public class P23
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a shape (circle or rectangle): ");
        String shapeType = scanner.nextLine();
        Shape shape = null;
        
        if (shapeType.equalsIgnoreCase("circle"))
        {
            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            System.out.print("Enter color: ");
            String color = scanner.next();
            shape = new Circle(radius, color);
        }

        else if (shapeType.equalsIgnoreCase("rectangle"))
        {
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            System.out.print("Enter color: ");
            String color = scanner.next();
            shape = new Rectangle(length, width, color);
        }

        else 
        {
            System.out.println("Invalid shape type.");
            scanner.close();
            return;
        }
        
        System.out.print("Enter text for the sign: ");
        scanner.nextLine(); 
        String text = scanner.nextLine();
        
        Sign sign = new Sign(shape, text);
        sign.displaySign();
        
        scanner.close();
    }
}