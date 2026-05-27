class c1{
    public int x=5;
    protected int y=6;
    int z=78;
    private int a=98;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class access_Modifiers {
    public  static void main(String[] args) {
        c1 c = new c1();
        c.meth1();//x,y,z,a can be access from same class
            System.out.println(c.x);//x can be access from different class
            System.out.println(c.y);//y can be access from different class but in same package
            System.out.println(c.z);//z can be access from different class but in same package
            //System.out.println(c.a);//a can't be access from different class

    }
}
