package com.company;
import java.util.Scanner;

public class coding22 {
    public static void main(String[] args) {
        /*for (int i=1; i <= 10;i++) {
            System.out.println(i);
        }*/
        /*int n = 10;
        for (int i = 0; i <= n ; i++){
            System.out.println(2*i-1);
        }*/
        /*int n = 10;
        for (int i = 0; i <= n ; i++){
            System.out.println(2*i);
        }*/
        /*for (int i = 50; i > 0; i--){
            System.out.println(2*i);
        }*/
        /*for (int i = 50; i > 0; i--){
            System.out.println(2*i-1);
        }*/
        /*for (int i = 7 ; i != 0 ;i--){
            System.out.println(i);
        }*/
        Scanner sc = new Scanner(System.in);
        System.out.println("This program prints the natural number in reversed order from the given number");
        System.out.print("Enter the natural number to start from:");
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
    }
}
