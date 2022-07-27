import java.util.Scanner;

public class MainArrayList {
    
    private static Scanner scanner = new Scanner(System.in);
    private static MyArrayList myArrayList = new MyArrayList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit) {
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    myArrayList.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
        
    }

    public static void printInstruction(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice option.");
        System.out.println("\t 1 - To print th list of myList items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem(){
        System.err.print("Enter the item you want to add to the list : ");
        myArrayList.addList(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.print("Enter the item to be modified : ");
        String item = scanner.nextLine();
        if (myArrayList.findItem(item) != null) {
            System.out.print("Enter the replacement item : ");
            String replacement = scanner.nextLine();
            myArrayList.modifyList(item, replacement);
        } else {
            System.out.println(item + " is not in myList");
        }
    }
    public static void removeItem(){
        System.out.print("Enter the item ro be removed : ");
        String item = scanner.nextLine();
        myArrayList.removeItem(item);
    }
    public static void searchForItem(){
        System.out.print("Enter item to search for : ");
        String item = scanner.nextLine();
        if (myArrayList.findItem(item) != null) {
            System.out.println("Found " + item + " in myList");
        } else {
            System.out.println(item + " is not in myList");
        }
    }

}
