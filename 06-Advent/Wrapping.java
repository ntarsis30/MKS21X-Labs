import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Wrapping{
    public static int part1(String fileName) {
      int ans = 0;
      try {
          File file = new File(fileName);
          Scanner input = new Scanner(file);
          while (input.hasNextLine()) {
              String line = input.nextLine();
              String[] nums = line.split("x");
              int a = Integer.parseInt(nums[0]);
              int b = Integer.parseInt(nums[1]);
              int c = Integer.parseInt(nums[2]);
              ans += 2*(a*b+a*c+b*c);
              int small = Math.min(a*b,a*c);
              small = Math.min(small,b*c);
              ans+=small;
          }
          input.close();
      } catch (FileNotFoundException ex) {
          //File not found
      }
      return ans;
    }
    public static void main(String[] args){
        String test = args[0];
        System.out.println(part1(test));

    }
}