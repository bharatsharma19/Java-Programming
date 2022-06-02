package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("Constructor of Parent");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child extends Parent{
    @Override
    public void greet() {
        System.out.println("Good Morning!");
    }
    public void greet2() {
        System.out.println("Good Afternoon!");
    }
}
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("Hello!");
    }
}

public class coding51 {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.greet();
        c1.greet2();
        }
    }
