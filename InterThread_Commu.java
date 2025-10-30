
class Buffer {

    int data;
    boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();
        }
        data = value;
        available = true;
        System.out.println("Produced : " + data);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        System.out.println("Consumed : " + data);
        available = false;
        notify();
    }
}

class Producer extends Thread {

    Buffer buffer;

    Producer(Buffer b) {
        buffer = b;
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                buffer.produce(i);
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}

class Consumer extends Thread {

    Buffer buffer;

    Consumer(Buffer b) {
        buffer = b;
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            try {
                buffer.consume();
            } catch (Exception e) {
            }
        }
    }
}

public class InterThread_Commu {

    public static void main(String[] args) {
        Buffer b = new Buffer();
        new Producer(b).start();
        new Consumer(b).start();
    }
}
