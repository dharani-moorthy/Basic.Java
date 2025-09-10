package Recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {2, 45, 66, 88, 456};
        System.out.println(find(a,66,0));
        System.out.println(finfIndex(a,5,0));
        System.out.println(finfIndexLast(a,5,a.length-1));
    }

    static boolean find(int[] a, int target, int index) {
        if (index == a.length) {
            return false;
        }
        return a[index] == target || find(a, target, index+1);
    }

    static int finfIndex(int[] a, int target, int index) {
        if (index == a.length) {
            return -1;
        }
        if (a[index] == target) {
            return index;
        } else {
            return finfIndex(a, target, index + 1);
        }
    }
        static int finfIndexLast( int[] a, int target, int index){
            if (index == -1) {
                return -1;
            }
            if (a[index] == target) {
                return index;
            } else {
                return finfIndexLast(a, target, index - 1);
            }
        }
    }

