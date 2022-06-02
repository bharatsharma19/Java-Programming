class nptel16{
public static void main(String[] arg){
int num;
boolean isPrime = true;
num = Integer.parseInt(arg[0]);
for(int i=2; i<=num; i++){
if((num % i) == 0) {
isPrime = false;
break;
}
}
if(isPrime) System.out.println("Prime");
else System.out.println("Not prime");
}
}