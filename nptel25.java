class Box{
private double width;
private double height;
private double depth;

Box(double w,double h,double d){
width = w;
height = h;
depth = d;
}

double volume(){
return width*height*depth;
}
}

class BoxWeight extends Box{
double weight;

BoxWeight(double w,double h,double d,double m){
super(w,h,d);
weight = m;
}
}

class Shipment extends BoxWeight{
double cost;

Shipment(double w,double h,double d,double m,double c){
super(w,h,d,m);
cost = c;
}
}

class nptel25{
public static void main(String arg[]){
Shipment s1 = new Shipment(10,20,15,10,2.56);
Shipment s2 = new Shipment(2,4,6,0.76,5.12);
double vol;
vol = s1.volume();
System.out.println("Volume of Shipment 1 is "+vol+" met^3");
System.out.println("Weight of Shipment 1 is "+s1.weight+" ton");
System.out.println("Cost of Shipment 1 is "+s1.cost+" trillion");
System.out.println();
vol = s2.volume();
System.out.println("Volume of Shipment 2 is "+vol+" met^3");
System.out.println("Weight of Shipment 2 is "+s2.weight+" ton");
System.out.println("Cost of Shipment 2 is "+s2.cost+" trillion");
}
}
