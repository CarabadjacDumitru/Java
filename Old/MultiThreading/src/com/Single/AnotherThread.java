package com.Single;


import com.ProducerConsumer.ThreadColor;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(com.ProducerConsumer.ThreadColor.ANSI_BLUE + "Hello from " + currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(com.ProducerConsumer.ThreadColor.ANSI_BLUE + " Another thread woke me up");
        }

        System.out.println(ThreadColor.ANSI_BLUE + "Five seconds have passed and I am AWAKE");
    }
}