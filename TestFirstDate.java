public class TestFirstDate  {
  public static void main(String[] args) {
    DateFirstTry  date1, date2;
    
    // Call the constructors - Now we can use
    // them
    date1 = new DateFirstTry();
    date2 = new DateFirstTry();
    
    //Initialize date1
    date1.month = "December";
    date1.day = 31;
    date1.year = 2006;
    System.out.println("date1:");
    date1.writeOutput();
    //Initialize date2
    date2.month = "July";
    date2.day = 4;
    date2.year = 1776;
    System.out.println("date2:");
    date2.writeOutput();
   }
}
