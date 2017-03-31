package com.ProducerConsumer;

import com.Multi.ThreadColor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;


public class MainProducerConsumer {
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<String>();
        ReentrantLock bufferLock = new ReentrantLock();
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_CYAN, bufferLock);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE,bufferLock);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_GREEN,bufferLock);


        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();

    }
}
