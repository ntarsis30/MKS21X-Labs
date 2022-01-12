import java.util.Random;
public class Screen{
  public static void main(String[] args){
    
    for (int i = 1; i <= 30;i++){
      Text.go(i,1);
      System.out.print(Text.colorize(" ", Text.MAGENTA+Text.BACKGROUND));
    }
    for (int i = 1; i <= 80;i++){
      Text.go(30,i);
      System.out.print(Text.colorize(" ", Text.MAGENTA+Text.BACKGROUND));
    }
    for (int i = 1; i <= 30;i++){
      Text.go(i,80);
      System.out.print(Text.colorize(" ", Text.MAGENTA+Text.BACKGROUND));
    }
    for (int i = 1; i <= 80;i++){
      Text.go(1,i);
      System.out.print(Text.colorize(" ", Text.MAGENTA+Text.BACKGROUND));
    }
    int[] nums = new int[4];
    Text.go(2,2);
    for (int i = 0; i < 4; i++){
      Random rand = new Random();
      nums[i]= rand.nextInt(100);
      int color = Text.WHITE;
      if(nums[i]<25){
        color = Text.RED;
      }
      else if (nums[i]>75){
        color = Text.GREEN;
      }
      String display = Integer.toString(color);  
      System.out.print(Text.colorize(display, Text.MAGENTA));
      Text.go(2,2+(i+1)*6);


    }
    Text.go(31,1);
    

  }

}
