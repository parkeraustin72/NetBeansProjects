package com.mycompany.temp;



/**
 *
 * @author Austin
 */
public class InsertionSort {

    public static String InsertionSrt(int[] input) {
        String finalString = "";
        int temp;

        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
            ArrayMethods.printArray(input);
            String tempArray = ArrayMethods.arrayToString(input);
            finalString = finalString + "Step " + (i+1) + ": " + tempArray + "\n\n";
        }

        return finalString;
    }

}

