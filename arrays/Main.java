import java.util.Scanner;

public class Main{

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // int [] arrays = new int[10];
        // arrays [1] = 50;
        // System.out.println(arrays[1]);
        // arrays [2] = 30;
        // arrays [1] = 10;
        // arrays [4] = 80;
        // System.out.println(arrays[1]);

        // int [] arrays = {1,3,2,4,5,3,6,7,0};
        // System.out.println(arrays[5]);
        // System.out.println(arrays[6]);
        // arrays[5] = 10;
        // System.out.println(arrays[5]);
        // arrays[9] = 11;
        // System.out.println(9);

        // String[] stringArrays = {"bilal" , "saley" , " saley" , "girl"};
        // System.out.println(stringArrays[3]);
        int [] myArray = getNumbers(5);
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " is " + myArray[i]);
            sum += myArray[i];
        }

        System.out.println("The average is " + (double) sum / (double) myArray.length);
        
        
    }

    public static int [] getNumbers (int number ) {
        System.out.println("Enter " + number + " integers");
        int[] value = new int[number];
        for (int i = 0; i < number; i++) {
            value[i] = scanner.nextInt();
        }
        return value;
    }

}