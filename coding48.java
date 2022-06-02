package com.company;

class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("Java");
    }
}
class Smartphone extends Phone{
    public void welcome(){
        System.out.println("Good night");
    }
    public void name(){
        System.out.println("Java in class 2");
    }
}

public class coding48 {
    public static void main(String[] args) {
        //Phone obj = new Phone();
        //Smartphone Spobj = new Smartphone();
        //obj.name();
        Phone obj = new Smartphone();
        // Smartphone obj2 = new Phone(); -> Not allowed
        obj.greet();
        obj.name(); // * Special *
    }
}
