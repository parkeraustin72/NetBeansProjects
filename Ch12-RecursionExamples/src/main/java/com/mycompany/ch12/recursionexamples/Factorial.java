package com.mycompany.ch12.recursionexamples;

public class Factorial {
    
    public static long factorial(int n){
        if (n<0)
            System.out.println("Factorial of negative numbers is undefined!");
        n = Math.abs(n);
        System.out.println("Calculating the factorial of " +n);
        if (n==1) return 1;
        return n * factorial(n-1);
    }
    
    

}
