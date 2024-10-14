public class P25
{
    public static void main(String[] args) {
        try
        {
            checkPositiveNumber(-5);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }

    public static void checkPositiveNumber(int number)
    {
        if (number < 0)
        {
            throw new IllegalArgumentException("The number must be positive. Provided: " + number);
        }

        System.out.println("The number is positive: " + number);
    }
}