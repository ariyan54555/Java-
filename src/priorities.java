class MyThr1 extends Thread{
    public MyThr1(String name)
    {
        super(name);
    }
    public void run(){
        int i=0;
        while(true){
            System.out.println("Thank you for using this thread " + this.getName());
        }
    }
}
public class priorities {
    public static void main(String[] args){
        MyThr1 t1= new MyThr1("Ariyan");
        MyThr1 t2= new MyThr1("Niloy");
        MyThr1 t3= new MyThr1("Apurba");
        MyThr1 t4= new MyThr1("Arnab");
        MyThr1 t5= new MyThr1("Emon");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
