import java.util.Scanner;
public class converter 
{
    public static void main(String[] args)
    {
        double rate = 100.00;
        double pounds = 0.0;
        Scanner sc = new Scanner(System.in);
        if(args.length>0)
        {
            pounds = Double.parseDouble(args[0]);
        }
        else
        {
            System.out.println("Enter amount in pounds: ");
            pounds = sc.nextDouble();
            sc.close();
        }
        System.out.println(pounds + " Pounds = " + (pounds * rate ) + " Rupees" );
    }
}