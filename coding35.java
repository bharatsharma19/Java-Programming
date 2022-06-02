package com.company;
import java.util.Scanner;

public class coding35 {
    static int factorial(int n){
        // factorial(n) = n * (n-1) * ... *1
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for finding factorial : ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
}
