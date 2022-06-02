import java.util.Scanner; 
 
public class nptel10 
{  
public static void main(String[] args)    
{ 
Scanner sc = new Scanner(System.in);  
System.out.print("Enter radius: "); 
double radius = sc.nextDouble();   
double area = (22/7)*radius*radius;
System.out.println("Area is "+area);
}  
}