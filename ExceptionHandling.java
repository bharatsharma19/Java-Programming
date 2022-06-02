import java.util.Scanner;

class ExceptionHandling {
    public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter first number : ");
            int a = sc.nextInt();
            System.out.print("Enter second number : ");
            int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println("Result : " + c);
        }
        catch (Exception e) {
            System.out.println("ArithmeticException:Division by Zero");
        }
    }
}