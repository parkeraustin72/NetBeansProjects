
import java.util.Random;


public class Trig {

   
    public static void main(String[] args) { // Chapter 3 - PP 3.8 Solution trig
        // Generate a random int in the range of 20-40 and displays sin/cos/tan of said number
        
        Random randnum = new Random();
        
        int num = randnum.nextInt(21) + 20; // To generate a random number
        // between 20 and 40 inclusive
        System.out.println("The random number generated is: " + num);
        
        System.out.println("Sine = " + Math.sin(num));
        System.out.println("Cosine = " + Math.cos(num));
        System.out.println("Tangent = " + Math.tan(num));
        
        
        
    }
    
}
