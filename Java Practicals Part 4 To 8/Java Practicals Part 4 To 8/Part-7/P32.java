public class P32 {

    static class HelloWorldThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello World from Thread class");
        }
    }

    static class HelloWorldRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Hello World from Runnable interface");
        }
    }

    public static void main(String[] args) {
        HelloWorldThread thread1 = new HelloWorldThread();
        thread1.start();

        Thread thread2 = new Thread(new HelloWorldRunnable());
        thread2.start();
    }
}