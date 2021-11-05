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
    public boolean add(String append){
        data[size] = append;
        size++;
        if (size == data.length){
          resize();
        }
        return true;
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
    public String get (int index){
      if(index < 0 || index >= size){
        return "badindex";
      }
      return data[index];
    }
    public String set(int index, String element){
      if(index < 0 || index >= size){
        return "badindex";
      }
      String old = data[index];
      data[index] = element;
      return old;
    }
    public SuperArray(int initialCapacity){
      size = 0;
      data = new String[initialCapacity];
    }
    private void resize(){
      String[] changed = new String[data.length*2+1];
      for (int i = 0; i < size;i++){
        changed[i]=data[i];
      }
      data = changed;
    }


}
