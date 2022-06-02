package com.company;

class A{
    public int a;
    public int bharat(){
        return 32;
    }
    public void math2(){
        System.out.println("Method 2 of class A");
    }
}
class B extends A{
    @Override
    public void math2(){
        System.out.println("Method 2 of class B");
    }
    public void math3(){
        System.out.println("Method 3 of class B");
    }
}

public class coding47 {
    public static void main(String[] args) {
        A a = new A();
        a.math2();

        B b = new B();
        b.math3();
    }
}
