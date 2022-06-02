package com.company;

interface sampleInterface{
    void math1();
    void math2();
}
interface childSampleInterface extends sampleInterface{
    void math3();
    void math4();
}
class mysampleClass implements childSampleInterface{
    public void math1(){
        System.out.println("Math 1");
    }
    public void math2(){
        System.out.println("Math 2");
    }
    public void math3(){
        System.out.println("Math 3");
    }
    public void math4(){
        System.out.println("Math 4");
    }
}

public class coding54 {
    public static void main(String[] args) {
        mysampleClass msc = new mysampleClass();
        msc.math1();
        msc.math2();
        msc.math3();
        msc.math4();
    }
}
