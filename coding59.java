package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i <= 1) {
            System.out.println("Thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i < 2) {
            System.out.println("Thread 2 is running");
            System.out.println("I am happy 2");
            i++;
        }
    }
}

public class coding59 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
