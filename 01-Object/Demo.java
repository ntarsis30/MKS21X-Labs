public class Demo{
  public static double distance(Point p1, Point p2){
      return Math.sqrt(Math.pow(p1.getX()-p2.getX(),2)+Math.pow(p1.getY()-p2.getY(),2));
  }

  public static void main(String[]args){
    /*
    returns 1.4142135623730951
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);

    returns 0.0
    Point P1 = new Point(0,0);
    Point P2 = new Point(0,0);

    returns 805762.291231105
    */
    Point P1 = new Point(7287,9681);
    Point P2 = new Point(812996,414);





    System.out.println(  distance(P1,P2)); //call1
    System.out.println(  Point.distance(P1,P2)); //call 2
    System.out.println(  P1.distanceTo(P2)); //call 3
  }
 }
