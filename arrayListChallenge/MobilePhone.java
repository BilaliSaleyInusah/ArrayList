import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private  ArrayList<String> contactName = new ArrayList<String>();
    private  ArrayList<String> contactNumber = new ArrayList<String>();

    public void printList(){
        System.out.println("You have " + contactName.size() + " contacts");
        for (int i = 0; i < contactName.size(); i++) {
            System.out.println((i+1)+ " Nmae: " + contactName.get(i) +
                                 " Number: " + contactNumber.get(i) );
        }
    }

    public void addContact(String name, String number){
         Contats contats = new Contats(name, number);
         if (!findContact(name)) {
            contactName.add(contats.getName());
            contactNumber.add(contats.getNumber());
            System.out.println("Contact added");
         } else {
             System.out.println(name + " is already in the system");
         }
    }

    public void modifyContact(String name, String newName, String number ){
        int position = contactName.indexOf(name);
        if (!findContact(newName)) {
            Contats contats = new Contats(newName, number);
            contactName.set(position, contats.getName());
            contactNumber.set(position, contats.getNumber());
            System.out.println("Contact modified");
        } else {
            System.out.println( newName + " is already in the system");
        }

    }

    public void removeContact(String name){
        if (findContact(name)) {
            System.out.println("Contact found \n Removing contact ........");
            int position = contactName.indexOf(name);
            contactName.remove(position);
            contactNumber.remove(position);
            System.out.println("Contact removed");
         } else {
            System.out.println(name + " is not in the system");
        }
    }


    public boolean findContact(String name){
        int position = contactName.indexOf(name);
        if (position >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public void searchContact(String name){
        if (findContact(name)) {
            int position = contactName.indexOf(name);
            System.out.println("Contact found \n" +
                                "Name : " + contactName.get(position) +
                                " Number : " + contactNumber.get(position) );
        } else {
            System.out.println(name + " is not in the system.");
        }
    }


}
