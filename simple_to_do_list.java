import java.util.Scanner;

public class simple_to_do_list {
    public static void main(String[] args) {
        
        String[] toDoItems = new String[10];
        int itemCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("To-Do List Options:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (itemCount < toDoItems.length) {
                        System.out.print("Enter the item to add: ");
                        String item = scanner.next();
                        toDoItems[itemCount] = item;
                        itemCount++;
                        System.out.println("Item added to the list.");
                    } else {
                        System.out.println("The to-do list is full.");
                    }
                    break;
                case 2:
                    if (itemCount > 0) {
                        System.out.print("Enter the index of the item to remove: ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < itemCount) {
                            for (int i = index; i < itemCount - 1; i++) {
                                toDoItems[i] = toDoItems[i + 1];
                            }
                            itemCount--;
                            System.out.println("Item removed from the list.");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    } else {
                        System.out.println("The to-do list is empty.");
                    }
                    break;
                case 3:
                    if (itemCount > 0) {
                        System.out.println("To-Do List:");
                        for (int i = 0; i < itemCount; i++) {
                            System.out.println((i + 1) + ". " + toDoItems[i]);
                        }
                    } else {
                        System.out.println("The to-do list is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

 
  
           