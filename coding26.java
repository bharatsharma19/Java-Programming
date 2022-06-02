package com.company;

public class coding26 {
    public static void main(String[] args) {
        int [] marks = {98,65,98,97,99};
        /*
        //float [] marks1 = {10.5f,11f,11.5f,12f,12.5f};
        //String [] students = {"Bharat","Harry"};
        //System.out.println(marks1[1]);
        //System.out.println(students.length);
        //System.out.println(students[1]);
        //System.out.println(marks.length);
        */
        System.out.println("Printing an array using for-loop:");
        for (int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Printing an array in reverse order using for-loop:");
        for (int i = marks.length-1 ; i>=0 ; i--){
            System.out.println(marks[i]);
        }
        System.out.println("Printing an array using for-each loop:");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
