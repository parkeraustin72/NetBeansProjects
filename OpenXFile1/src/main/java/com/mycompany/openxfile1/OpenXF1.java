
package com.mycompany.openxfile1;

import java.io.*;
public class OpenXF1 {

   
    public static void main(String[] args) {
       String fileName = "Test.txt";
       
       String line = null; // This will reference one line at a time
       
       try {
           //FileReader reads text files in the default encoding
           FileReader fileReader = new FileReader(fileName);
           
           //Always wrap fileReader in BufferedReader
           BufferedReader bufferedReader = new BufferedReader(fileReader);
           
           while((line = bufferedReader.readLine()) != null) {
               System.out.println(line);
           }
           
           // Close the opened files
           bufferedReader.close();
       }
        
        catch(FileNotFoundException ex){
            System.out.println("Unable to open file '" + fileName +
                    "'");
        }
        
        catch (IOException ex){
            System.out.println("Error Reading File '" + fileName + "'");
        }
        
    }
    
}
