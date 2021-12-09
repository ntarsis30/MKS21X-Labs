public class Tester{
  public static void main(String[] args){
    WordSearch test = new WordSearch(4,4);
    System.out.println(test);

    System.out.println(test.toString());
    System.out.println(test.addWordHorizontal("hi",0,0));
    System.out.println(test);
    System.out.println(test.addWordVertical("hi",0,0));
    System.out.println(test);
    System.out.println(test.addWordDiagonal("hi",0,0));
    System.out.println(test);




  }
}
