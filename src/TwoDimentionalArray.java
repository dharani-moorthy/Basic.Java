import java.util.Arrays;
public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = {
                {3, 4, 5, 6, 7},
                {4, 5, 6},
                {5, 6, 3, 4},
        };
        for (int row = 0; row < arr.length; row++) {
                System.out.println(Arrays.toString(arr[row]));
            }

        }
    }


