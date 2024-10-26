class Table {
    synchronized void printRows(int num) {
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " x " + num + " = " + i * num);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignored) {}
        }
    }
}

class Thread2 extends Thread {
    Table table;

    Thread2(Table table) {
        this.table = table;
    }

    public void run() {
        table.printRows(2);
    }
}

class Thread7 extends Thread {
    Table table;

    Thread7(Table table) {
        this.table = table;
    }

    public void run() {
        table.printRows(7);
    }
}

public class P18ThreadingSynchronization {
    public static void main(String[] args) {
        Table sharedTable = new Table();
        Thread2 thread2 = new Thread2(sharedTable);
        Thread7 thread7 = new Thread7(sharedTable);

        thread2.start();
        thread7.start();
    }
}
