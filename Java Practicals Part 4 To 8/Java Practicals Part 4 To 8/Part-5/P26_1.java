import java.util.Scanner;

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}

public class P26_1 {
    public static void validateAge(int age) throws InvalidAgeException
    {
        if (age < 0 || age > 120)
        {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
        System.out.println("Valid age: " + age);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");

        try
        {
            int age = scanner.nextInt();
            validateAge(age); 
        }
        catch (InvalidAgeException e)
        {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        finally
        {
            scanner.close();
        }
    }
}