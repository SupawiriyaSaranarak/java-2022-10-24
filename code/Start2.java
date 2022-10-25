import java.util.ArrayList;
public class Start2 {
    public static void main(String[] data){
        ArrayList a = new ArrayList();
        a.add(5); // converted to instanceof Integer
        a.add("Latte");
        a.add(2.8);
        a.add(6);
        a.add(3);
        int sum = 0;
        for (Object o: a){
//            System.out.println(o);
            if (o instanceof Integer) sum += (Integer) o;   
        }
        System.out.println(sum);
    }
    
}
