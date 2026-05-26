public class methodoverloading {
    static void foo()
    {
        System.out.println("Hey ariyan broo!!!");
    }
    static void foo(int a){
        System.out.println("Hey ariyan give me " + a + " taka!!");
    }

    public static void main(String[] args) {
        foo();
        foo(488);

    }
}
