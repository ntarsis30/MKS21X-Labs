public class Screen{
  public static void main(String[] args){
    for (int i = 1; i <= 30;i++){
      Text.go(i,1);
      System.out.print(Text.colorize(" ", Text.RED+Text.BACKGROUND));
    }
    Text.go(30,1);
    for (int i = 0; i < 80;i++){
      Text.go(30,i+1);
      System.out.print(Text.colorize(" ", Text.RED+Text.BACKGROUND));
    }
    Text.go(30,80);
    for (int i = 0; i < 30;i++){
      Text.go(i+1,80);
      System.out.print(Text.colorize(" ", Text.RED+Text.BACKGROUND));
    }
    Text.go(1,80);
    for (int i = 0; i < 80;i++){
      Text.go(1,i+1);
      System.out.print(Text.colorize(" ", Text.RED+Text.BACKGROUND));
    }

  }

}
