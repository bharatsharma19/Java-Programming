package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius can't be negative!";
    }
    @Override
    public String getMessage(){
        return "Radius can't be negative!";
    }
}


public class coding71 {
    public static double area(double radius) throws NegativeRadiusException{
        if (radius<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * radius * radius;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            int c = divide(6, 0);
            System.out.println(c);
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        try {
            double ar = area(-2);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception 2");
        }
    }
}
