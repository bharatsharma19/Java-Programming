package com.company;

class Base{
    int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void printMe(){
        System.out.println("This is Constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class coding43 {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(16);
        System.out.println(b.getX());

        Derived d = new Derived();
        d.setY(512);
        System.out.println(d.getY());
    }
}
