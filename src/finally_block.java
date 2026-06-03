
public class finally_block {
    public static int greet(){
        int a=5;
        int b=0;
        int c;
        try{
            c=a/b;
            System.out.println("The result is "+c);

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is finally block");
        }
        return 0;
    }

    public static void main(String[] args){

        greet();

    }
}
