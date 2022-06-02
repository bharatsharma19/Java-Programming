package com.company;

class MythreadRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Running 1!");
    }
}
class Mythread2Runnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Running 2!");
    }
}

public class coding60 {
    public static void main(String[] args) {
        MythreadRunnable bullet1 = new MythreadRunnable();
        Thread gun1 = new Thread(bullet1);
        Mythread2Runnable bullet2 = new Mythread2Runnable();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
