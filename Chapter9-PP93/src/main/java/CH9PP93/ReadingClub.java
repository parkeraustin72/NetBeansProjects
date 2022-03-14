// Solution for PP 9.3 - pg 447
package CH9PP93;


public class ReadingClub {
// Create several objects from classes derived from the reading material class.
   
    public static void main(String[] args) {
        ReadingMaterial [] rm = new ReadingMaterial[5];
        
        rm[0] = new ReadingMaterial ("Mystery Lines", "0-7722-0824-7");
        rm[1] = new Book("Linux Essentials for CyberSecurity", 
                            "0-7897-5935-7", "Rothwell, William and Kinsey, Denise");
        rm[2] = new TextBook("A Practical Guide to Digital Forensics Investigations",
                                "0-7897-5991-8", "Hayes, Darren", true);
        String[] names = {"Hazel", "Fiver", "BigWig", "Blackberry", "Dandelion"};
        
        rm[3] = new Novel("Watership Down", "0-380-00293-0",
                          "Adams, Richard", names);
        rm[4] = new Magazine ("ACM Crossroads", "0-234-5678-0",
                              "Lincoln, Abe");
        
        for (int index =0; index< rm.length; index++){
            rm[index].content();
            System.out.println();
        }
    }
    
}
