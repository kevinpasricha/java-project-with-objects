public class TestPoint  {
    public static void main(String[] args) {
        Point thisPoint = new Point();
        Point thatPoint = new Point(3.0, 4.0);
        Point anotherPoint = new Point(thisPoint);
        
        System.out.println(thatPoint.distance());
       /* thisPoint.write();
        System.out.println();
        thatPoint.write();
        System.out.println();
        anotherPoint.write();
        System.out.println();
         
        thisPoint.read();
        thatPoint.read();
        
        System.out.println("X is " + thisPoint.getX());
        System.out.println("Y is " + thisPoint.getY());
        thisPoint.write();
        System.out.println();
        
        thatPoint.write();
        System.out.println();
        
        thisPoint.setX(13); // mutator
        thisPoint.write();
        System.out.println();
        anotherPoint.write();
        System.out.println();
        */
    }
}
