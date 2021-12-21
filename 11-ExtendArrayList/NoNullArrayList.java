import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
    private T value;
    public NoNullArrayList() {
        super();
    }
    public NoNullArrayList(int startingCapacity) {
        super(startingCapacity);
    }
    public T set(int idx, T val) {
        if (val == null) {
            throw new IllegalArgumentException();
        }
        super.set(idx, val);
        return val;
    }
    public boolean add(T val) {
        if (val == null) {
            throw new IllegalArgumentException();
        }
        super.add(val);
        return true;
    }
    public void add(int idx, T val) {
        if (val == null) {
            throw new IllegalArgumentException();
        }
        super.add(idx, val);
    }
    public static void main(String[] args){
        NoNullArrayList<String> curr = new NoNullArrayList<>();
        curr.add("hello");
        System.out.println(curr.get(0));
        curr.set(0,"there");
        System.out.println(curr.get(0));
        curr.add(0,"by");
        System.out.println(curr.get(0));
        // exception curr.add(null);
    }
}