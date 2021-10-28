import java.lang.*;

public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public static double distance(Point p1,Point p2){
      return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));

  }
  public double distanceTo(Point p2){
      return Math.sqrt(Math.pow(x-p2.x,2)+Math.pow(y-p2.y,2));

  }
  public String toString(){
      return "(" + x + ", " + y + ")";
  }
  public static boolean closeEnough(double a, double b){
    if (a == 0.0){
      return b==0.0;
    }
    else if (b==0.0){
      return false;
    }
    return Math.abs(100.0*(a-b)/(b)) <= 0.001;
  }
  public boolean equals(Point other){
    if (other==null){
      return false;
    }
    return closeEnough(other.x, x) && closeEnough(other.y, y);
  }
}