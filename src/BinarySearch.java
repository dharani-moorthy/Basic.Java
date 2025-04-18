import java.util.Arrays;

public class BinarySearch {
    public static void main(String[]arugs){
        int arr[]={-1,2,3,4,7,8,22,33};
        int target=3;
        int answer=Binary(arr, target);
        System.out.println(answer);

    }
    static int Binary(int []arr,int target){
        Arrays.sort(arr);
        int start = 0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
