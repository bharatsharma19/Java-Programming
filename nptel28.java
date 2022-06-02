abstract class Bike{}

class Honda1 extends Bike{
void run(){
System.out.println("Running safely with 100kmph ");
}
}

final class nptel28{
public static void main(String arg[]){
Honda1 bike = new Honda1();
bike.run();
}
}