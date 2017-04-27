package com.ProducerConsumer;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by dimon on 4/5/2017.
 */
public class DeadLock {


    public  static Object lock1 = new Object();
    public  static Object lock2 = new Object();
    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();

    }

    static class Thread1 extends  Thread{
        public void run(){
            synchronized (lock1) {
                System.out.println("Thread1 HAS lock1");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){

                }
                System.out.println("Thread1 waiting for lock2");
                synchronized (lock2){
                    System.out.println("Thread1 HAS the lock1+lock2");
                }
                System.out.println("Thread1 realesed lock2");
            }
            System.out.println("Thread1 realeased lock1");
        }
    }

    static class Thread2 extends  Thread{
        public void run(){
            synchronized (lock2) {
                System.out.println("Thread2 HAS lock2");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){

                }
                System.out.println("Thread2 waiting for lock1");
                synchronized (lock1){
                    System.out.println("Thread2 HAS the lock1+lock2");
                }
                System.out.println("Thread2 realesed lock1");
            }
            System.out.println("Thread2 realeased lock2");
        }
    }
}
