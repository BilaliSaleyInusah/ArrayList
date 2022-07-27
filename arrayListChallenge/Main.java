import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quite = false;
        int choice = 0;
        printOption();
        while (!quite) {
            System.out.println("");
            System.out.print("Enter number to choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printOption();
                    break;
                case 1:
                    mobilePhone.printList();
                    break;
                case 2:
                     addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                   findContact();
                    break;
                case 6:
                    quite = true;
                    break;
            }
            
        }

    }

    private static void printOption(){
        System.out.println("\n Press :");
        System.out.println("\t 0 : to see menu of options avaliable ");
        System.out.println("\t 1 : to see all the avaliable contacts");
        System.out.println("\t 2 : to add contact to the system");
        System.out.println("\t 3 : to modify contact in the system");
        System.out.println("\t 4 : to remove contact from the system");
        System.out.println("\t 5 : to search for contact in the system");
        System.out.println("\t 6 : to quite the system");
    }

    private static void addContact(){
        System.out.print("Enter the name : ");
        String name = scanner.nextLine();
        System.out.print("Enter the number : ");
        String number = scanner.nextLine();
        System.out.println("Contact adding .........");
        mobilePhone.addContact(name, number);
    }

    private static void modifyContact(){
        System.out.print("Enter the name of contact you want to modify : ");
        String name = scanner.nextLine();
        if (mobilePhone.findContact(name)) {
            System.out.print("Enter the new name : ");
            String newName = scanner.nextLine();
            mobilePhone.modifyContact(name, newName, number);
        } else {
                System.out.println( name + " is not in the system");
            }
    }

    private static void removeContact(){
        System.out.print("Enter the name of the contact to removed : ");
        String name = scanner.nextLine();
        System.out.println("Searching for " + name);
        mobilePhone.removeContact(name);
    }

    private static void findContact(){
        System.out.print("Enter the name : ");
        String name = scanner.nextLine();
        System.out.println("Searching for " + name);
        mobilePhone.searchContact(name);
    }

}