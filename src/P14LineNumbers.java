import java.io.*;

public class P14LineNumbers {
    public static void main(String[] args) {
        try {
            FileInputStream fInStream = new FileInputStream("text.txt");
            char ch;
            int lineNum = 1;
            int charAvailable = fInStream.available();
            System.out.print(lineNum++ + ": ");
            for (int i = 0; i < charAvailable; i++) {
                ch = (char) fInStream.read();
                System.out.print(ch);
                if (ch == '\n')
                    System.out.print(lineNum++ + ": ");
            }
            fInStream.close();
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}
