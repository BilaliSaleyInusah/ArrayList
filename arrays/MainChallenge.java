import java.util.Scanner;

public class MainChallenge {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        sortIntegers();
        
    }

    public static int[] getIntegers(int number){
        System.out.println("************************************************");
        System.out.println("      Enter " + number + " number of integers.");
        System.out.println("************************************************");
        int[] values = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter #" + i + " : ");
            values[i] = scanner.nextInt(); 
        }
        return values;
    }

    public static int[] sortIntegers(){
        int[] myArray = getIntegers(5);
        int[] sortedArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            sortedArray[i] = myArray[i];
        }

        boolean flag = true;
        int tem;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i+1]) {
                    tem = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = tem;
                    flag = true;
                }
            }
        }

        System.out.println("***************************");
        System.out.println("      Sorted Numbers       ");
        System.out.println("***************************");

        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println("sorted " + i + ": " + sortedArray[i]);
        }
        return sortedArray;


        // for (int i : myArray) {
        //     int num = 0;
        //     System.out.println(i);
        //     if (i > myArray[num]) {
        //         sortedArrays[num] = i;
        //         num +=1;
        //     } else {
        //         sortedArray[num] = myArray[num];
        //         num +=1;
        //     }
        // }
        
        
        // return myArray;
    }

}
