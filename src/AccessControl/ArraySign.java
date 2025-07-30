package AccessControl;
 class ArraySign {
        public static void main(String[] args) {
            int [] nums={-1,-2,-3,-4,3,2,1};
            int result=signArray(nums);
            System.out.println(result);

        }
        public  static int signArray(int []nums){
            int s=1;
            for(int num:nums) {
                if (num == 0) return 0;
                if (num < 0) s *= -1;
            }
            return s;
        }
    }
