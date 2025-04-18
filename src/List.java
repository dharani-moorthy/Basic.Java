import java.util.ArrayList;
public class List {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>(10);
        ll.add(2);
        ll.add(45);
        ll.add(345);
        System.out.println(ll);
        System.out.println(ll.remove(2));
        System.out.println(ll.contains(3));
        System.out.println(ll.get(1));
    }
}
