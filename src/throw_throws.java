import java.util.Scanner;

class NegativeRadiusException extends Exception{
    public String toString(){
        return "Radius cannot be negative";
    }
    public String tomessage(){
        return "Radius cannot be negative";
    }
}
public class throw_throws {
    public static double area(int r)throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a and b :");
        a=sc.nextInt();
        b=sc.nextInt();
        int c;
        try{
            c=divide(a,b);
            System.out.println("The Value of c is : " + c);
        }
        catch(Exception e){
            System.out.println("Exception occured");
        }
        int r;
        System.out.println("Enter the value of radius :");
        r=sc.nextInt();
        try{
            double ar=area(r);
            System.out.println("The area of circle is : " + ar);
        }
        catch(NegativeRadiusException e){
            System.out.println(e.tomessage());
        }
    }
}
