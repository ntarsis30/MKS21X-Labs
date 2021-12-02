import java.util.Arrays;
public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static int[] Test(int size) {
    int[] nums = new int[size];
    for (int i = 0; i < size; i++) {
      nums[i] = (int)(Math.random()*18+3);
    }
    Arrays.sort(nums);
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
  public static void main(String[] args){
    int[] test = {9,6,4,2,5,7,3,1,6,2};
    bubbleSort(test);
    System.out.println(Arrays.toString(test));
    test = Test(100);
    bubbleSort(test);
    System.out.println(Arrays.toString(test));
  }
}