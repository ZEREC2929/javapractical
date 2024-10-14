import java.util.Scanner;

public class P24
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); 
        try
        {
            System.out.print("Enter the first integer (x): ");
            String inputX = scanner.nextLine();
            int x = Integer.parseInt(inputX);

            System.out.print("Enter the second integer (y): ");
            String inputY = scanner.nextLine();
            int y = Integer.parseInt(inputY);

            if (y == 0)
            {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            double result = (double) x / y;
            System.out.println("Result of " + x + " / " + y + " = " + result);

        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: Please enter valid integers.");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        finally
        {
            scanner.close();
        }
    }
}