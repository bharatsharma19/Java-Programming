package com.company;

public class coding32 {
    /*
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
    */

    static int sum(int ...arr){
        int result = 0;
        for(int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome\n");
        System.out.println("Sum of 6 & 7 is "+sum(6,7));
        System.out.println("Sum of 4,5 & 6  is "+sum(4,5,6));
        System.out.println("Sum of 8,9,10 & 11 is "+sum(8,9,10,11));
        System.out.println("Sum of 8,9,10,11 & 12 is "+sum(8,9,10,11,12));
    }
}
