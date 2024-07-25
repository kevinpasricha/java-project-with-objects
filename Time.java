//Kevin Pasricha
//July 17, 2024
//Time.java


//Our program is named Time
public final class Time {
    private final int hours;
    private final int minutes;
    private final int seconds;

    // Default constructor - This sets the time to midnight and sets variables
    public Time() {
        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor with hours - we set minutes and seconds to 0
    public Time(int newHours) {
        this.hours = newHours % 24;
        this.minutes = 0;
        this.seconds = 0;
    }

    // Constructor with hours and minutes - we set seconds to 0
    public Time(int newHours, int newMinutes) {
        this.hours = newHours % 24;
        this.minutes = newMinutes % 60;
        this.seconds = 0;
    }

    // Constructor with hours, minutes, and seconds - we set all 3 properties to values given
    public Time(int newHours, int newMinutes, int newSeconds) {
        this.hours = newHours % 24;
        this.minutes = newMinutes % 60;
        this.seconds = newSeconds % 60;
    }

    //We return a String with the time in 12 hour format
    public String toString() {
        int displayHours = (hours % 12 == 0) ? 12 : hours % 12;
        String period = (hours < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", displayHours, minutes, seconds, period);
    }

    //We write the time in 12 hour format
    public void write() {
        System.out.println(this.toString());
    }

    //We return a time with extraHours hours later
    public Time later(int extraHours) {
        int newHours = (hours + extraHours) % 24;
        return new Time(newHours, minutes, seconds);
    }

    //We return a Time object extraHours later and extraMinutes later
    public Time later(int extraHours, int extraMinutes) {
        int totalMinutes = minutes + extraMinutes;
        int newHours = (hours + extraHours + totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;
        return new Time(newHours, newMinutes, seconds);
    }

    //We return a new Time object extraHours, extraMinutes, and extraSeconds later
    public Time later(int extraHours, int extraMinutes, int extraSeconds) {
        int totalSeconds = seconds + extraSeconds;
        int totalMinutes = minutes + extraMinutes + totalSeconds / 60;
        int newHours = (hours + extraHours + totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;
        int newSeconds = totalSeconds % 60;
        return new Time(newHours, newMinutes, newSeconds);
    }

    //We need to see if the program functions correctly
    public static void main(String[] args) {
        // Create a Time object
        Time initialTime = new Time(10, 30, 45);
        System.out.print("Initial time: ");
        initialTime.write();

        // Calculate the time later, and print it to the screen
        Time laterTime = initialTime.later(4, 27, 15);
        System.out.print("Time 4 hours, 27 minutes, and 15 seconds later: ");
        laterTime.write();
    }
}
//End of program
