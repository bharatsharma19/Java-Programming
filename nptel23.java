class Z{
int i;
}

class Y extends Z{
int i;
Y(int a,int b){
super.i = a;
i = b;
}

void show(){
System.out.println("i in superclass "+super.i);
System.out.println("i in subclass "+i);
}
}

class nptel23{
public static void main(String arg[]){
Y subOb = new Y(1,2);
subOb.show();
}
}