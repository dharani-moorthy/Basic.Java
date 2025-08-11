public class NumberOfZeros {
    public static void main(String[] args) {
        int n = 30302;
        int result = Zero(n);
        System.out.println(result);
    }
    static int Zero(int n) {
        int count = 0;
        char ch[] = String.valueOf(n).toCharArray();
        for (int c : ch) {
            if (c == '0') {
                count++;
            }
        }
        return count;
    }
}
