import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        
        list1.add(3);
        
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
        list1.set(1, 5);
        System.out.println(list1);
    }
    
}
