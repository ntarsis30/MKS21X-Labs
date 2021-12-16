import java.util.*;
import java.io.*;
public class WordSearch{
  private char[][] grid;
  private ArrayList<String> wordsAdded;
  private Random rng;
  private int seed;

  //assume a rectangular grid
  private void addAllWords(String filename){
    ArrayList<String> wordsToAdd = loadWordsFromFile(filename);
    //You are writing this
    rng = new Random();
    while (wordsToAdd.size()>0){
        int word_i = rng.nextInt(wordsToAdd.size());
        String curr_word = wordsToAdd.get(word_i);
        for(int test = 0; test < 200; test++){
            int row = rng.nextInt(grid.length);
            int col = rng.nextInt(grid[0].length);
            int row_dir = rng.nextInt(3)-1;
            int col_dir = rng.nextInt(3)-1;
            if(addWord(curr_word,row,col,row_dir,col_dir)){
                break;
            }
        }
        wordsToAdd.remove(curr_word);
    }

  }

  public WordSearch(int rows,int cols, String fileName){
    rng = new Random();
    seed = rng.nextInt();
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public WordSearch(int rows,int cols, String fileName, int s){
    seed = s;
    rng = new Random(seed);
    grid = new char[rows][cols];
    clear();
    wordsAdded = new ArrayList<String>();
    addAllWords(fileName);
  }

  public static ArrayList<String> loadWordsFromFile(String fileName){
    ArrayList<String>words = new ArrayList<String>();
    try{
      Scanner input = new Scanner(new File(fileName));
      while(input.hasNextLine()){
        String line = input.nextLine();
        if(! line.equals("")){
          words.add(line.toUpperCase());
        }
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
      System.exit(1);
    }
    return words;
  }



  private void clear(){
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        grid[r][c]='_';
      }
    }
  }


  //precondition word grids are rectangular
  private boolean inBounds(int r, int c){
    return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length;
  }
  public boolean addWord(String word,int row, int col, int dr, int dc){
    //make sure there is some non 0 vector for direction
    if(dr == 0 && dc == 0){
      return false;
    }
    //check endpoints of word
    if(!inBounds(row,col) || !inBounds(row + dr * (word.length() - 1), col + dc * (word.length() - 1 ))){
      return false;
    }
    //check for conflicting letters
    for(int i = 0; i < word.length(); i++){
      char c = grid[row + i * dr][col + i * dc];
      if(c != '_' && c != word.charAt(i)){
        return false;
      }
    }
    //change
    for(int i = 0; i < word.length(); i++){
      grid[row + i * dr][col + i * dc] = word.charAt(i);
    }
    wordsAdded.add(word);
    return true;
  }

  public String toString(){
    String ans = "";
    for(int r = 0; r < grid.length; r++){
      for(int c = 0; c < grid[r].length; c++){
        ans += grid[r][c]+" ";
      }
      ans+="\n";
    }
    ans += "words: ";
    for(String word:wordsAdded){
      ans+= word+" ";
    }
    ans += "\nseed: "+seed;
    return ans;
  }
  public void fillInRandomLetters(){
    rng = new Random();
    for (int i = 0; i < grid.length;i++){
        for(int j = 0; j < grid[0].length;j++){
            if(grid[i][j]=='_'){
                grid[i][j]= (char)('A'+rng.nextInt(26));
            }
        }
    }
  }
  public static void main(String[] args){
    WordSearch ws;
    int args0 = Integer.parseInt(args[0]);
    int args1 = Integer.parseInt(args[1]);
    int args3 = Integer.parseInt(args[3]);
    if(args.length==4){
        ws = new WordSearch(args0,args1,args[2]);
    }
    else{
        int args4 = Integer.parseInt(args[4]);
        ws = new WordSearch(args0,args1,args[2],args4);
    }
    if(args3 == 0){
        ws.fillInRandomLetters();
    }
    System.out.println(ws.toString());

    


  }
}