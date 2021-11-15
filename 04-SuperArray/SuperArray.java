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
    public String remove(int take_off){
        if (take_off<0 || take_off>=size){
            throw new IndexOutOfBoundsException("Value out of range: "+take_off);
        }
        String curr = data[take_off];
        for (int i = take_off; i < size - 1; i++){
            data[i]=data[i+1];
        }
        size--;
        data[size]=null;
        return curr;
    }
    public String toString(){
        String ans = "[";
        for(int i = 0; i < size; i++){
            ans += data[i];
            if(i < size-1) {
                ans += ", ";
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
        throw new IndexOutOfBoundsException("Value out of range: "+index);
      }
      return data[index];
    }
    public String set(int index, String element){
      if(index < 0 || index >= size){
        throw new IndexOutOfBoundsException("Value out of range: "+index);
      }
      String old = data[index];
      data[index] = element;
      return old;
    }
    public SuperArray(int initialCapacity){
      if(initialCapacity<0){
        throw new IllegalArgumentException("Value out of range: "+initialCapacity);
        }
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
    public int indexOf(String target){
      for (int i = 0; i < size;i++){
        if(data[i].equals(target)){
          return i;
        }
      }
      return -1;
    }
    public int lastIndexOf(String target){
      for (int i = size-1; i >= 0;i--){
        if(data[i].equals(target)){
          return i;
        }
      }
      return -1;
    }
    public void add(int index,String value){
      if (index < 0 || index > size){
        throw new IndexOutOfBoundsException("Value out of range: "+index);
      }
      size++;
      if (size == data.length){
        resize();
      }
      for (int i = size-1; i > index; i--){
        data[i]=data[i-1];
      }
      data[index]=value;
    }
    public boolean remove(String target){
      int first = indexOf(target);
      remove(first);
      return first != -1;
    }
}
