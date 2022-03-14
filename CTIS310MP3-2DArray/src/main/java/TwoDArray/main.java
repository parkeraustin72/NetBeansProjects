package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int[][] twoDimHW = new int[x][y];
        

        System.out.println("Please fill out the (3x5) array: ");
        Scanner scan = new Scanner(System.in);

        for (int row = 0; row < x; row++) {
            for (int col = 0; col < y; col++) {

                System.out.println("Please enter an integer value for twoDimHW[" + row + "]" + "[" + col + "]: ");
                twoDimHW[row][col] = scan.nextInt();

            }
        }

        System.out.println("Printing the array: ");

        mainMethods.printArray(twoDimHW);

        System.out.println();
        System.out.println("Flipping the array Horizontally:" + "\n" + "Printing the array:");
        ReverseMethods.flipArrayHorizontally(twoDimHW);

        System.out.println();
        System.out.println("Flipping the array vertically:" + "\n" + "Printing the array:");
        ReverseMethods.flipArrayVertically(twoDimHW);

        System.out.println();
        System.out.println("Reversing the Array:" + "\n" + "Printing the array:");
        ReverseMethods.reverseArray(twoDimHW);

        System.out.println();
        System.out.println("Transposing the array:" + "\n" + "Printing the array:");
        int[][] transposeArray = new int[5][3];
        transposeArray = mainMethods.transposeArray(twoDimHW);
        mainMethods.printArray(transposeArray);

        System.out.println();
        System.out.println("Reversing and transposing the array:" + "\n" + "Printing the array:");
        int[][] reverseTranspArr = new int[5][3];
        reverseTranspArr = ReverseMethods.reverseTransposeArray(transposeArray);
        
        System.out.println();
        System.out.println("Printing the array:");
        mainMethods.printArray(twoDimHW);

        System.out.println();
        System.out.println();

        System.out.println("Total of twoDimHW: " + mainMethods.getTotal(twoDimHW));
        System.out.println("Average of twoDimHW: " + mainMethods.getAverage(twoDimHW));
        System.out.println("Total of row 0 of twoDimHW: " + mainMethods.getRowTotal(twoDimHW, 0));
        System.out.println("Total of row 1 of twoDimHW: " + mainMethods.getRowTotal(twoDimHW, 1));
        System.out.println("Total of col 0 of twoDimHW: " + mainMethods.getColumnTotal(twoDimHW, 0));
        System.out.println("Total of col 2 of twoDimHW: " + mainMethods.getColumnTotal(twoDimHW, 2));
        System.out.println("Highest in row 0 of twoDimHW: " + mainMethods.getHighestInRow(twoDimHW, 0));
        System.out.println("Highest in row 1 of twoDimHW: " + mainMethods.getHighestInRow(twoDimHW, 1));
        System.out.println("Lowest in row 0 of twoDimHW: " + mainMethods.getLowestInRow(twoDimHW, 0));
        System.out.println("Lowest in row 1 of twoDimHW: " + mainMethods.getLowestInRow(twoDimHW, 1));

    }

}
