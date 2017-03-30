package com.Multi;


public class Main {
    public static void main(String[] args) {
        CountDown countdown = new CountDown();
        CountDownThread t1 = new CountDownThread(countdown);
        t1.setName("Thread1");
        CountDownThread t2 = new CountDownThread(countdown);
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }
}

class CountDown {
    private int i;

    public void  doCountDown() {
        String color;
        Object localObject = 1;

        switch (Thread.currentThread().getName()) {
            case "Thread1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color = ThreadColor.ANSI_GREEN;
        }


        synchronized (localObject){
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
            }
        }
    }
}

class CountDownThread extends Thread {
    private CountDown threadCountDown;

    public CountDownThread(CountDown countdown) {
        threadCountDown = countdown;
    }

    public void run() {
        threadCountDown.doCountDown();
    }
}