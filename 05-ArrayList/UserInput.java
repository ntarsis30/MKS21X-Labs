import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class UserInput{
    public static void main(String[] args){
        ArrayList<Double> nums = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);
        double mean = 0.0;
        double max = 0.0;
        double min = Double.MAX_VALUE;

        while (true){
            System.out.println("Enter a non negative number. A negative number will end the program:");
            double num = in.nextDouble();
            if(num>=0){
                nums.add(num);
                if (num>max){
                    max = num;
                }
                if (num<min){
                    min = num;
                }
                mean+=num;
            }
            else{
                break;
            }

        }
        if (nums.size()>0){
            mean/=nums.size();
        }

        System.out.println("You entered: " + nums);
        System.out.println("Mean: " + mean);
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);

        


    }
}