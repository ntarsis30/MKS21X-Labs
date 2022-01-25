import java.util.*;
public class Game{

  public static void draw(){
    Text.hideCursor();
    Text.clear();    
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
  }
  public static void draw_not_rand(int a, int b, int c, int d){
    draw();
    int[] nums = {a,b,c,d};
    Text.go(2,2);
    for (int i = 0; i < 4; i++){
      int color = Text.WHITE;
      if(nums[i]<25){
        color = Text.RED;
      }
      else if (nums[i]>75){
        color = Text.GREEN;
      }
      String display = Integer.toString(color);  
      System.out.print(Text.colorize(""+nums[i],color));
      Text.go(2,2+(i+1)*25);
    }
    Text.go(32,1);
    System.out.print(Text.colorize(">", Text.BLUE));
    Scanner in = new Scanner(System.in);
    String check = in.nextLine();
    if(check.equals("")){
      draw_not_rand(a,b,c,d);
    }
    else if(check.equals("q")||check.equals("quit")){
      System.exit(0);
    }
    else{
      draw_screen();
    }
  }
  public static void draw_screen(){
    draw();
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
      System.out.print(Text.colorize(""+nums[i],color));
      Text.go(2,2+(i+1)*25);
    }
    Text.go(32,1);
    System.out.print(Text.colorize(">", Text.BLUE));
    Scanner in = new Scanner(System.in);
    String check = in.nextLine();
    if(check.equals("")){
      draw_not_rand(nums[0],nums[1],nums[2],nums[3]);
    }
    else if(check.equals("q")||check.equals("quit")){
      System.exit(0);
    }
    else{
      draw_screen();
    }
  }
  public static void main(String[] args){
    draw();
    Text.go(2,2);

    Adventurer a = new Warrior("Conan","Aaaaaaaar!",20, 45);
    Adventurer b = new Warrior("Homer","Donuts?",0, 55);
    Adventurer c = new Wizard("Agnes","Zap!",20, 65);
    Adventurer d = new Wizard("Spelliamus","My name?",77, 77);
    Adventurer[] party = {a,b,c,d};
    for (int i = 0; i < party.length; i++){
      System.out.print(party[i].getName());
      Text.go(2,2+(i+1)*20);
    }
    Text.go(3,2);
    for (int i = 0; i < party.length; i++){
      System.out.print(party[i].getSpecialName()+":");
      System.out.print(party[i].getSpecial()+"/");
      System.out.print(party[i].getSpecialMax());
      Text.go(3,2+(i+1)*20);
    }
    Text.go(4,2);
    for (int i = 0; i < party.length; i++){
      int color = Text.WHITE;
      int curr = party[i].getHP();
      int max = party[i].getmaxHP();
      if (100*(((double) curr)/max)<25){
        color = Text.RED;
      }
      else if(100*(((double) curr)/max)>75){
        color = Text.GREEN;
      }
      System.out.print("HP:");
      System.out.print(Text.colorize(curr+"/",color));
      System.out.print(max);
      Text.go(4,2+(i+1)*20);
    }
    Text.go(5,2);
    Adventurer enemy = new Wizard("Crazed Lunatic","Poof!",20, 65);
    System.out.print(Text.colorize("Enter command: ", Text.BLUE));
    Scanner in = new Scanner(System.in);
    String check = in.nextLine();
    if(check.equals("")||check.equals("attack")){
      System.out.println(a.attack(enemy));
    }
    else if(check.equals("quit")||check.equals("q")){
      System.exit(0);
    }

  }
}
