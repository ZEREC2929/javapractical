public class P26_2
{
    public static void main(String[] args)
    {
        try
        {
            readFile("nonexistent.txt");
        }
        catch (Exception e)
        {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }

        try
        {
            int result = divide(10, 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }

        try
        {
            checkNull(null);
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught an unchecked exception: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws Exception
    {
        throw new Exception("File not found: " + fileName);
    }

    public static int divide(int x, int y)
    {
        return x / y;
    }

    public static void checkNull(String str)
    {
        if (str == null)
        {
            throw new NullPointerException("String cannot be null.");
        }
        System.out.println("String is: " + str);
    }
}