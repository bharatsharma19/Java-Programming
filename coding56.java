package com.company;

abstract class Pen{
    abstract void write();
    abstract void reFill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing...");
    }
    void reFill(){
        System.out.println("Refilling...");
    }
    void changeNib(){
        System.out.println("Changing the Nib !");
    }
}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello !");
    }
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
}


public class coding56 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.reFill();
        fp.write();
        fp.changeNib();
        fp.write();
        Human Bharat = new Human();
        Bharat.eat();
        Bharat.speak();
        Bharat.sleep();
        Bharat.speak();
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        BasicAnimal lovish = new Human();
        lovish.eat();
        lovish.sleep();
    }
}
