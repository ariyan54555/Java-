
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);//Duplicate values are not allowed
        System.out.println(set);

        //Search
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }

        else{
            System.out.println("Set does not contain 1");
        }
        //Delete
        set.remove(1);
        System.out.println(set);
        //size
        System.out.println("Size of set: " + set.size());
        //Iterate
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
