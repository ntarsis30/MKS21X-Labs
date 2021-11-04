public class Testing{
    public static void main(String[] args){
        RealNumber re_1 = new RealNumber(7.7);
        RealNumber re_2 = new RealNumber(3.2);
        RealNumber re_3 = new RealNumber(1.1);
        System.out.println(re_1.multiply(re_2));
        System.out.println(re_1.multiply(re_3));
        System.out.println(re_2.add(re_3));
        System.out.println(re_1.add(re_2));
        System.out.println(re_1.divide(re_2));
        System.out.println(re_1.divide(re_3));
        System.out.println(re_2.subtract(re_3));
        System.out.println(re_1.subtract(re_2));
        RationalNumber ra_1 = new RationalNumber(7,3);
        RationalNumber ra_2 = new RationalNumber(3,2);
        RationalNumber ra_3 = new RationalNumber(2,1);
        RationalNumber ra_4 = new RationalNumber(14,6);
        System.out.println(ra_1.multiply(ra_2));
        System.out.println(ra_1.multiply(ra_3));
        System.out.println(ra_2.add(ra_3));
        System.out.println(ra_1.add(ra_2));
        System.out.println(ra_1.divide(ra_2));
        System.out.println(ra_1.divide(ra_3));
        System.out.println(ra_2.subtract(ra_3));
        System.out.println(ra_1.subtract(ra_2));
        System.out.println(ra_2.equals(ra_4));
        System.out.println(RationalNumber.gcd(14,6));
        System.out.println(re_2.compareTo(re_2));
        System.out.println(re_1.compareTo(re_2));
         System.out.println(re_2.compareTo(re_1));

        






    }
}