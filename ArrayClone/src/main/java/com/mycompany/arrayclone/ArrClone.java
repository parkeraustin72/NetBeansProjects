
package com.mycompany.arrayclone;


public class ArrClone {

    
    public static void main(String[] args) {
        int intArray[] = {1, 2, 3};
        
        int cloneArray[] = intArray.clone();
        
        System.out.println(intArray == cloneArray);
        // Will print false as deep copy is created for on dimentional Array
        
        for (int i = 0; i< cloneArray.length; i++)
            System.out.print(cloneArray[i] + "  ");
        
        int intArray1[][] = {{1, 2, 3} , { 4, 5}};
        
        int cloneArray1[][] = intArray1.clone();
        
        System.out.println(intArray1 == cloneArray1);
        // Will also print False
        
        System.out.println(intArray1[0] == cloneArray1[0]);
        System.out.println(intArray1[1] == cloneArray1[1]);
        System.out.println(intArray1[1][1] == cloneArray1[1][1]);
        // Will print true
        
        
    }
    
}
