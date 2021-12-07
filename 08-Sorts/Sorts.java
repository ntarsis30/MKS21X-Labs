import java.util.Arrays;
public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static int[] randomTest(int size) {
    int[] nums = new int[size];
    for (int i = 0; i < size; i++) {
      nums[i] = (int)(Math.random()*18-3);
    }
    return nums;
  }
  public static int[] sorted(int size) {
    int[] nums = new int[size];
    for (int i = 0; i < size; i++) {
      nums[i] = (int)(Math.random()*18-3);
    }
    Arrays.sort(nums);
    return nums;
  }
  public static int[] reverseSorted(int size) {
    int[] nums = new int[size];
    for (int i = 0; i < size; i++) {
      nums[i] = (int)(Math.random()*18-3);
    }
    Arrays.sort(nums);
    for (int i = 0; i < size;i++){
      int temp = nums[0];
      int temp2 = nums[size-1-i];
      nums[0]=temp2;
      nums[size-1-i]=temp;
    }
    return nums;
  }
  public static int[] allSame(int size,int val) {
    int[] nums = new int[size];
    for (int i = 0; i < size; i++) {
      nums[i] = val;
    }
    return nums;
  }

  public static void bubbleSort(int[] data){
    int end = data.length-1;
    for (int i = 0; i < data.length;i++){
      int swaps = 0;
      for (int j = 0; j < end;j++){
        if(data[j]>data[j+1]){
          int tempJ1 = data[j];
          int tempJ  = data[j+1];
          data[j]=tempJ;
          data[j+1]=tempJ1;
          swaps++;
        }
      }
      if(swaps==0){
        break;
      }
      else{
          end--;
      }
    }
  }
  /*Selection sort
 */
  public static void selectionSort(int [] ary) {
    for (int start = 0; start < ary.length-1;start++){
      int curr_min = ary[start];
      int pos = start;
      for (int i = start+1; i<ary.length;i++){
        if(ary[i]< curr_min){
          curr_min = ary[i];
          pos=i;
        }
      }
      int temp = ary[pos];
      int temp2  = ary[start];
      ary[start]=temp;
      ary[pos]=temp2;
    }
  }
  public static void insertionSort(int[] ary){
    for (int i = 1; i < ary.length;i++){
      int original = ary[i];
      if(ary[i-1]>original){
        for (int j = i-1;j>=0;j--){
          if (ary[j]>original){
            ary[j+1]=ary[j];
          }
          else{
            ary[j+1]=original;
          }
        }
        if(ary[0]>original){
          ary[0]=original;
        }
      }
    }
  }

  public static void main(String[] args){
    int[] test = {9,6,4,2,5,7,3,1,6,2};
    //selectionSort(test);
    insertionSort(test);
    System.out.println(Arrays.toString(test));
    test = randomTest(100);
    bubbleSort(test);
    System.out.println(Arrays.toString(test));
    test = sorted(100);
    bubbleSort(test);
    System.out.println(Arrays.toString(test));
    test = reverseSorted(100);
    bubbleSort(test);
    System.out.println(Arrays.toString(test));
    test = allSame(100,5);
    bubbleSort(test);
    System.out.println(Arrays.toString(test));
    test = new int[0];
    bubbleSort(test);
    System.out.println(Arrays.toString(test));
    test = randomTest(1);
    bubbleSort(test);
    System.out.println(Arrays.toString(test));
  }
}