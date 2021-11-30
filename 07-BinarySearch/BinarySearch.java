import java.util.Arrays;
import java.lang.Math;


public class BinarySearch{
  public static int[] Test(int size) {
    int[] nums = new int[size];
    for (int i = 0; i < size; i++) {
      nums[i] = (int)(Math.random()*18+3);
    }
    Arrays.sort(nums);
    return nums;
  }
  public static int binarySearch(int[]data,int target){
    int lo = 0;
    int hi = data.length-1;
    while(lo<=hi){
      int mid = (lo+hi)/2;
      if(data[mid]==target){
        return mid;
      }
      else if(data[mid]<target){
        lo = mid+1;
      }
      else{
        hi = mid-1;
      }
    }
    return -1;
  }
  public static void main(String[] args){
    int result;
    result = binarySearch(new int[]{0,0,0,0,0,0,0},0);
    System.out.println(result);//should be 3
    result = binarySearch(new int[]{0,0,0,0,0,0,0},1);
    System.out.println(result);//should be -1

    result = binarySearch(new int[]{0,1,2,3,4,5,6},0);
    System.out.println(result);//should be 0
    //...
    result = binarySearch(new int[]{0,1,2,3,4,5,6},6);
    System.out.println(result);//should be 6
    //Tip: You can use a loop to find if it works on 0,1,2,3,4,5,and 6 in this array!
    int[] test = Test(100);
    result = binarySearch(test,6);
    System.out.println(result);
  }
}
