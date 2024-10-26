import java.util.Random;

class NumberGenerator extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            System.out.println("\nRandom number is " + randomNumber);
            if (randomNumber % 2 == 0) {
                SquarePrinter squarePrinter = new SquarePrinter(randomNumber);
                squarePrinter.start();
            } else {
                CubePrinter cubePrinter = new CubePrinter(randomNumber);
                cubePrinter.start();
            }
            try {
                sleep(1000);
            } catch (InterruptedException ignored) {}
        }
    }
}

class SquarePrinter extends Thread {
    int num;

    SquarePrinter(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Square is " + num * num);
    }
}

class CubePrinter extends Thread {
    int num;

    CubePrinter(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Cube is " + num * num * num);
    }
}

public class P16ThreadingSquareCube {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.start();
    }
}
