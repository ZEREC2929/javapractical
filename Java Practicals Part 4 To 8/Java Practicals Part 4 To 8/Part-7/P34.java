import java.util.Random;
import java.util.Scanner;

public class P34 {

    static class RandomNumberGenerator extends Thread {
        private final NumberHandler handler;
        private final int maxNumber;

        public RandomNumberGenerator(NumberHandler handler, int maxNumber) {
            this.handler = handler;
            this.maxNumber = maxNumber;
        }

        @Override
        public void run() {
            Random random = new Random();
            while (true) {
                int number = random.nextInt(maxNumber + 1);
                System.out.println("Generated: " + number);
                handler.processNumber(number);
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class NumberHandler {
        public synchronized void processNumber(int number) {
            if (number % 2 == 0) {
                new SquareCalculator(number).start();
            } else {
                new CubeCalculator(number).start();
            }
        }
    }

    static class SquareCalculator extends Thread {
        private final int number;

        public SquareCalculator(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            int square = number * number;
            System.out.println("Square of " + number + " is: " + square);
        }
    }

    static class CubeCalculator extends Thread {
        private final int number;

        public CubeCalculator(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            int cube = number * number * number;
            System.out.println("Cube of " + number + " is: " + cube);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number (N): ");
        int maxNumber = scanner.nextInt();
        
        NumberHandler handler = new NumberHandler();
        RandomNumberGenerator generator = new RandomNumberGenerator(handler, maxNumber);
        generator.start();
        
        scanner.close();
    }
}