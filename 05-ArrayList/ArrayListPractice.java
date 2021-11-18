import java.util.ArrayList;
import static java.lang.Math.min;
import static java.lang.Math.max;

public class ArrayListPractice{
    public static ArrayList<String> replaceEmpty( ArrayList<String> data){
        //return an new ArrayList that has all of the values of the original ArrayList except
        //that all empty strings are replaced with the word "Empty".
        ArrayList<String> ans = new ArrayList<String>();
        for (int i = 0; i < data.size();i++){
            if(data.get(i).equals("")){
                ans.add("Empty");
            }
            else{
                ans.add(data.get(i));
            }
        }
        return ans;

    } 
    public static ArrayList<String> makeReversedList( ArrayList<String> data){
        ArrayList<String> ans = new ArrayList<String>();
        for (int i = data.size()-1; i >=0;i--){
            ans.add(data.get(i));
        }
        return ans;
    } 
    public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
        ArrayList<String> ans = new ArrayList<String>();
        int small = min(a.size(),b.size());
        int big = max(a.size(),b.size());
        for (int i = 0; i < 2*small; i ++){
            if(i%2 == 0){
                ans.add(a.get(i/2));
            }
            else{
                ans.add(b.get(i/2));
            }
        }
        if (a.size()==big){
            for (int i = small+1; i < big; i++){
                ans.add(a.get(i));
            }
        }
        else{            
            for (int i = small+1; i < big; i++){
                ans.add(b.get(i));
            }
        }
        return ans;
        
        

    
    } 
}