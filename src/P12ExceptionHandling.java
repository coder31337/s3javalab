import java.util.Scanner;

public class P12ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a divident: ");
        int divident = scanner.nextInt();
        System.out.print("Enter a divisor: ");
        int divisor = scanner.nextInt();
        try {
            int quotient = divident / divisor;
            System.out.println("Quotient is " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
