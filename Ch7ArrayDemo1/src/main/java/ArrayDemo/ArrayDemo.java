package ArrayDemo;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        int intArray[];
        int intArray1[];

        int[] intArray2 = new int[10];
        int intArray3[] = new int[10];

        int[] intArray4 = {0, 10, 20, 30, 40, 50, 60, 70, 80, 90};
        int[] intArray5 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scan = new Scanner(System.in);

        System.out.println("The size of the array: " + intArray1.length);

        for (int index = 0; index < intArray1.length; index++) {
            System.out.print("Please enter number " + (index + 1) + ": ");
            intArray1[index] = scan.nextInt();

        }

        System.out.println("The numbers in reverse order: ");
        for (int index = intArray1.length - 1; index >= 0; index--) {
            System.out.print(intArray1[index] + "  ");
        }

        System.out.println("\nPrinting inArray2: ");
        for (int temp : intArray2) {
            System.out.print(temp + "  ");
        }

        for (int index2 = intArray2.length - 1; index2 >= 0; index2--) {
            intArray2[index2] = intArray[intArray1.length - index2 - 1];
        }

        System.out.println("\n");
        for (int iAmLost : intArray1) 
            System.out.print(iAmLost + "  ");
        

        System.out.println("\n");
        for (int rULost : intArray2) 
            System.out.print(rULost + "  ");
        
        // find the min of Array 1
        
        int min = intArray1[0]; // Assign the min to the first element of Array 1
        System.out.println("Finding the min of Array1: ");
        for (int i = 0; i < intArray1.length; i++)
        {
            if (min > intArray1[i])
                min = intArray1[i];
            }
        
        
        
    }

}
