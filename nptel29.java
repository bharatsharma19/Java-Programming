/*
class F{
int i;
private int j;

void setij(int x,int y){
i = x;
j = y;
}
}

class J extends F{
int total;

void sum(){
total = i + j;
}
}

class nptel29{
public static void main(String arg[]){
J subOb = new J();
subOb.setij(56,34);
System.out.println("Total : "+sum);
}
}
*/

class F {
    public void msg1() {
        System.out.println("Class F : Public!");
    }

    private void msg2() {
        System.out.println("Class F : Private!");
    }

    protected void msg3() {
        System.out.println("Class F : Protected!");
    }
}

public class nptel29 extends F {
    void msg() {
        System.out.println("Class Main : Welcome!");
    }

    public void msg1() {
        System.out.println("Overriding Public Method!");
    }

    void msg2() {
        System.out.println("Overriding Private Method!");
    }

    public void msg3() {
        System.out.println("Overriding Protected Method!");
    }

    public static void main(String arg[]) {
        nptel29 obj = new nptel29();
        obj.msg();
    }
}
