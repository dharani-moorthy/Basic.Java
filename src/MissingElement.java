import java.util.Arrays;
public class MissingElement {
    public static void main(String[] args) {
        int []nums ={9,6,4,2,3,5,7,0,1};
        System.out.println(Missing(nums));

    }
    public static int Missing(int []nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]!=i){
                return i;
            }

        }
        return nums.length;
    }
}
