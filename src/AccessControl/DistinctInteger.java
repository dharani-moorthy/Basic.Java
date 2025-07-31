public class DistinctInteger {
    public static void main(String[] args) {
        int n=5;
        int result=dist(n);
        System.out.println(result);

    }
    public static int dist(int n){
        if(n<=1){
            return 1;
        }
        return n-1;
    }
}
