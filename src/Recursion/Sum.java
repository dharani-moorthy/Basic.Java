package Recursion;
public class Sum {
    public static void main(String[] args) {
        int n=1345;
        int ans=SumOfDigit(n);
        System.out.println(ans);

    }
    static int SumOfDigit(int n){
        if(n==0){
            return 0;
        }

            return (n%10)+SumOfDigit(n/10);

    }
}
