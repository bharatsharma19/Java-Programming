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

class nptel1{
public static void main(String args[])
{
Circle c = new Circle();
c.x=0.0;
c.y=0.0;
c.r=5.0;
System.out.println("Circumferance : "+c.circumferance());
System.out.println("Area : "+c.area());
}
}