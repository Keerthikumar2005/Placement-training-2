import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch(op) {
            case '+': System.out.println("Sum: " + (a + b)); break;
            case '-': System.out.println("Difference: " + (a - b)); break;
            case '*': System.out.println("Product: " + (a * b)); break;
            case '/': System.out.println("Quotient: " + (a / b)); break;
            default: System.out.println("Invalid operator");
        }
    }
}
