package com.company;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("ID of Employee is "+id);
        System.out.println("Name of Employee is "+name);
    }
    public int getSalary(){
        return salary;
    }
}

public class coding37 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee bharat = new Employee();
        bharat.id = 1;
        bharat.name = "Bharat Sharma";
        bharat.salary = 58276854;
        //System.out.println(bharat.id);
        bharat.printDetails();
        int salary = bharat.getSalary();
        System.out.println(salary);
        Employee vivek = new Employee();
        vivek.id = 2;
        vivek.name = "Vivek Sharma";
        vivek.salary = 4646131;
        vivek.printDetails();
        int salary1 = vivek.getSalary();
        System.out.println(salary1);
    }
}
