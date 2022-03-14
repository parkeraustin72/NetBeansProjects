
import java.util.Random;

public class PhoneNumbers {

    
    public static void main(String[] args) { // PP 3.3 -- Generate a random phone number with various constraints
        String phoneNumber = "";
        
        Random randNum = new Random();
        
        //The 1st three digits are 0-7
        phoneNumber += randNum.nextInt(8);
        phoneNumber += randNum.nextInt(8);
        phoneNumber += randNum.nextInt(8);
        
        phoneNumber += "-";
        // The next set of digits can not be greater than 655
        
        phoneNumber += randNum.nextInt(556)+100;
        phoneNumber += "-";
        
        //The last four digits are unrestricted
        phoneNumber += randNum.nextInt(10);
        phoneNumber += randNum.nextInt(10);
        phoneNumber += randNum.nextInt(10);
        phoneNumber += randNum.nextInt(10);
        
        System.out.println("A random phone number: " + phoneNumber);
        
    }
    
}
