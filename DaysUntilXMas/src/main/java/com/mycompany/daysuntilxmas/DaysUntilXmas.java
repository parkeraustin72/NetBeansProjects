package com.mycompany.daysuntilxmas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.*;

public class DaysUntilXmas {

    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, 2021);
        c.set(Calendar.MONTH, 11); // 11=December
        c.set(Calendar.DAY_OF_MONTH, 25);

        Date xmas = c.getTime();
        Date today = new Date();
        long diff = xmas.getTime() - today.getTime();
        diff = diff / (1000L * 60L * 60 * 24L); // L = Long
        System.out.println("Days Until XMAS: " + diff);

    }

}

    

