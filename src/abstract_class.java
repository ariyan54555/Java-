abstract class parent2{
    public parent2(){
        System.out.println("I'm a constructor of parent 2");
    }
    public void sayhello(){
        System.out.println("Hello");

    }
    abstract public void sayhello2();
    abstract public void sayhello3();
}
class child2 extends parent2{

    @Override
    public void sayhello2()  {
        System.out.println("Good Morning");
    }

    @Override
    public void sayhello3() {
        System.out.println("Good afternoon");

    }
}
public class abstract_class {
    public static void main(String[] args) {
        child2 c = new child2();
    }
}

