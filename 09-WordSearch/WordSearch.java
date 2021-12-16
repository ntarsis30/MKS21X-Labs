/*Lab9: Word Search generator
*/
import java.lang.Math;
import java.util.*;
import java.io.*;
public class WordSearch{
    private char[][]data;
    private ArrayList<String> wordsAdded;
    private Random randgen;
    private int seed;


    public WordSearch(int rows,int cols, String fileName){
      //Choose a randSeed using the clock random
      randgen = new Random();
      seed = randgen.nextInt();
      randgen = new Random(seed);
      data = new char[rows][cols];
      wordsAdded = new ArrayList<String>();
      clear();
      //addAllWords(fileName);
   }

    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[0].length;j++){
          data[i][j]='_';
        }
      }
    }


    //The new toString() method should be formatted to include the list of words you added separated by spaces, as well as the random seed.
    public String toString(){
        String ans = "";
        for(int r = 0; r < data.length; r++){
          for(int c = 0; c < data[r].length; c++){
            ans += data[r][c]+" ";
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


    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */
     /*
    public boolean addWordHorizontal(String word,int row, int col){
      if(col+word.length()>data[0].length){
        return false;
      }
      for (int i = col; i < col+word.length();i++){
        if(data[row][i]!='_' && data[row][i]!=word.charAt(i-col)){
          return false;
        }
      }
      for (int i = col; i < col+word.length();i++){
        data[row][i]=word.charAt(i-col);
        }
      return true;
    }
    */


   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */
     /*
    public boolean addWordVertical(String word,int row, int col){
      if(row+word.length()>data.length){
        return false;
      }
      for (int i = row; i < row+word.length();i++){
        if(data[i][col]!='_' && data[i][col]!=word.charAt(i-row)){
          return false;
        }
      }
      for (int i = row; i < row+word.length();i++){
        data[i][col]=word.charAt(i-row);
      }
      return true;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
     /*
    public boolean addWordDiagonal(String word,int row, int col){
      if(row+word.length()>data.length||col+word.length()>data[0].length){
        return false;
      }
      for(int i = row,j = col; i < row+word.length();i++,j++){
        if(data[i][j]!='_' && data[i][j]!=word.charAt(i-row)){
          return false;
        }
      }
      for (int i = row,j = col; i < row+word.length();i++,j++){
        data[i][j]=word.charAt(i-row);
      }
      return true;
    }
    */
    public boolean addWord(String word, int row, int col, int rowInc, int colInc){
      if(rowInc==0&&colInc==0){
        return false;
      }
      int act1 = row + word.length()*rowInc;
      int act2 = col + word.length()*colInc;
      if ((act1<0 || act1>data.length)||(act2<0 || act2>data[0].length)){
        return false;
      }
      for(int i = row,j = col; (i != act1 || rowInc==0)&&(j != act2 || colInc==0) ;i+=rowInc,j+=colInc){
        int ver_d = Math.abs(i-row);
        int hor_d = Math.abs(j-col);
        int curr = Math.max(ver_d,hor_d);
        if(data[i][j]!='_' && data[i][j]!=word.charAt(curr)){
          return false;
        }
      }
      for(int i = row,j = col; (i != act1 || rowInc==0)&&(j != act2 || colInc==0) ;i+=rowInc,j+=colInc){
        int ver_d = Math.abs(i-row);
        int hor_d = Math.abs(j-col);
        int curr = Math.max(ver_d,hor_d);
        data[i][j]=word.charAt(curr);
      }
      return true;
    }

}
