package com.company;

public class coding29 {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z = x + y;
        }
        else{
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        //coding29 obj = new coding29();
        c = logic(a,b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1,b1);
        int m = 56;
        int n = 64;
        int o;
        o = logic(m,n);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(o);
    }
}
