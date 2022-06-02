import java.io.*;

 
public class nptel11
{
  
public static void main (String args[]) 
  {
    
Float principalAmount = new Float (0);
    
Float rateOfInterest = new Float (0);
    
int numberOfYears = 0;
    
try
    {
      
DataInputStream in = new DataInputStream (System.in);
      
 
String tempString;
      
System.out.print ("Enter Principal amount : ");
      
System.out.flush ();
      
tempString = in.readLine ();
      
 
principalAmount = Float.valueOf (tempString);
      
System.out.print ("Enter Rate of Interest : ");
      
System.out.flush ();
      
tempString = in.readLine ();
      
 
System.out.print ("Enter Years : ");
      
System.out.flush ();
      
tempString = in.readLine ();
      
numberOfYears = Integer.parseInt (tempString);
      
float interestTotal = principalAmount * rateOfInterest * numberOfYears;
      
System.out.println ("Total Interest = " + interestTotal);
    
} 
catch (Exception ex) 
    {
} 
} 
}
