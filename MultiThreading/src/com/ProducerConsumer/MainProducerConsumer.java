package com.ProducerConsumer;

import com.Multi.*;
import com.Multi.ThreadColor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by simd0922 on 30/03/2017.
 */
public class MainProducerConsumer {
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<String>();
        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_CYAN);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_GREEN);


        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();   182

    }
}
