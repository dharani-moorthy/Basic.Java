package Recursion;
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int b[]={6,7,8,9,1,2,3,4,5};
        System.out.println(search(b,9,0,b.length-1));
    }
    static int search(int b[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(b[m]==target) {
            return m;
        }
        if(b[s]<=b[m]) {
            if (target >= b[s] && target <= b[m]) {
                search(b, target, s, m - 1);
            } else {
                return search(b, target, m + 1, e);
            }
        }
            if(target>=b[m]&&target<=b[e]){
                search(b,target,m+1,e-1);
            }
            return search(b,target,s,m-1);
        }
    }