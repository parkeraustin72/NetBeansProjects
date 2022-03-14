package com.mycompany.ctis310hw4;

/*
QuickSort is a Divide and Conquer algorithm. 
It picks an element as pivot and partitions the given array 
around the picked pivot. There are many different versions of quickSort 
that pick pivot in different ways. 
1.	Always pick first element as pivot.
2.	Always pick last element as pivot (implemented below)
3.	Pick a random element as pivot.
4.	Pick median as pivot.

 */

/**
 *
 * @author bousabacw
 */

public class QuickSort {
     
    private int array[];
    private int length;
 
    public void sort(int[] inputArr) {
    	
    	for(int i:inputArr){
            System.out.print(i);
            System.out.print(", ");
        }
    	System.out.println();
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
        
    	for(int i:inputArr){
            System.out.print(i);
            System.out.print(", ");
        }
    	System.out.println();
    }
 
    private void quickSort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        
        System.out.println("\nPivot = " + pivot);
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
        	System.out.println("Comparing array[i] = " + array[i] + " versus array[j] = " + array[j] );
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
            for(int l:array){
                System.out.print(l);
                System.out.print(", ");
            }
            System.out.println();          
            
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
        

    }
 
    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
