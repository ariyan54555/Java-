class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I'm thread 1 not threat 1");
        System.out.println("I'm thread 1 not threat 1");
        System.out.println("I'm thread 1 not threat 1");
        System.out.println("I'm thread 1 not threat 1");
        System.out.println("I'm thread 1 not threat 1");
        System.out.println("I'm thread 1 not threat 1");
        System.out.println("I'm thread 1 not threat 1");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I'm thread 2 not threat 2");
        System.out.println("I'm thread 2 not threat 2");
        System.out.println("I'm thread 2 not threat 2");
        System.out.println("I'm thread 2 not threat 2");
        System.out.println("I'm thread 2 not threat 2");
        System.out.println("I'm thread 2 not threat 2");
        System.out.println("I'm thread 2 not threat 2");
        System.out.println("I'm thread 2 not threat 2");
    }
}

public class runnable {
    public static void main(String[] args){
           MyThreadRunnable1 bullet1= new MyThreadRunnable1();
           Thread gun1=new Thread(bullet1);
           MyThreadRunnable2 bullet2= new MyThreadRunnable2();
           Thread gun2=new Thread(bullet2);

           gun1.start();
           gun2.start();


    }
}
