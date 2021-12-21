public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
    public OrderedArrayList() {
        super();
    }
    public OrderedArrayList(int startingCapacity) {
        super(startingCapacity);
    }
    private int whereToPlace(T value){
        for (int i = 0; i < this.size(); i++){
            if (this.get(i).compareTo(value) > 0){
                return i;
            }
        }
        return this.size();
    }
}
