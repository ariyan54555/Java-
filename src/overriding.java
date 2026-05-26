class A{
    public int car(){
        return 3;
    }
    public void bike(){
        System.out.println("I'm a bike of class A");
    }
}
class B extends A{
    public int truck()
    {
        return 8;
    }
    public void bike(){
        System.out.println("I'm a bike of class B");
    }
}
public class overriding {
    public static void main() {
        A a= new A();
        a.bike();

        B b= new B();
        b.bike();
    }
}
