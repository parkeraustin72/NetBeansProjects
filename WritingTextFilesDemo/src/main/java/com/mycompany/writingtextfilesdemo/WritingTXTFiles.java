
package com.mycompany.writingtextfilesdemo;
import java.io.*;

public class WritingTXTFiles {

    
    public static void main(String[] args) {
        String fileName = "Temp1.txt";
        
        try{
            FileWriter fileWriter = new FileWriter(fileName);
            
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            // Always wrap fileWriter in a BufferedWriter
            
            bufferedWriter.write("Hello There,");
            bufferedWriter.write(" I just enjoy writing.");
            
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing to a text file.");
            bufferedWriter.write("This is just a simple example.");
            
            // Always close files
            bufferedWriter.close();
        }
        catch(IOException ex){
            System.out.println("Error WRiting to File '" + fileName +
                    "'");
            // or you could just do: ex.printStackTrace
        }
        
        
        
        
        
        
    }
    
}
