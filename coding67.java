package com.company;
import java.util.Scanner;

public class coding67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        float a = sc.nextFloat();
        System.out.print("Enter second number : ");
        float b = sc.nextFloat();
        try {
            float c = a / b;
            System.out.println("Result is "+c);
        }
        catch (Exception e) {
            System.out.println("Failed to Divide");
            System.out.println(e);
        }
    }
}
