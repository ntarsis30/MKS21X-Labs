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
    draw_screen();
    

  }
}
/*
public class Game{
  public static void main(String[] args) {
    Adventurer a = new Warrior("Conan","Aaaaaaaar!",20);
    Adventurer b = new Warrior("Homer","Donuts?",0);
    Adventurer c = new Wizard("Agnes","Zap!",20);
    Adventurer d = new Wizard("Spelliamus","My name?",77);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.attack(b);
    b.attack(a);
    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    a.specialAttack(b);
    b.specialAttack(a);

    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    System.out.println(c+" ("+c.getHP()+"HP)");
    System.out.println(d+" ("+d.getHP()+"HP)");

    a.attack(b);
    b.attack(a);
    c.attack(d);
    d.attack(b);

    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    System.out.println(c+" ("+c.getHP()+"HP)");
    System.out.println(d+" ("+d.getHP()+"HP)");

    a.specialAttack(b);
    b.specialAttack(a);
    c.specialAttack(b);
    d.specialAttack(a);

    System.out.println(a+" ("+a.getHP()+"HP)");
    System.out.println(b+" ("+b.getHP()+"HP)");
    System.out.println(c+" ("+c.getHP()+"HP)");
    System.out.println(d+" ("+d.getHP()+"HP)");

    d.specialAttack(d);
    System.out.println(d+" ("+d.getHP()+"HP)");



    }

}
*/