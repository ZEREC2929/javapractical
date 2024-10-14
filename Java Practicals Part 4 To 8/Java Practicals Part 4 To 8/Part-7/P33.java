import java.util.Scanner;

public class P33
{

    static class SumTask implements Runnable
    {
        private final int start;
        private final int end;
        private final int[] result;

        public SumTask(int start, int end, int[] result)
        {
            this.start = start;
            this.end = end;
            this.result = result;
        }

        @Override
        public void run()
        {
            int sum = 0;
            for (int i = start; i <= end; i++)
            {
                sum += i;
            }
            synchronized (result)
            {
                result[0] += sum;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
    
        int N = scanner.nextInt();
        System.out.print("Enter number of threads: ");
    
        int numberOfThreads = scanner.nextInt();

        Thread[] threads = new Thread[numberOfThreads];
        int[] result = new int[1];
    
        int range = N / numberOfThreads;
        int start = 1;

        for (int i = 0; i < numberOfThreads; i++)
        {
            int end = (i == numberOfThreads - 1) ? N : start + range - 1;
            threads[i] = new Thread(new SumTask(start, end, result));
            threads[i].start();
            start = end + 1;
        }

        for (Thread thread : threads)
        {
            try
            {
                thread.join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("Sum of first " + N + " natural numbers is: " + result[0]);
        scanner.close();
    }
}