package com.mycompany.ch12.recursionexamples;

/* 
To convert a decimal number to binary is to divid the value by 2,
record the remainder and continue to divide the quotiont by 2

we keep dividing until we get a quotient of 0
Then, by writing out all the remainders in reverse order,
we obtain the binary string;

Hence, our problem is to write a method that returns these remainders in reverse order
 */
public class Binary {

    public static String toBinary(int n) {
        //recuirsive binary method
        if (n <= 1) {
            return String.valueOf(n);
        }
        return toBinary(n / 2) + String.valueOf(n % 2);

    }

}
