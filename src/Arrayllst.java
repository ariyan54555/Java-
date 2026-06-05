import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);

        l1.add(0,9);
        l1.add(1,8);
        l1.add(2,7);
        l1.add(3,2);
        l1.add(4,5);

        l2.add(0,10);
        l2.add(1,23);
        l2.add(2,21);

        l1.addAll(l2);

        System.out.println(l1.contains(100));
        System.out.println(l1.contains(10));
        System.out.println(l1.indexOf(10));
        // l1.clear();

        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
    }
}
