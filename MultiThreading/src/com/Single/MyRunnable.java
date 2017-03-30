package com.Single;


import com.ProducerConsumer.ThreadColor;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(ThreadColor.ThreadColor.ANSI_RED  + "Hello from My Runnable implementation");
    }
}
