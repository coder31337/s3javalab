import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class DoublyLinkedList {
    Node head = null;

    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node ptr = head;
            System.out.println("Displaying list...");
            while (ptr != null) {
                System.out.print(ptr.data + "  ");
                ptr = ptr.right;
            }
            System.out.println();
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node ptr = head;
            while (ptr.right != null) {
                ptr = ptr.right;
            }
            ptr.right = newNode;
            newNode.left = ptr;
        }
        System.out.println(data + " inserted to list");
    }

    void delete() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            int deletedData = head.data;
            head = head.right;
            if (head != null) {
                head.left = null;
            }
            System.out.println(deletedData + " deleted from list");
        }
    }
}

public class P22DoublyLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dList = new DoublyLinkedList();
        int choice;
        while (true) {
            System.out.println("\nDoubly Linked List Operations");
            System.out.println("[1] Display");
            System.out.println("[2] Insert");
            System.out.println("[3] Delete");
            System.out.println("[4] Exit");
            System.out.print("Enter a choice: ");
            choice = scanner.nextInt();
            if (choice == 1) {
                dList.display();
            } else if (choice == 2) {
                System.out.print("Enter the value: ");
                dList.insert(scanner.nextInt());
            } else if (choice == 3) {
                dList.delete();
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("INVALID CHOICE");
            }
        }
    }
}
