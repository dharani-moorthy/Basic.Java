public class CountZero {
    public static void main (String[]args){
        int a=400023;
        int result=Zero(a);
        System.out.println(result);
    }
    public static int Zero(int a){
        int count=0;
        char []b=String.valueOf(a).toCharArray();
        for(int i=0;i<b.length;i++) {
            if (b[i] == '0') {
                count++;
            }
        }

return count;
    }

}
