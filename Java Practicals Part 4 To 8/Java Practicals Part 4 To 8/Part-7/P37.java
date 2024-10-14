import java.util.LinkedList;

class ProducerConsumer {
    private final LinkedList<Integer> queue = new LinkedList<>();
    private final int LIMIT = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (queue.size() == LIMIT) {
                    wait();
                }
                queue.add(value);
                System.out.println("Produced: " + value);
                value++;
                notify();
            }
            Thread.sleep(500);
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (queue.isEmpty()) {
                    wait();
                }
                int value = queue.removeFirst();
                System.out.println("Consumed: " + value);
                notify();
            }
            Thread.sleep(500);
        }
    }
}

class Producer extends Thread {
    private final ProducerConsumer pc;

    public Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        try {
            pc.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private final ProducerConsumer pc;

    public Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        try {
            pc.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class P37 {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        new Producer(pc).start();
        new Consumer(pc).start();
    }
}