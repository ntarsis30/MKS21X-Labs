public class Triangle{
    private Point v1,v2,v3;
    public Triangle(Point V1, Point V2, Point V3){
        v1=V1;
        v2=V2;
        v3=V3;
    }
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
        v1=new Point(x1,y1);
        v2=new Point(x2,y2);
        v3=new Point(x3,y3);
    }

    public Point getVertex(int num){
        if(num==1){
            return v1;
        }
        else if(num == 2){
            return v2;
        }
        return v3;
    }
    public void setVertex(int num, Point V1){
        if(num==1){
            v1=V1;
        }
        else if(num == 2){
            v2=V1;
        }
        else{
            v3=V1;
        }
    }
    public String toString(){
        return "{" + v1.toString()+", "+v2.toString()+", "+v3.toString()+"}";

    }
    public double getPerimeter(){
        return Point.distance(v1,v2)+Point.distance(v2,v3)+Point.distance(v1,v3);
    }
    

}