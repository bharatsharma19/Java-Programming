abstract class Base{
abstract void fun();
}

class Derived extends Base{
void fun(){
System.out.println("Derived fun() is called !");
}
}

class nptel26{
public static void main(String arg[]){
Base b = new Derived();
b.fun();
}
}