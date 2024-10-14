import java.util.Scanner;

public class P35
{

    static class Incrementer extends Thread
    {
        private int value;

        public Incrementer(int startingValue)
        {
            this.value = startingValue;
        }

        @Override
        public void run()
        {
            while (true)
            {
                value++;
                System.out.println("Value: " + value);
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args)
    {
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter the starting value: ");
        int startingValue = scanner.nextInt();
        
        Incrementer incrementer = new Incrementer(startingValue);
        incrementer.start();
        
        scanner.close();
    }
}