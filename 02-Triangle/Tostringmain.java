public class Tostringmain{
    public static void main(String[] args){
        Point P1 = new Point(0.0,0.0);
        Point P2 = new Point(4.0,0.0);
        Point P3 = new Point(0.0,3.0);
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

        

    }
}