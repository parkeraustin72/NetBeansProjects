
import java.util.Random;
import java.util.Scanner;

public class UsrNameGen {

   
   public static void main(String[] args) { // Solution to PP 3.1
       // produce a username based on the user's input: 1st and last names
       // Assume the last name is at least 5 characters long.
       
       String first, last, username;
       Scanner scanMe = new Scanner(System.in);
       Random rand = new Random();
       
       System.out.println("Please enter your first name: ");
       first = scanMe.nextLine();
       
       System.out.println("Please enter your last name: ");
       last = scanMe.nextLine();
       
       username = first.charAt(0) + last.substring(0, 5) + (rand.nextInt(90) + 10);
       
       System.out.println("Your username is: " + username);
       
       
    }
    
}
