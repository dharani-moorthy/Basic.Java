package Basic;
import java.util.Arrays;

public class DivideArray {
    public static void main(String[] args) {
        int[] nums = {3, 3, 2, 2, 2, 2};
        boolean result = divideArray(nums);
        System.out.println(result);
    }
    public static boolean divideArray(int[] nums) {
        if(nums.length%2!=0){
            return false;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=2){
            if(nums[i]!=nums[i+1]){
                return false;
            }
        }
        return true;

    }
}


