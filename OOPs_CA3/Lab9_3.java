package application;

import java.util.LinkedList;
import java.util.Queue;

class SharedBuffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;

    public SharedBuffer(int capacity) {
        this.capacity = capacity;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();  // Wait if the buffer is full
        }
        queue.add(item);
        System.out.println("Produced: " + item);
        notify();  // Notify the consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();  // Wait if the buffer is empty
        }
        int item = queue.poll();
        System.out.println("Consumed: " + item);
        notify();  // Notify the producer
        return item;
    }
}

class Producer implements Runnable {
    private SharedBuffer buffer;

    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int item = 0;
        while (true) {
            try {
                buffer.produce(item++);
                Thread.sleep(500);  // Slow down production for demonstration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.consume();
                Thread.sleep(1000);  // Slow down consumption for demonstration
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Lab9_3 {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer(5);  // Buffer capacity is 5

        Thread producerThread = new Thread(new Producer(buffer));
        Thread consumerThread = new Thread(new Consumer(buffer));

        producerThread.start();
        consumerThread.start();
    }
}
