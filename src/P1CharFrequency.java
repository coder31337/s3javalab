import java.util.Scanner;

public class P1CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        System.out.println("Character\tCount");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int count = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (ch == sentence.charAt(i))
                    count++;
            }
            if (count != 0)
                System.out.println(ch + "\t\t" + count);
        }
    }
}
