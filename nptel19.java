class RecursiveFactorial{
int n;
int factorial(int n){
if(n == 0)
return(1);
else
return (n*factorial(n-1));
}
}

class nptel19{
public static void main(String[] arg){
RecursiveFactorial x =new RecursiveFactorial();
x.n = Integer.parseInt(arg[0]);
System.out.println("Factorial of "+x.n+ " is "+x.factorial(x.n));
}
}