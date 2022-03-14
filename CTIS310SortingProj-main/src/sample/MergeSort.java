package sample;

public class MergeSort {
    private int [] array;
    private int [] tempMergArr;
    private int length;
    
    public  void merge_srt(int inputArr[]){
        this.array = inputArr;
        int j = 1;
        for (int i : inputArr){
            System.out.print(i);
            if (j < inputArr.length)
                System.out.print(", ");
            else 
                System.out.println();
            j++;
        }
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length-1);
    }
    
    private void doMergeSort (int lowerIndex, int higherIndex){
        if (lowerIndex < higherIndex){
            int middle = lowerIndex + (higherIndex-lowerIndex)/2;
            //the step below sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            //the step below sorts the right side of the array
            doMergeSort(middle+1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }//end of doMergeSort
    
    private void mergeParts(int lowerIndex, int middle, int higherIndex){
        System.out.print("lowerIndex = " + lowerIndex +
                         " middle = " + middle +
                         " higherIndex = " + higherIndex);
        
        for (int i = lowerIndex; i <= higherIndex; i++){
            tempMergArr[i] = array[i];
        }
        
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        
        while (i <= middle && j <= higherIndex){
            if (tempMergArr[i] <= tempMergArr[j]){
                array[k] = tempMergArr[i];
                i++;
            }
            else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        
        while (i <= middle){
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
        
        int len = 1;
        for (int x:tempMergArr){
            System.out.print(x);
            if (len < tempMergArr.length)
                System.out.print(", ");
            else
                System.out.println();
            len++;
        }
    }

   
   
    
}
