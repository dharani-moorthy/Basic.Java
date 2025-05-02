package Basic;
import java.util.Scanner;
class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the value of Arrays:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int freq[] = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited) {
                System.out.println("frequency of " + arr[i] + "---->" + freq[i]);

            }
        }
    }
}
