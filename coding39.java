package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class coding39 {
    public static void main(String[] args) {
        MyEmployee bharat = new MyEmployee();
        // bharat.id = 45;
        // bharat.name = "Bharat Sharma"; --> Throws an error due to private access modifier
        bharat.setName("Bharat Sharma");
        System.out.println(bharat.getName());
        bharat.setId(1);
        System.out.println(bharat.getId());
    }
}
