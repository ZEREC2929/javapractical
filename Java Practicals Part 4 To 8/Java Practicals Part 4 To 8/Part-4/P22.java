import java.util.Scanner;

interface AdvancedArithmetic
{
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic
{
    @Override
    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            { 
                sum += i;
            }
        }
        return sum;
    }
}

public class P22
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate the sum of its divisors: ");
        int n = scanner.nextInt();        

        MyCalculator calculator = new MyCalculator();
        int result = calculator.divisor_sum(n);
        System.out.println("The sum of divisors of " + n + " is: " + result);

        scanner.close();
    }
}