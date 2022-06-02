class RecursiveFibonacci{
int n;
int fibonacci(int n){
if(n == 0)
return 0;
else if(n == 1)
return 1;
else
return (fibonacci(n-1) + fibonacci(n-2));
}
}

class nptel20{
public static void main(String[] arg){
RecursiveFibonacci x =new RecursiveFibonacci();
x.n = Integer.parseInt(arg[0]);
for(int i=0;i <= x.n;i++){
System.out.println(x.fibonacci(i));
}
}
}