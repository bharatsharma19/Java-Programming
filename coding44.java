package com.company;

class Base1{
    Base1(){
        System.out.println("It is constructor\n");
    }
    Base1(int a){
        System.out.println("This is a  overloaded constructor with a value "+a);
    }
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{
    Derived1(){
        super(64);
        System.out.println("This is derived class constructor\n");
    }
    Derived1(int x , int y){
        System.out.println("This is overloaded constructor with value of x"+x+"and value of y"+y);
    }

    public int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}

public class coding44 {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        Derived1 d = new Derived1();
    }
}
