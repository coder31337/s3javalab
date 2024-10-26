import java.io.*;

public class P13FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream fInStream = new FileInputStream("text.txt");
            FileOutputStream fOutStream = new FileOutputStream("copy.txt");
            int ch;
            while ((ch = fInStream.read()) != -1)
                fOutStream.write(ch);
            fInStream.close();
            fOutStream.close();
            System.out.println("File copied successfully");
        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}
