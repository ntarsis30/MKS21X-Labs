public class Test{
    public static void main(String[] args){
        SuperArray arr_1 = new SuperArray();
        System.out.println(arr_1);
        System.out.println(arr_1.size());
        System.out.println(arr_1.toString());
        System.out.println(arr_1.toStringDebug());
        arr_1.add("Hello");
        arr_1.add("There");//hehe
        System.out.println(arr_1);
        System.out.println(arr_1.size());
        System.out.println(arr_1.toString());
        System.out.println(arr_1.toStringDebug());
        arr_1.remove(0);
        System.out.println(arr_1);
        System.out.println(arr_1.size());
        System.out.println(arr_1.toString());
        System.out.println(arr_1.toStringDebug());
        arr_1.add("1");
        arr_1.add("1");
        arr_1.add("1");
        arr_1.add("1");
        arr_1.add("1");
        arr_1.add("1");
        arr_1.add("1");
        arr_1.add("1");
        arr_1.add("1");
        arr_1.add("1");
        arr_1.add("1");
        arr_1.add("1");
        arr_1.add("1");
        System.out.println(arr_1);
        System.out.println(arr_1.size());
        System.out.println(arr_1.toString());
        System.out.println(arr_1.toStringDebug());


    }
}
