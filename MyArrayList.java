import java.util.ArrayList;

public class MyArrayList {
    private ArrayList<String> myList = new ArrayList<String>();

    public void addList (String item){
        myList.add(item);
    }

    public void printList(){
        System.out.println("You have " + myList.size() + " items in your list.");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println((i+1) + ". " + myList.get(i));
        }
    }

    public void modifyList(String item, String replacement){
        int position = myList.indexOf(item);
        if (position >= 0) {
            modifyList(position, replacement);
        } else {
            System.out.println(item + " is not in the list");
        }
       
    }

    private void modifyList(int position , String item){
        String thisItem = myList.get(position);
        myList.set(position, item);
        System.out.println(thisItem + " item at number " + (position + 1) + 
                            " has been change to " + item);
    }

    public void removeItem(String item){
        int position = myList.indexOf(item);
        if (position >= 0) {
            removeItem(position);
        } else {
            System.out.println(item + " is not in the list");
        }
    }

    private void removeItem(int position){
        String thisItem = myList.get(position);
        myList.remove(position);
        System.out.println(thisItem + " item at number " + (position + 1) + 
                            " has been removed ");
    }

    public String findItem(String item){
        int position = myList.indexOf(item);
        if (position >= 0) {
            return myList.get(position);
        } else {
            return null;
        }
    }
}
