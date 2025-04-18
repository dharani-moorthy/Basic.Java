public class LinearSearch {
    public static void main(String[] args) {
        int []nums=new int[] {1,4,5,66,22,33,77,99,2};
        int target=99;
        int ans= linearsearch(nums,target);
        System.out.println(ans);
    }
    public static int linearsearch(int[]arr,int target){
        if(arr.length==0){
            return 0;
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}
