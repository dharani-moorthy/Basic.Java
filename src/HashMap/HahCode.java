package HashMap;
import java.util.HashMap;
import java.util.Map;
public class HahCode {
    public static  void main(String[]args){
        Map<String,String> Mark= new HashMap<>();
        Mark.put("student 1","13");
        Mark.put("student 2","21");
        Mark.put("student 3","33");
        Mark.put("student 4","90");
        Mark.put("student 5","100");
        System.out.println(Mark.get("student 1"));


    }
}

