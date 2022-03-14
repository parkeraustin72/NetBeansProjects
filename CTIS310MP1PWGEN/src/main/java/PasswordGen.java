
import java.io.UnsupportedEncodingException;
import java.util.Random;
import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordGen {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String first, last, middle, city, favColor, fullName, finalFirst, finalLast, email, emailEnd, middleLower,
                password;

        String favNum, pwNum;
        String cityi, city1, cityii, city2, cityFinal, colori, color1, colorii, color2, colorFinal;

        int randNum, fLength, lLength;

        Scanner scanMe = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Please enter your first name: ");
        first = scanMe.nextLine();
        String fLower = first.toLowerCase();
        String firstLower = fLower.substring(0, 1);
        String firstLetter = firstLower.toUpperCase();
        fLength = first.length();
        finalFirst = firstLetter + first.substring(1, fLength) + " ";

        System.out.println("Please enter your middle Initial: ");
        middle = scanMe.nextLine();
        String finalMiddle = middle.toUpperCase();
        middleLower = middle.toLowerCase();

        System.out.println("Please enter your last name: ");
        last = scanMe.nextLine();
        String lLower = last.toLowerCase();
        String lastLower = lLower.substring(0, 1);
        String lastLetter = lastLower.toUpperCase();
        lLength = last.length();
        finalLast = lastLetter + last.substring(1, lLength);

        fullName = finalFirst + " " + finalMiddle + ". " + finalLast;

        System.out.println("Please enter your City of Birth: ");
        city = scanMe.nextLine();
        cityi = city.charAt(0) + "";
        city1 = cityi.toUpperCase();
        cityii = city.charAt(1) + "";
        city2 = cityii.toLowerCase();
        cityFinal = city1 + city2;

        System.out.println("Please enter your favorite color: ");
        favColor = scanMe.nextLine();
        colori = favColor.charAt(0) + "";
        color1 = colori.toUpperCase();
        colorii = favColor.charAt(1) + "";
        color2 = colorii.toLowerCase();
        colorFinal = color1 + color2;

        System.out.println("Please enter your 2-digits favorite number: ");
        favNum = "" + scanMe.nextInt();
        pwNum = favNum.charAt(0) + "^" + favNum.charAt(1);

        randNum = rand.nextInt(91) + 10;

        emailEnd = "@guilford.edu";
        email = last + first.charAt(0) + middleLower + emailEnd;

        password = firstLetter + first.substring(1, 1) + lastLetter + last.substring(1, 1)
                + pwNum + cityFinal + colorFinal + randNum;

        final String secretKey = "ThisIsSecretKey";
        String encryptedString = AES.encrypt(password, secretKey);
        String decryptedString = AES.decrypt(encryptedString, secretKey);

        MessageDigest sha = null;
        byte[] passHash = password.getBytes("UTF-8"); //password is the string of chars generated from the user input

        //UTF-8 is Unicode Transformation Format – 8-bit
        sha = MessageDigest.getInstance("SHA-1");
        passHash = sha.digest(passHash);

        System.out.println(" Your 2-digits random number: " + randNum);
        System.out.println("Your full name in the correct format is: " + fullName);
        System.out.println("Your email in the correct format is: " + email);
        System.out.println("Your final Password is : " + password);
        System.out.println("Your final Password Hash is : " + passHash);
        System.out.println("Your password encrypted using AES and secret key (ThisIsSecretKey) is: " + encryptedString);
        System.out.println("Your password decrypted using AES and secret key (ThisIsSecretKey) is: " + decryptedString);
        System.out.println("Here are some sayings about passwords: " + "\n"
                + "Choosing a hard-to-guess, but easy-to-remember password is important!" + "\n"
                + "Treat your password like your toothbrush." + "\n"
                + "Don't let anybody else use it, and get a new one every six months.");

    }

}
