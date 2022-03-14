/*
* Input file generator for the PP 8.3 Solution
*/
package Chapter8;

import java.io.*;
import java.util.*;

public class MakeHistogramInputFile {
    
    //Make data file with random data for histogram program
    // Check chapter 11 for details about creating output files.
    
    public static void main (String [] args) throws IOException{
        
        int [] ranges = new int [10]; // each entry represents a range of values
        // 1-10, 11-20, 20-30...
        
        int box;
        
        Scanner scan = new Scanner(new File("histogram.txt"));
        
        int entered;
        
        while (scan.hasNextInt()){
            entered = scan.nextInt();
            box = (entered-1) / 10;
            ranges[box]++;
        }
        
        // print the histogram
        for (box=0; box<10; box++){
            System.out.print((10*box+1) + "-");
            System.out.print((10*box+10) + "\t|");
            for (int count =0; count <ranges[box]; count++)
                System.out.print("*");
                System.out.println();
            
    }
        
        
        
    }
    
    
    
    
}
