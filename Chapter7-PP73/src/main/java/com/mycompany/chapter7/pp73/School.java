
package com.mycompany.chapter7.pp73;
import java.text.DecimalFormat;

public class School {
    // Create and exercise a course object
    public static void main(String[] args) {
        Course CTIS310 = new Course ("Advanced Java Programming");
        Course CTIS370 = new Course ("Computer Forensics");
        
        Address school = new Address("5800 W. Friendly Ave.", "Greensboro", "NC", 27410);
        
        Address home = new Address ("7027 W. Friendly Ave., Unit F" , "Greensboro", "NC", 27410);
        
        Student Matt = new Student ("Matt" , "Damon", home, school, 99, 88, 91);
        Student Robert = new Student ("Robert" , "DeNirro", home, school, 91, 81, 83);
        Student Pamela = new Student ("Pamela" , "Anderson", home, school, 77, 81, 79);
        Student Joe = new Student ("Joseph" , "Montana", home, school, 71, 80, 84);
        Student Bill = new Student ("Bill" , "Jackson", home, school, 97, 98, 99);
        Student John = new Student ("John" , "Smith", home, school, 87, 81, 77);
        
        CTIS310.addStudent(Robert);
        CTIS310.addStudent(Matt);
        CTIS310.addStudent(Pamela);
        CTIS310.addStudent(Joe);
        CTIS310.addStudent(Bill);
        CTIS310.addStudent(John);
        
        CTIS310.roll();
        
        DecimalFormat formatter = new DecimalFormat("0.0#");
        System.out.println("Average test Score for all tests: " +
                formatter.format(CTIS310.average()));
        
        
        
    }
    
}
