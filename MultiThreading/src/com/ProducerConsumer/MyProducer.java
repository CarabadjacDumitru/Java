package com.ProducerConsumer;

import java.util.List;
import java.util.Random;

/**
 * Created by simd0922 on 30/03/2017.
 */
public class MyProducer implements Runnable {
    private List<String> buffer;
    private String color;

    public MyProducer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] nums={"1","2","3","4","5"};

        for(String num : nums){
            try {
                System.out.println(color+"Adding ...." + num);
                buffer.add(num);
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Producer was interrupted");
            }
        }
        System.out.println(color+"Adding EOF and exiting ...");
        buffer.add("EOF");
    }
}
