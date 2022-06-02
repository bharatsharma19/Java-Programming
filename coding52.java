package com.company;

interface Bicycle{
    int a=32;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowhorn1();
    void blowhorn2();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Pee poo pee pee");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speed Up");
    }
    public void blowhorn1(){
        System.out.println("Kabhi Khushi kabhi gum");
    };
    public void blowhorn2(){
        System.out.println("Main hoon naa");
    };
}

public class coding52 {
    public static void main(String[] args) {
        AvonCycle cyclebharat = new AvonCycle();
        cyclebharat.applyBrake(1);
        System.out.println("Breaker : "+cyclebharat.a+"cm");
        cyclebharat.speedUp(5);
        cyclebharat.blowHorn();
        System.out.println("Breaker : "+cyclebharat.a+"cm");
        cyclebharat.speedUp(32);
        cyclebharat.blowhorn1();
        System.out.println("Breaker : "+cyclebharat.a+"cm");
        cyclebharat.blowhorn2();
        cyclebharat.speedUp(16);
    }
}
