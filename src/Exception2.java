import java.util.Scanner;

public class try_catch2 {
    public static void main(String[] args) {
        int []marks = new int[3];
        marks[0]=100;
        marks[1]=56;
        marks[2]=44;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of array you want to access");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with");
        int num = sc.nextInt();
        try{
            int c=marks[ind]/num;
            System.out.println("The result is " + c);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occurred");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some other Exception occurred");
        }
        System.out.println("End of the program");
    }

}
