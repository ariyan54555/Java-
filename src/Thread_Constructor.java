class MyThr extends Thread{
    public MyThr(String name)
    {
        super(name);
    }
    public void run(){
        int i=0;
        System.out.println("Thank you for using this thread ");
//        while(true){
//            System.out.println("I'm a Thread");
//        }
    }
}
public class Thread_Constructor {
    public static void main(String[] args){
        MyThr t1= new MyThr("Ariyan");
        MyThr t2= new MyThr("joy");
        t1.start();
        t2.start();
        System.out.println("The id of t1 is " + t1.getId());
        System.out.println("The Name of t1 is " + t1.getName());
        System.out.println("The id of t2 is " + t2.getId());
        System.out.println("The Name of t2 is " + t2.getName());

    }
}
