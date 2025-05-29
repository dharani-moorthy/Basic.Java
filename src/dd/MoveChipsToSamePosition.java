package dd;
public class MoveChipsToSamePosition {
    public static void main(String[]args){
        int position[]={1,2,3,5,6,7};
        int result=soln(position);
        System.out.println(result);

    }
    public  static int soln(int[]position ){
        int odd=0;int even=0;
        for(int pos:position){
            if(pos%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return Math.min(even,odd);

    }
}
