package com.mycompany.chapter7.pp73;

import java.util.ArrayList;


public class Course {
    
    
    private String courseName;
    private ArrayList <Student> studentList;
    
    
    // Constructor to set up the course object with the specified name
    public Course (String courseNameInit){
        courseName = courseNameInit;
        
        studentList = new ArrayList<Student>();
    }
    
    public void addStudent (Student newStudent){
        studentList.add(newStudent); // Adds a student to the course
    }
    
    public double average(){
        double averageSum = 0.0, average = 0.0;
        
        for (Student student: studentList)
            averageSum += student.average();
        if (studentList.size() > 0)
            average = averageSum / studentList.size();
        
        return average;
    } // end of method average
    
    public void roll(){ // Prints out all the students in the course
        System.out.println(courseName + "Class Roll\n");
        for (Student student: studentList)
            System.out.println(student);
    }
}
