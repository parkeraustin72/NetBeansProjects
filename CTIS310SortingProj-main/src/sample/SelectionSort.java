/*
 * Selection Sort
 */
package sample;

/**
 *
 * @author bousabacw
 */
public class SelectionSort {
    public static int [] SelectionSrt (int [] arr)
    {
        for (int i = 0; i < arr.length-1; i++){
            int index = i; 
            
            for (int n:arr){
                System.out.print(n);
                System.out.print(", ");
            }
            System.out.println(" ");
            for (int j = i+1; j< arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
            
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        
        return arr;
    }
    
}
