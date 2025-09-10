package Recursion;
//findig array is sorted or not
public class Array {
    public static void main(String[] args) {
        int[]arr={1,3,2,5,7,6,9,8};
        System.out.println(sorted(arr,0));


    }
    static boolean sorted(int [] arr,int index){
        if (index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&& sorted(arr,index+1);

    }
}
