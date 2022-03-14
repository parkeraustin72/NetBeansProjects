package sample;


public class BubbleSort {
    
    public static int [] bubble_srt (int array[])
    {
        int inputLength = array.length;
        int temp;
        boolean is_sorted;
        
        for (int i = 0; i < inputLength; i++){
            is_sorted = true;
            for (int j = 1; j < (inputLength-i); j++){
                if (array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    is_sorted = false;
                }
            }
            //is sorted? then break it, aavoid useless loop
            if (is_sorted) break;
            ArrayMethods.printArray(array);
        }
        return array;
    }
    
}