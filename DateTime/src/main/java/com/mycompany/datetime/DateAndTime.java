package com.mycompany.datetime;

import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDate;
import java.time.*; // "*" means everything in that particular library
import java.time.format.*;

public class DateAndTime {
    
    private static final DateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss "); // Military 
    private static final DateTimeFormatter dtf
            = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss ");
    
    private static final DateFormat sdf1 = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss a");
    private static final DateTimeFormatter dtf1
            = DateTimeFormatter.ofPattern("MM/dd/YYYY HH:mm:ss a");
    
    public static void main(String[] args) {
        Date date = new Date();
        
        System.out.println(sdf.format(date));
        System.out.println(sdf1.format(date));
        
        Calendar cal = Calendar.getInstance();
        
        System.out.println(sdf.format(cal.getTime()));
        System.out.println(sdf1.format(cal.getTime()));
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.println(dtf1.format(now));
        
        LocalDate LD = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("YYYY/MM/dd").format(LD));
        
        LocalDateTime X = LocalDateTime.now();
        System.out.println(X.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        
        System.out.println(X.format(DateTimeFormatter.ofPattern("EE"))); // Short format
         System.out.println(X.format(DateTimeFormatter.ofPattern("EEEE"))); // Long format
         
         Calendar now1 = Calendar.getInstance();
         TimeZone tz1 = now1.getTimeZone();
         System.out.println("Time Zone: " + tz1.getDisplayName());
        
        
    }
    
}
