
package com.mycompany.appendingtextfilesdemo;

import java.io.*;
public class AppendTXTFile {

    
    public static void main(String[] args) {
        String fileName = "TempFileAppend.txt";
        
        try{
            FileWriter fileWriter = new FileWriter(fileName, true);
            
            BufferedWriter bufferedWriter = new BufferedWriter (fileWriter);
            
            // Always wrap FileWriter in BufferedWriter
            bufferedWriter.newLine();
            bufferedWriter.write("Just Some Text");
            bufferedWriter.write(". More TEXT!!!");
            
            bufferedWriter.newLine();
            bufferedWriter.write("New Text Line");
            bufferedWriter.write("OMG !!!");
            
            // Always Close Files
            bufferedWriter.close();
        }
        catch (IOException ex){
            System.out.println("Error Writing to file '" + fileName +
                    "'");
        }
        
        
        
        
        
        
    }
    
}
