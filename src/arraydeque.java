import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a = new ArrayDeque<>();

        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.addFirst(10);
        a.addLast(20);

        System.out.println(a.getFirst());
        System.out.println(a.getLast());
    }
}