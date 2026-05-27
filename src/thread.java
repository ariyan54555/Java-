
class MyThread extends Thread{
    public void run(){
        while(true){
            System.out.println("My Cooking Thread is running...");
            System.out.println("I am happy");

        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Thread2 for Chatting with her..");
            System.out.println("I am sad");
        }
    }
}
public class thread {
    public static void main(String[] args){

        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();

    }
}
