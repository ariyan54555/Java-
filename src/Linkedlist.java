
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args){
        LinkedList<Integer> l1= new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();

        l1.add(0,9);
        l1.add(1,8);
        l1.add(2,7);
        l1.add(3,2);
        l1.add(4,5);

        l2.add(0,10);
        l2.add(1,23);
        l2.add(2,21);

        l1.addAll(l2);
        l1.addFirst(1000);
        l1.addLast(2000);

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
