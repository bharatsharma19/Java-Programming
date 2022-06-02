package com.company;
import java.lang.Math;

class Calculator{
    public void calculate(int a,int b){
        System.out.println("Your result is "+(a+b));
    }
}
class scCalculator{
    public void calculate(int a,int b){
        System.out.println("Your result is "+Math.sin(a+b));
    }
}
class HyCalculator{
    public void calculate(int a,int b){
        System.out.println("Your result is "+(a+b));
        System.out.println("Your result is "+Math.sin(a+b));
    }
}

public class coding58 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.calculate(56,4);
        scCalculator c2 = new scCalculator();
        c2.calculate(45,45);
        HyCalculator c3 = new HyCalculator();
        c3.calculate(30,60);
    }
}
