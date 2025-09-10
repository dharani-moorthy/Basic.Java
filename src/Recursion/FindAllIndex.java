package Recursion;
import java.util.ArrayList;

public class FindAllIndex {
    public static void main(String[] args) {
        int[] a = {1, 6, 4, 4, 6, 4,9};
//        findALL(a, 4, 0);
//        System.out.println(list);
        System.out.println(findALL(a,4,0,new ArrayList<>()));

    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findALL(int[] a, int target, int index) {
        if (index == a.length) {
            return;

        }
        if (a[index] == target) {
            list.add(index);
        }
        findALL(a, target, index + 1);
    }

    static ArrayList <Integer>findALL(int[] a, int target, int index, ArrayList<Integer> list) {
        if (index == a.length) {
            return list;

        }
        if (a[index] == target) {
            list.add(index);
        }
       return findALL(a, target, index + 1,list);
    }
}

