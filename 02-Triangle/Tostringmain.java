public class Tostringmain{
    public static void main(String[] args){
        Point P1 = new Point(0.0,1.0);
        Point check = new Point(0.0000000001,1.000000000001);
        Point a = new Point(4.0000000001,1.0000000001);
        Point P2 = new Point(4.0,1.0);
        Point P3 = new Point(1.0,3.0);
        System.out.println(P1.toString());


        Point n_P1 = new Point(5.48,9.877);
        Point n_P2 = new Point(5.0,3.0);
        Point n_P3 = new Point(-1.5,6.53);


        Triangle T1 = new Triangle(P1,P2,P3);
        System.out.println(T1.getVertex(2));
        T1.setVertex(2,n_P2);
        System.out.println(T1.getVertex(2));
        System.out.println(T1.toString());
        System.out.println(T1.getPerimeter());

        Triangle T2 = new Triangle(9,83,2,5,3,9);
        System.out.println(T2.getVertex(1));
        T2.setVertex(1,n_P1);
        System.out.println(T2.getVertex(1));
        System.out.println(T2.toString());
        System.out.println(T2.getPerimeter());

        Triangle T3 = new Triangle(7,8645.7,738,1938,2,3);
        System.out.println(T3.getVertex(3));
        T3.setVertex(3,n_P3);
        System.out.println(T3.getVertex(3));
        System.out.println(T3.toString());
        System.out.println(T3.getPerimeter());
        System.out.println(Point.closeEnough(100.0,99.0999));
        System.out.println(P2.equals(a));
        System.out.println(T2.equals(T3));
        
        Triangle T4 = new Triangle(1,1,1,2,2,1);
        System.out.println(T4.classify());
        Triangle T5 = new Triangle(2.0,1.0,4.0,1.0,3.0,2.73205080757);
        System.out.println(T5.classify());


        System.out.println(T2.area());



    









    }
}