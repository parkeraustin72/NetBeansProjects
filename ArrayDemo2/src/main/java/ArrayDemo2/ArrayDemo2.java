package ArrayDemo2;

public class ArrayDemo2 {

    public static void main(String[] args) {

        int[] A = {1, 2, 3, 4, 5};
        int[] B = {11, 12, 13, 14, 15};

        int[] C = new int[A.length];

        C = addArrays(A, B);

        for (int temp : C) 
            System.out.print(temp + "  ");
        

    }

    public static int [] addArrays (int [] Arr1, int [] Arr2)
    {
     int [] Sum = new int [Arr1.length];
     
     for (int i = 0; i < Arr1.length; i++)
         Sum[i] = Arr1[i] + Arr2[i];
     
     return Sum;
    }
    
}
