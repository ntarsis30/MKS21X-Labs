public class Tester{
  public static void main(String[] args){
    WordSearch test = new WordSearch(4,4);
    System.out.println(test);

    System.out.println(test.toString());
    System.out.println(test.addWord("hi",0,0,0,1));
    System.out.println(test);
    System.out.println(test.addWord("hi",0,0,3,0));
    System.out.println(test);
    System.out.println(test.addWord("hike",0,0,1,1));
    System.out.println(test);




  }
}
