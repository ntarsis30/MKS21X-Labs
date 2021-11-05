public class SuperArray{
    private String[] data;
    private int size;
    public SuperArray(){
        size = 0;
        data = new String[10];
    }
    public int size(){
        return size;
    }
    public void add(String append){
        data[size] = append;
        size++;
    }
    public void remove(int take_off){
        String curr = data[take_off];
        for (int i = take_off; i < size - 1; i++){
            data[i]=data[i+1];
        }
        size--;
        data[size]=null;
    }
    public String toString(){
        String ans = "[";
        for(int i = 0; i < size; i++){
            ans += data[i];
            if(i < size-1) {
                ans += ",";
            }
        }
        return ans + "]";
    }
    public String toStringDebug(){
        String ans = "[";
        for(int i = 0; i < data.length; i++){
            ans += data[i];
            if(i < data.length-1) {
                ans += ",";
            }
        }
        return ans + "]";
    }

}   
