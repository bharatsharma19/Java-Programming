abstract class Base1{
Base1(){
System.out.println("Base constructor is called !");
};
}

class Derived1 extends Base1{
Derived1(){
System.out.println("Derived constructor is called !");
}
void fun(){
System.out.println("Derived fun() is called !");
}
}

class nptel27{
public static void main(String arg[]){
Derived1 d = new Derived1();
d.fun();
}
}