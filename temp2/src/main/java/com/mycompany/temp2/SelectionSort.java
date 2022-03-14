/*
 * Selection Sort
 */
package com.mycompany.temp2;

/**
 *
 * @author bousabacw
 */
public class SelectionSort {
    public static String SelectionSrt (int [] arr)
    {
        String finalString = "";
        boolean is_sorted;
        for (int i = 0; i < arr.length-1; i++){
            is_sorted = true;
            int index = i; 
            
            for (int n:arr){
                
            }
            
            for (int j = i+1; j< arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
            
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            is_sorted = false;
            
            if (is_sorted) break;
            
            ArrayMethods.printArray(arr);
            String tempArray = ArrayMethods.arrayToString(arr);
            finalString = finalString + "Step " + (i+1) + ": " + tempArray + "\n\n";
        }
        
        
        return finalString;
    }
    
}
