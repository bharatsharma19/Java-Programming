package com.company;

import java.util.Scanner;

public class coding73 {
    public static void main(String[] args) {
        /* Problem 1
        int a = 7 -> Syntax Error
        int year_born = 2000 - 78; -> Logical Error
        System.out.println(6/0); -> Throw an exception
         */
        /*
        // Problem 2
        try{
            int a = 666/0;
        }
        catch (IllegalArgumentException e){
            System.out.println("Haha");
        }
        catch (ArithmeticException e){
            System.out.println("Hehe");
        }
        */

        // Problem 3
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 64;
        marks[1] = 79;
        marks[2] = 84;
        Scanner sc = new Scanner(System.in);
        int index;
        int i =0;
        while(flag && i<5){
            try {
                System.out.print("Enter the value of Index:");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error!");
        }
    }
}
