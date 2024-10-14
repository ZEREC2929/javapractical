import java.util.Scanner;

class Degree
{
    public void getDegree()
    {
        System.out.println("I got a degree.");
    }
}

class Undergraduate extends Degree
{
    @Override
    public void getDegree()
    {
        System.out.println("I am an Undergraduate.");
    }
}

class Postgraduate extends Degree
{
    @Override
    public void getDegree()
    {
        System.out.println("I am a Postgraduate.");
    }
}

public class P21
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your degree type (Undergraduate/Postgraduate): ");
        String degreeType = scanner.nextLine();

        Degree degree;

        if (degreeType.equalsIgnoreCase("Undergraduate"))
        {
            degree = new Undergraduate();
        }
        else if (degreeType.equalsIgnoreCase("Postgraduate"))
        {
            degree = new Postgraduate();
        }
        else
        {
            degree = new Degree();
            System.out.println("Invalid input, defaulting to general degree.");
        }

        degree.getDegree();

        scanner.close();
    }
}