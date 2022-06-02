package com.company;

public class coding30 {
    static void tellJoke(){
        System.out.println("It's a joke!");
    }
    static float sum(float a,float b){
        float c;
        c = a+b;
        return c;
    }
    public static void main(String[] args) {
        tellJoke();
        float x = 65.6f;
        float y = 65.4f;
        float z;
        z = sum(x,y);
        System.out.println(z);
    }
}
