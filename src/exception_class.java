import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I'm toString method of MyException class";
    }
    public String tomessage(){
        return "I'm tomessage method of MyException class";
    }
}
public class exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a<10){
            try{
                throw new MyException();

            }
            catch(MyException e){
                System.out.println(e.toString());
                System.out.println(e.tomessage());
                e.printStackTrace();
            }
        }


    }
}
