package com.company;
import java.util.Scanner;
//import java.util.Scanner;
//import java.util.*;

class G{
    public int x=4;
    protected int y = 64;
    int z = 12;
    private int w = 32;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}
class G2 extends G{
    @Override
    public void meth1() {
        super.meth1();
    }
}

public class coding57 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        //System.out.print("Enter a number : ");
        //int a = sc.nextInt();
        //System.out.println("You entered "+a);
        G2 c = new G2();
        //c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.w);
    }
}
