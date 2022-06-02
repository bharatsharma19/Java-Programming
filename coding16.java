package com.company;

import java.util.Scanner;

public class coding16 {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("You're going to become an adult");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You're going to get retire");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thank you for using my JAVA CODE!");

    }

}
