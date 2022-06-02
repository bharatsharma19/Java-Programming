import java.util.Scanner; 
 
public class nptel9   
{  
public static void main(String[] args)    
{ 
Scanner sc = new Scanner(System.in);  
System.out.print("Enter 1st number: "); 
int a = sc.nextInt();   
System.out.print("Enter 2nd number: ");    
int b = sc.nextInt();  
if(a > b){
System.out.printf("Between %d and %d,Maximum is %d \n",a,b,a);
}
else{
  System.out.printf("Between %d and %d,Maximum is %d \n",a,b,b);
}
}  
}