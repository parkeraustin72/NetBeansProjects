
package WritingBinaryXFiles;
import java.io.*;

public class WritingBinFiles {

    
    public static void main(String[] args) {
        
        String fileName = "temp.txt"; // The name of the file to create
        
        try {
            // put some bytes in a buffer so that we can write them.
            // Usually this would be an image date or something
            // or it might be unicode text.
            
            String bytes = "Hello CTIS 310";
            
            byte [] buffer = bytes.getBytes();
            
            FileOutputStream outputStream = new FileOutputStream(fileName);
            outputStream.write(buffer);
            
            //write () (method) which writes as many bytes from the buffer as the length of the buffer
            // You could also use write (buffer, offset, length)
            // If you want to write a specific number of bytes, or only a part of the buffer
            
            outputStream.close(); // Always close files
            
            System.out.println("Wrote " + buffer.length + "bytes.");
        }
        catch(IOException ex){
            System.out.println("Error writing file '" + fileName +
                    "'");
        }
        
        
    }
    
}
