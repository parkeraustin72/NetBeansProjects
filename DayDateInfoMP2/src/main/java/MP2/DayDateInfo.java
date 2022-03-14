package MP2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DayDateInfo {

    private static final DateFormat sdf1 = new SimpleDateFormat("HH:mm:ss a");

    public static int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        return d;

    }

    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        int year, month, day, printMonth;
        boolean leap = false;
        String dayofWeek;
        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Please enter the date to know the day and to print that month's calendar:");
        System.out.println("");

        System.out.println("Enter year: ");
        year = scan.nextInt();

        System.out.println("Enter month: ");
        month = scan.nextInt();
        printMonth = month;
        if (printMonth > 12) {
            System.out.println("The month you entered was invalid! " + "\n" + "The program will now close");

            System.exit(0);
        }
        System.out.println("Enter day: ");
        day = scan.nextInt();

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        dayofWeek = "" + month + "/" + day + "/" + year;
        Date dt1 = dateFormat.parse(dayofWeek);
        DateFormat format2 = new SimpleDateFormat("EEEE");
        String finalDay = format2.format(dt1);
        finalDay.toUpperCase();

        // Calculation for if it's a leap year
        if (year % 4 == 0) {
            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        System.out.println(dayofWeek + " was a " + finalDay);
        System.out.println("The month of " + Month.of(printMonth).name()
                + " has " + monthDays[printMonth] + " days.");
        System.out.println("the calendar for " + Month.of(printMonth).name() + " " + year);

        if (leap) {
            monthDays[2] = 29;
        } else {
            monthDays[2] = 28;
        }

        // Print out a calendar based off of entered integers 
        System.out.println("Su Mo Tu We Th Fr Sa");

        // starting day
        int d = day(month, 1, year);

        // print the calendar
        for (int i = 0; i < d; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= monthDays[month]; i++) {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == monthDays[month])) {
                System.out.println();
            }
        }
        // Formatting for the entered date
        LocalDate ED = LocalDate.of(year, month, day);
        System.out.println("The date entered is:            " + DateTimeFormatter.ofPattern("YYYY/MM/dd").format(ED));

        Calendar cal = Calendar.getInstance();
        LocalDate LD = LocalDate.now();
        System.out.println("Today's current date and time:  " + DateTimeFormatter.ofPattern("YYYY/MM/dd").format(LD) + " " + (sdf1.format(cal.getTime())));

        if (ED.isAfter(LD)) {
            System.out.println("The date entered is after the current date.");
        } else if (ED.isBefore(LD)) {
            System.out.println("The date entered is before the current date.");
        } else {
            System.out.println("The date entered is the same as today's date");
        }
        //Calculating the difference in dates comparing entered to current date
        long noOfDays = ChronoUnit.DAYS.between(ED, LD);
        System.out.println("The number of days between the entered date and the current date is: " + Math.abs(noOfDays)); // Math.abs is used to ensure the difference is positive.

    }

}
