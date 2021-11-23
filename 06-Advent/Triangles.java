 import java.io.File;
  import java.io.FileNotFoundException;
  import java.util.Scanner;
  import java.util.ArrayList;
  public class Triangles {
    public static int part1(String fileName) {
      int ans = 0;
      try {
          File file = new File(fileName);
          Scanner input = new Scanner(file);
          while (input.hasNextInt()) {
              int a = input.nextInt();
              int b = input.nextInt();
              int c = input.nextInt();
              if ((a+b>c)&&(a+c>b)&&(b+c>a)){
                ans++;
              }

          }
          input.close();
      } catch (FileNotFoundException ex) {
          //File not found
      }
      return ans;
    }
    public static int part2(String fileName) {
      int ans = 0;
      ArrayList<Integer> first = new ArrayList<Integer>();
      ArrayList<Integer> second = new ArrayList<Integer>();
      ArrayList<Integer> third = new ArrayList<Integer>();
      try {
          File file = new File(fileName);
          Scanner input = new Scanner(file);
          while (input.hasNextInt()) {
              int a = input.nextInt();
              int b = input.nextInt();
              int c = input.nextInt();
              first.add(a);
              second.add(b);
              third.add(c);
          }
          input.close();
      } catch (FileNotFoundException ex) {
          //File not found
      }
      for (int i = 0; i < first.size();i+=3){
        int a1 = first.get(i);
        int a2 = first.get(i+1);
        int a3 = first.get(i+2);
        int b1 = second.get(i);
        int b2 = second.get(i+1);
        int b3 = second.get(i+2);
        int c1 = third.get(i);
        int c2 = third.get(i+1);
        int c3 = third.get(i+2);
        if ((a1+a2>a3)&&(a1+a3>a2)&&(a2+a3>a1)){
          ans++;
        }
        if ((b1+b2>b3)&&(b1+b3>b2)&&(b2+b3>b1)){
          ans++;
        }
        if ((c1+c2>c3)&&(c1+c3>c2)&&(c2+c3>c1)){
          ans++;
        }
      }
      return ans;
    }
    public static void main(String[] args){
        String test = args[0];
        int num = Integer.parseInt(args[1]);
        if(num==1){
          System.out.println(part1(test));

        }
        else if (num==2){
          System.out.println(part2(test));
        }
    }
}
