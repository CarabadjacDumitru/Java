package com.Single;

import com.ProducerConsumer.ThreadColor;

public class Main {

    public static void main(String[] args) {
        //System.out.println(ThreadColor.ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("==Another Thread==");
        anotherThread.start();




        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(com.ProducerConsumer.ThreadColor.ThreadColor.ANSI_RED + "Hello from My Runnable implementation");
                try {
                    anotherThread.join(2000);
                    System.out.println(com.ProducerConsumer.ThreadColor.ThreadColor.ANSI_RED+ "Another Thread   TERMINATED or TimeOUT so i a  running again");
                }catch (InterruptedException e){
                    System.out.println(ThreadColor.ThreadColor.ANSI_RED + "I could wait . I was interrupted");
                }
            }
        });
        myRunnableThread.start();


    }
}

/*
*
new Thread() {
public void run() {
    System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
}
}.start();

*/