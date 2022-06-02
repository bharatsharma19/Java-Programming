package com.company;

import java.lang.*;

class Cylinder{
    private double radius;
    private double height;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double surfaceArea(){
        return (2*(Math.PI)*radius*radius)+(2*(22/7)*radius*height);
    }
    public double volume(){
        return (Math.PI)*radius*radius*height;
    }
}

class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return width;
    }
}

public class coding42 {
    public static void main(String[] args) {
        /*
        // Problem 1
        Cylinder mycylinder = new Cylinder();
        mycylinder.setHeight(12);
        double h = mycylinder.getHeight();
        System.out.println(h);
        mycylinder.setRadius(9);
        double r = mycylinder.getRadius();
        System.out.println(r);
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
         */
         // Problem 2
        Rectangle r = new Rectangle(6.248,9.698);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }
}
