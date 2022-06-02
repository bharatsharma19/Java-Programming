class A{
int i,j;

void showij(){
System.out.println("i and j = "+i+" and "+j);
}
}

class B extends A{
int k;

void showk(){
System.out.println("k = "+k);
}
void sum(){
System.out.println("i+j+k ="+(i+j+k));
}
} 

class nptel21{
public static void main(String arg[]){
A superOb = new A();
B subOb = new B();
superOb.i = 12;
superOb.j = 16;
System.out.println("Contents of superOb :-");
superOb.showij();
System.out.println();

subOb.i = 4;
subOb.j = 7;
subOb.k = 9;
System.out.println("Contents of subOb :-");
subOb.showij();
subOb.showk();
System.out.println();
System.out.println("Sum of i,j & k in subOb is ");
subOb.sum();
}
}