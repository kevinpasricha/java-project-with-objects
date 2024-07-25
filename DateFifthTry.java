import java.util.Scanner;

public class DateFifthTry  {
    private String month;
    private int day;
    private int year;  // A four-digit number
    
    public void writeOutput()  {
        System.out.println(month + " " + day + ", " + year);
    }
    
    // readInput() - Read a date from the keyboard
    public void readInput() {
        boolean tryAgain = true;
        Scanner keyb = new Scanner(System.in);
        
        // Keep asking until the user enters a 
        // valid date
        while (tryAgain)  {
            System.out.println("Enter month, day and year");
            System.out.println("as three integers:");
            System.out.println("do not use commas "
                       + " or other punctuations.");

            int monthInput = keyb.nextInt();
            int dayInput = keyb.nextInt();
            int yearInput = keyb.nextInt();
            
            if (dateOK(monthInput, dayInput,  yearInput)) {
                setDate(monthInput, dayInput, yearInput);
                tryAgain = false;
            }
            else
                System.out.println("Illegal date.  Reenter input.");
        }
    }
    
    // setDate() - A mutator that expects the month
    //             in numeric format
    public void setDate(int month, int day, int year)  {
        if (dateOK(month, day, year)) {
            this.month = monthString(month);
            this.day = day;
            this.year = year;
        }
        else {
            System.out.println("Fatal error - invalid date");
            System.exit(0);
        }
    }
    
    // setMonth() - A mutator for month that checks
    //              whether it is a valid value for
    //              month
    public void setMonth(int monthNumber)  {
        if ((monthNumber <= 0)&&(monthNumber > 12))  {
            System.out.println("Fatal error - Invalid month");
            System.exit(0);
        }
        else
        month = monthString(monthNumber);
    }
    
    // setDay() - A mutator for month that checks
    //            whether it is a valid value for
    //            day
    public void setDay(int day)  {
        if ((day <= 0) && (day > 31))  {
            System.out.println("Fatal error - Invalid day");
            System.exit(0);
        }
        else
            this.day = day;
    }
    
    // setYear() - A mutator for month that checks
    //             whether it is a valid value for
    //             year
    public void setYear(int year)  {
        if ((year < 1000) && (year > 9999))  {
            System.out.println
            ("Fatal error - Invalid year");
            System.exit(0);
        }
        else
          this.year = year;
    }
    
    // precedes() - Returns true if the object is
    //              an earlier date than the
    //              parameter
    //              Returns false otherwise
    public boolean precedes(DateFifthTry otherDate)  {
        return( (year < otherDate.year) ||
                (year == otherDate.year 
               && getMonth() < otherDate.getMonth()) 
                  ||(year == otherDate.year 
               && month.equals(otherDate.month) 
               && day < otherDate.day));
    }
    // getMonth() - Returns the month as a number
    public int getMonth()  {
        if (month.equals("January"))
            return 1;
        if (month.equals("February"))
            return 2;
        if (month.equals("March"))
            return 3;
        if (month.equals("April"))
            return 4;
        if (month.equals("May"))
            return 5;
        if (month.equals("June"))
            return 6;
        if (month.equals("July"))
            return 7;    
        if (month.equals("August"))
            return 8;
        if (month.equals("September"))
            return 9;
        if (month.equals("October"))
            return 10;
        if (month.equals("November"))
            return 11;
        if (month.equals("December"))
            return 12;
        else {
            System.out.println("Fatal error – not a valid month");
            
            // Since it isn't valid, terminate the
            // program
            System.exit(0);
            // The compilers insists on this return
            return 0;
        }
    }
    // dateOK() - Returns true if the date is valid
    //            Returns false if the date is
    //            invalid
    //            Assumes that the month is in
    //            numeric format
    public boolean dateOK(int monthInt, int dayInt, int yearInt) {
        return( (monthInt >= 1) 
            && (monthInt <= 12) && (dayInt >= 1)
            && (dayInt <= 31) && (yearInt >= 1000)
            && (yearInt <= 9999) );
    }
    
    public String monthString(int monthNumber)  {
        switch(monthNumber)  {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: 
                System.out.println("Fatal error - not a valid month");
                System.exit(0);
                return "Error";
        }
    }
}