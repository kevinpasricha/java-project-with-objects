mport java.util.Scanner;

public class Point {
    private double x;
    private double y;
    
    public Point() {  // Default constructor
        x = 0.0;
        y = 0.0;
    }
    
    public Point(double initX, double initY) {  //Conversion constructor
        x = initX;
        y = initY;
    }
    
    public Point(int initX, int initY) { // Another conversion constructor
        x = initX;
        y = initY;
    }
    
    public Point(Point otherPoint) { // Copy constructor
        x = otherPoint.x;
        y = otherPoint.y;
    }
    
    public double distance() {
        return Math.sqrt(x*x + y*y);
    }
    
    public double distance(Point other) {
        return Math.sqrt((x-other.x)*(x-other.x) + (y-other.y)*(y-other.y));
    }
    
    public boolean equals(Point other) {
        return (x == other.x) && (y == other.y);
    }
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    public void read() {
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("Enter x\t?");
        x = keyb.nextDouble();
        System.out.println("Enter y\t?");
        y = keyb.nextDouble();
    }
    
    public void write() {
        System.out.print("(" + x + ", " + y + ")");
    }
    
    public double getX() {  // Accessor
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public void setX(double newX) {  // Mutator
        if (newX < 0) {
            System.out.println("Illegal negative number.");
            System.exit(0);
        }
        x = newX;
    }
    
    public void setY(double newY) {
        y = newY;
    }
}