package Basic;
    public class MaximumCount {
        public static void main(String[] args) {
            int []nums={-1,-2,-3,-4,6,7,8,9,3,4};
            int answer=maximumCount(nums);
            System.out.println(answer);
        }
        public static int maximumCount(int []nums){
            int Pcount=0;
            int Ncount=0;
            for (int i = 0; i < nums.length ; i++) {
                if(nums[i]>0){
                    Pcount++;
                }
                else if (nums[i]<0) {
                    Ncount++;

                }
            }
            return Math.max(Pcount,Ncount);
        }
    }
