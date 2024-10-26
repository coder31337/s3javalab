import java.util.Scanner;

public class P4PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime;
        if (num == 0) {
            isPrime = false;
        } else if (num == 1 || num == 2) {
            isPrime = true;
        } else {
            isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println("Entered number is a prime");
        else
            System.out.println("Entered number is not a prime");
    }
}
