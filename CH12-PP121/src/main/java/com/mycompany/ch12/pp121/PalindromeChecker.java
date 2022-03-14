package com.mycompany.ch12.pp121;



public class PalindromeChecker {
    private String testString;
    
    public PalindromeChecker (String testMe){
        testString = convertString(testMe);
    }
    
    private String convertString (String str){
        String str2 = "";
        str = str.toLowerCase();
        
        for (int i =0; i< str.length(); i++){
            if (Character.isLetterOrDigit(str.charAt(i)))
                str2 += str.charAt(i);
        }
        return str2;
    }
    
    public boolean isPalindrome(){// Determine if the string is a palindrome
        
    return testPalindrome(0, testString.length()-1);
}

private boolean testPalindrome(int startIndex, int endIndex){
    boolean result;
    if (endIndex == startIndex || endIndex < startIndex) // Our base case
        result =true;
    else
        if (testString.charAt(startIndex) == testString.charAt(endIndex))
            result = testPalindrome(startIndex+1, endIndex-1);
        // continue testing
    else
            result = false; // stop testing
    return result;
}


    
}

