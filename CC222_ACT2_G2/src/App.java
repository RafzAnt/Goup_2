import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int d) {
        this.data = d;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class App {

    static void insertIntoArray(int[] array, int num, int index) {
        array[index] = num;
        System.out.println("Insert " + num + " into the array");
        System.out.print("Array after insertion: [");
        for (int i = 0; i < index + 1; i++) {
            System.out.print(array[i]);
            if (i < index) System.out.print(", ");
        }
        System.out.println("]");
    }

    static void handleLinkedList(LinkedList linkedList, int num, int position) {
        System.out.println("Insert " + num + " to the linked list");
        if (position == 1) {
            linkedList.insertAtBeginning(num);
        } else if (position == 2) {
            linkedList.insertAtEnd(num);
        }
        System.out.print("Linked list after insertion: ");
        linkedList.display();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList scannerLinkedList = new LinkedList();
        int[] array = new int[10];
        int arrayIndex = 0;

        while (true) {
            System.out.print("Enter a value: ");
            int num = scanner.nextInt();

            System.out.println("Operations:");
            System.out.println("[1] Insert " + num + " into the array");
            System.out.println("[2] Insert " + num + " to the linked list");
            System.out.print("Choice: ");
            int option = scanner.nextInt();

            if (option == 1) {
                if (arrayIndex < array.length) {
                    insertIntoArray(array, num, arrayIndex); 
                    arrayIndex++;
                } else {
                    System.out.println("Array is full");
                }
            } else if (option == 2) {
                System.out.println("Options:");
                System.out.println("[1] Insert at Beginning");
                System.out.println("[2] Insert at End");
                System.out.print("Choice: ");
                int linkedListOption = scanner.nextInt();

                handleLinkedList(scannerLinkedList, num, linkedListOption); 
            }

            System.out.println("Options:");
            System.out.println("[1] Enter a new value");
            System.out.println("[2] End");
            System.out.print("Choice: ");
            int endChoice = scanner.nextInt();

            if (endChoice == 2) {
                break;
            }
        }

        scanner.close();
    }
}
