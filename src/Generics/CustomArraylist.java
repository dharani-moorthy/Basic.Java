package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {
    public static class CustomArrayList {
        private  int[] arr;
        private static int DEFAULT_SIZE = 10;
        private int size = 10;//also work as index value

        public CustomArrayList() {
            this.arr = new int[DEFAULT_SIZE];
        }

        public void add(int num) {
            if (isFull()) {
                resize();
            }
            arr[size++] = num;
        }

        private void resize() {
            int[] temp = new int[arr.length * 2];//copy the current items in the new array
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];

            }
            arr = temp;
        }

        private boolean isFull() {
            return size == arr.length;
        }

        public int remove() {
            int removed = arr[--size];
            return removed;
        }
        public int set(int index){
            return arr[index];
        }
        public int size (){
            return size;
        }
        public void set(int index,int value){
            arr[index]=value;
        }

        @Override
        public String toString() {
            return "CustomArrayList{" +
                    "arr=" + Arrays.toString(arr) +
                    ", size=" + size +
                    '}';
        }

        public static void main(String[] args) {
            //  ArrayList list =new ArrayList();
            CustomArrayList list = new CustomArrayList();
            list.add(3);
            list.add(9);
            System.out.println(list);
        }
    }
}