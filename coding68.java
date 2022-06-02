package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class coding68 {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 56;
        marks[1] = 98;
        marks[2] = 69;
        marks[3] = 78;
        marks[4] = 89;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index : ");
        int ind = sc.nextInt();

        System.out.print("Enter the number you want to divide : ");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is "+marks[ind]);
            System.out.println("The valur of array-value/number is "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
}
