import java.io.*;

public class P15FileInfo {
    public static void main(String[] args) {
        try {
            FileInputStream fInStream = new FileInputStream("text.txt");
            int charAvailable = fInStream.available();
            char ch;
            int wordCount = 0;
            int lineCount = 0;
            int charCount = 0;
            for (int i = 0; i < charAvailable; i++) {
                ch = (char) fInStream.read();
                if (ch == '\n') {
                    lineCount++;
                    wordCount++;
                } else if (ch == ' ') {
                    wordCount++;
                } else {
                    charCount++;
                }
            }
            fInStream.close();

            System.out.println("Character count = " + charCount);
            System.out.println("Word count = " + wordCount);
            System.out.println("Line count = " + lineCount);
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}
