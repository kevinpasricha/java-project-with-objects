import java.util.Scanner;

public class DateSecondTry  {
  private String month;
  private int day;
  private int year;  // A four-digit number
  
  // writeOutput() - Write the date in a proper
  //                 format
  public void writeOutput()  {
    System.out.println(month + " " + day + ", "
                       + year);
  }

  // readInput() - Read a date from the keyboard
  public void readInput()  {
    Scanner keyb = new Scanner(System.in);
    // Prompt the user for the month, 
    // day and year and read them
    System.out.println("Month?");
    month = keyb.next();
    System.out.println("Day?");
    day = keyb.nextInt();
    System.out.println("Year?");
    year = keyb.nextInt();    
  }
  // getDay() - Allows you to get the data
  //            property
  public int getDay()  {
    return day;
  }
  
  // getYear() - Allows you to get the data
  //             property
  public int getYear()  {
    return year;
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
      System.out.println("Fatal error – "
                   + "not a valid month");
      // Since it isn't valid, terminate the
      // program
      System.exit(0);
      // The compilers insists on this return
      return 0;
    }
  }
}

