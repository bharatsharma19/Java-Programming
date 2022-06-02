package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i =32;
        System.out.print("Thank You , "+this.getName()+"\n");
    }
}

public class coding62 {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("A");
        MyThr1 t2 = new MyThr1("B");
        MyThr1 t3 = new MyThr1("C");
        MyThr1 t4 = new MyThr1("D");
        MyThr1 t5 = new MyThr1("E");
        MyThr1 t6 = new MyThr1("F");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
