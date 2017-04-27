package com.ProducerConsumer;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class MyProducer implements Runnable {
    private ReentrantLock bufferLock;
    private List<String> buffer;
    private String color;

    public MyProducer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }


    public void run() {

        String[] nums = {"1", "2", "3", "4", "5"};

        for (String num : nums) {
            try {
                bufferLock.lock();
                System.out.println(color + "Adding ...." + num);
                buffer.add(num);
                bufferLock.unlock();

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }
        System.out.println(color + "Adding EOF and exiting ...");
        bufferLock.lock();
        buffer.add("EOF");
        bufferLock.unlock();

    }
}

