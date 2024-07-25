//Kevin Pasricha
//July 16, 2024
//Name.java


import java.util.Scanner; //Import Scanner to allow for user inputs

public class Name {
    private String first;
    private char initial;
    private String last;

    //Default constructor, which calls for first and last name constructors
    public Name() {
        this.first = "";
        this.initial = ' ';
        this.last = "";
    }

    //Conversion constructor with two parameters and calls for first and last name
    public Name(String first, String last) {
        this.first = first;
        this.initial = ' ';
        this.last = last;
    }

    //Conversion constructor with three parameters and calls for all three names
    public Name(String first, char initial, String last) {
        this.first = first;
        this.initial = initial;
        this.last = last;
    }

    //Reading name from user input methods
    public void readName() {
        Scanner keyb = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.first = keyb.nextLine();
        System.out.print("Enter middle initial: ");
        this.initial = keyb.nextLine().charAt(0);
        System.out.print("Enter last name: ");
        this.last = keyb.nextLine();
    }

    
    public void writeName() {
        System.out.print(this.first + " " + this.initial + " " + this.last);
    }

    // Checking if the two names are equal
    public boolean equals(Name other) {
        return this.first.equals(other.first) &&
               this.initial == other.initial &&
               this.last.equals(other.last);
    }

    // Checking if the methods are functionable
    public static void main(String[] args) {
        //Testing default constructor
        Name name1 = new Name();
        System.out.print("Default constructor: ");
        name1.writeName();
        System.out.println();

        //Testing two-parameter constructor
        Name name2 = new Name("John", "Doe");
        System.out.print("Two-parameter constructor: ");
        name2.writeName();
        System.out.println();

        //Testing three-parameter constructor
        Name name3 = new Name("Jane", 'M', "Smith");
        System.out.print("Three-parameter constructor: ");
        name3.writeName();
        System.out.println();

        //Testing readName method
        Name name4 = new Name();
        System.out.println("Enter details for name4:");
        name4.readName();
        System.out.print("You entered: ");
        name4.writeName();
        System.out.println();

        //Testing the equals method
        Name name5 = new Name("Jane", 'M', "Smith");
        System.out.println("Comparing name3 and name5:");
        if (name3.equals(name5)) {
            System.out.println("name3 and name5 are equal.");
        } else {
            System.out.println("name3 and name5 are not equal.");
        }
    }
}
//End of program
