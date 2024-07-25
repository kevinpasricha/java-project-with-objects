public class TestSecondDate  {
  public static void main(String[] args) {
    DateSecondTry  date = new DateSecondTry();
    //Initialize date1
    date.readInput();
    int dayNumber = date.getDay();
    System.out.println("That is the " + dayNumber
                        + "th day of the month.");
  }
}
