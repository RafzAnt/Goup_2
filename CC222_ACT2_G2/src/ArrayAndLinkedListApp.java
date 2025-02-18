import java.util.LinkedList;
import java.util.Scanner;

public class ArrayAndLinkedListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int arraySize = 0;
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        while (true) {
            System.out.print("Enter a value: ");
            int value = scanner.nextInt();
            
            System.out.println("Operations:");
            System.out.println("[1] Insert " + value + " into arrays");
            System.out.println("[2] Insert " + value + " to the linked list");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                array[arraySize++] = value;
                System.out.print("Array after insertion:[");
                for (int i = 0; i < arraySize; i++) {
                    System.out.print(array[i]);
                    if (i < arraySize - 1) System.out.print(", ");
                }
                System.out.println("]");
            } else if (choice == 2) {
                System.out.println("Insert " + value + " at:");
                System.out.println("[1] Beginning");
                System.out.println("[2] End");
                System.out.print("Choice: ");
                int position = scanner.nextInt();
                
                if (position == 1) {
                    linkedList.addFirst(value);
                } else {
                    linkedList.addLast(value);
                }
                
                System.out.print("Linked list after insertion: ");
                for (Integer num : linkedList) {
                    System.out.print(num + "-null");
                }
                System.out.println();
            }
            
            System.out.println("Options:");
            System.out.println("[1] Enter a new value");
            System.out.println("[2] End");
            System.out.print("Choice: ");
            int exitChoice = scanner.nextInt();
            
            if (exitChoice == 2) {
                break;
            }
        }
        
        scanner.close();
    }
}
