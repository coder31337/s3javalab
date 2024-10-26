import java.util.Scanner;

public class P2Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine().toLowerCase();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--)
            reversed = reversed + original.charAt(i);

        if (original.equals(reversed))
            System.out.println("Entered string is a palindrome");
        else
            System.out.println("Entered string is not a palindrome");
    }
}
