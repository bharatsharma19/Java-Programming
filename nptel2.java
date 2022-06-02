class Circle{
double x,y;
double r;
double circumferance(){
return 2*(22/7)*r;
}
double area(){
return (22/7)*r*r;
}
}

class nptel2{
public static void main(String args[])
{
Circle c1 = new Circle();
Circle c2 = new Circle();
c1.x=3.0;
c1.y=4.0;
c1.r=5.0;
c2.x=-4.0;
c2.y=-8.0;
c2.r=10.0;
System.out.println("Circumferance : "+c1.circumferance());
System.out.println("Area : "+c1.area());
System.out.println("Circumferance : "+c2.circumferance());
System.out.println("Area : "+c2.area());
}
}