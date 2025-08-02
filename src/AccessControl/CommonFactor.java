public class CommonFactor {
    public static void main(String[] args) {
        int a=5;
        int b=8;
        int ans=NumberOfCommonFactor(a,b);
        System.out.println(ans);

    }
    static int NumberOfCommonFactor(int a,int b){
        int count=0;
        int min=Math.min(a,b);
        for(int i=1;i<=min;i++){
            if(a%i==0&&b%i==0){
                count++;
            }
        }
        return count;
    }
}


