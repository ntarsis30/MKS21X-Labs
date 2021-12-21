public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
        super();
    }
    public OrderedArrayList(int startingCapacity) {
        super(startingCapacity);
    }
    private int whereToPlace(T value){
        for (int i = 0; i < this.size(); i++){
            if (this.get(i).compareTo(value) >= 0){
                return i;
            }
        }
        return this.size();
    }
    public boolean add(T val) {
        super.add(whereToPlace(val), val);
        return true;
    }
    public T set(int idx, T val) {
        if(idx >= 0 && idx < this.size()){
            T prev = super.get(idx);
            super.remove(idx);
            this.add(whereToPlace(val),val);
            return prev;
        }  
        throw new IllegalArgumentException();
    }
    public static void main(String[] args){
        OrderedArrayList<String> curr = new OrderedArrayList<>();
        curr.add("hello");
        System.out.println(curr.get(0));
        curr.add("by");
        System.out.println(curr.get(0));
        // expection curr.add(null);
        curr.set(0,"zan");
        System.out.println(curr.get(0));
    }   
}
