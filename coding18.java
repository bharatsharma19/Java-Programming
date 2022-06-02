package com.company;
import java.util.Scanner;

public class coding18 {
    public static void main(String[] args) {
        int m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks in Physics : ");
        m1 = sc.nextByte();
        System.out.print("Enter your marks in Chemistry : ");
        m2 = sc.nextByte();
        System.out.print("Enter your marks in Mathematics : ");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.print("Your Percentage is "+avg);
        if(avg>=40 && m1>= 33 && m2>=33 && m3>=33){
            System.out.println("\nCongrats,You've been promoted");
        }
        else{
            System.out.println("\nSorry , Please try again");
        }
    }
}
