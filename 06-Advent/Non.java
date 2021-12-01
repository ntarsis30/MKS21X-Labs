import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Non{
    public static int part1(String fileName) {
      int ans = 0;
      try {
          File file = new File(fileName);
          Scanner input = new Scanner(file);
          while (input.hasNextLine()) {
              String line = input.nextLine();
              int cnt = 0;
              boolean two_row = false;
              boolean fail = false;
              for (int j = 0; j < line.length();j++){
                char i = line.charAt(j);
                if(i == 'a'||i == 'e'||i == 'i'||i == 'o'||i == 'u'){
                  cnt++;
                }
              }
              for (int i = 0; i < line.length()-1;i++){
                if(line.charAt(i)==line.charAt(i+1)){
                  two_row = true;
                }
                else{
                  String two = line.substring(i,i+2);
                  if(two.equals("ab")||two.equals("cd")||two.equals("pq")||two.equals("xy")){
                    fail = true;
                    break;
                  }
                }
              }
              if(!fail&&two_row&&cnt>=3){
                ans++;
              }
          }
          input.close();
      } catch (FileNotFoundException ex) {
          //File not found
      }
      return ans;
    }
    public static int part2(String fileName){
        int ans = 0;
      try {
          File file = new File(fileName);
          Scanner input = new Scanner(file);
          while (input.hasNextLine()) {
              String line = input.nextLine();
              boolean bool1 = false;
              boolean bool2 = false;
              for (int i = 0; i < line.length()-1;i++){
                  String curr = line.substring(i,i+2);
                  for (int j = i+2; j < line.length()-1;j++){
                      if(curr.equals(line.substring(j,j+2))){
                          bool1 = true;
                          break;
                      }
                  }
              }
              for(int i = 0; i < line.length()-2;i++){
                  if(line.charAt(i)==line.charAt(i+2)){
                      bool2 = true;
                      break;
                  }
              }
              if(bool1 && bool2){
                  ans++;
              }

              
          }
          input.close();
      } catch (FileNotFoundException ex) {
          //File not found
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