package com.company;

import java.util.ArrayDeque;

public class coding76 {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(1);
        ad1.add(7);
        ad1.add(5);
        ad1.addFirst(9);
        System.out.println(ad1);
        System.out.println(ad1.getLast());
        ad1.push(8);
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
    }
}
