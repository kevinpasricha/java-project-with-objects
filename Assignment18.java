//Kevin Pasricha
//July 16, 2024
//Assignment18.java



import java.util.Scanner;

public class Assignment18 {
    private String first;
    private char initial;
    private String last;

    //This is the default constructor, reading in 2 parameters
    public Assignment18() {
        this.first = "";
        this.initial = ' ';
        this.last = "";
    }

    //This is the conversion constructor with two parameters
    public Assignment18(String first, String last) {
        this.first = first;
        this.initial = ' ';
        this.last = last;
    }

    //This is the conversion constructor with three parameters
    public Assignment18(String first, char initial, String last) {
        this.first = first;
        this.initial = initial;
        this.last = last;
    }

    //Copy the constructor
    public Assignment18(Assignment18 other) {
        this.first = other.first;
        this.initial = other.initial;
        this.last = other.last;
    }

    //Reading name from the user input
    public void readName() {
        Scanner keyb = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.first = keyb.nextLine();
        System.out.print("Enter middle initial: ");
        this.initial = keyb.nextLine().charAt(0);
        System.out.print("Enter last name: ");
        this.last = keyb.nextLine();
    }

    //Writing the names to the output
    public void writeName() {
        System.out.print(this.first + " " + this.initial + " " + this.last);
    }

    //Checking if both names are equal
    public boolean equals(Assignment18 other) {
        return this.first.equals(other.first) &&
               this.initial == other.initial &&
               this.last.equals(other.last);
    }

    //Return the name as a string using a new method
    public String toString() {
        return this.first + " " + this.initial + " " + this.last;
    }

    //Checking to see if one name precedes another name
    public boolean precedes(Assignment18 other) {
        if (this.last.compareTo(other.last) < 0) {
            return true;
        } else if (this.last.compareTo(other.last) == 0) {
            if (this.first.compareTo(other.first) < 0) {
                return true;
            } else if (this.first.compareTo(other.first) == 0) {
                return this.initial < other.initial;
            }
        }
        return false;
    }

    //Seeing if the code functions well
    public static void main(String[] args) {
        // Create three Assignment18 objects and read names from user
        Assignment18 name1 = new Assignment18();
        Assignment18 name2 = new Assignment18();
        Assignment18 name3 = new Assignment18();

        System.out.println("Enter details for name1:");
        name1.readName();
        System.out.println("Enter details for name2:");
        name2.readName();
        System.out.println("Enter details for name3:");
        name3.readName();

        //Determining the name that comes in first order alphabetically
        Assignment18 first = findFirst(name1, name2, name3);
        System.out.println("The name that comes first in alphabetical order is: " + first.toString());

        //Extra credit: Printing in alphabetical order
        Assignment18[] sortedNames = sortNames(name1, name2, name3);
        System.out.println("The names in alphabetical order are:");
        for (Assignment18 name : sortedNames) {
            System.out.println(name.toString());
        }
    }

    //Finding first name in order
    public static Assignment18 findFirst(Assignment18 name1, Assignment18 name2, Assignment18 name3) {
        Assignment18 first = name1;
        if (name2.precedes(first)) {
            first = name2;
        }
        if (name3.precedes(first)) {
            first = name3;
        }
        return first;
    }

    //Extra credit: Sorting
    public static Assignment18[] sortNames(Assignment18 name1, Assignment18 name2, Assignment18 name3) {
        Assignment18[] names = {name1, name2, name3};
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].precedes(names[i])) {
                    Assignment18 temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        return names;
    }
}
//End of program
