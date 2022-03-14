
package OpenXFile2;

import java.io.*;
public class OpenXF2 {

    
    public static void main(String[] args) {
       String fileName = "TestDemo.txt";
       
       try{
           // Use buffer for reading the data
           byte [] buffer = new byte [20];
           
           FileInputStream inputStream = new FileInputStream(fileName);
           
           // read fills butter with data and returns the number of bytes read
           // which of course, maybe less than the buffer size but it will
           // never be more;
           
           int total = 0;
           int nRead = 0;
           while ((nRead = inputStream.read(buffer)) != -1){
               // Convert to string so we can display it.
               // You wouldn't want to do this with a real binary file
               
               System.out.println(new String(buffer));
               total += nRead;
           }
           // Close file
           inputStream.close();
           
           System.out.println("Read " + total + " bytes.");
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
