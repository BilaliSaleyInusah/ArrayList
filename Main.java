import java.util.Scanner;

public class Main{
    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseArray = new int[10];
    public static void main(String[] args) {
        getInteger();
        printArray();
        resize();
        printArray();        
    }

    public static void getInteger(){
        System.out.println("Enter " + baseArray.length + " integer number");
        for (int i = 0; i < baseArray.length; i++) {
            baseArray[i] = scanner.nextInt();           
        }
    }

    public static void printArray(){
        for (int i = 0; i < baseArray.length; i++) {
            System.out.print(baseArray[i] + " ");
        }
        System.out.println();
    }

    public static void resize(){
        int[] original = baseArray;
        baseArray = new int[12];
        for (int i = 0; i < original.length; i++) {
            baseArray[i] = original[i];
        }
    }

}