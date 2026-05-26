import java.util.Scanner;//write for scan input from the users.
public class CWH_05_takingvaribales
{
    public static void main(String[] args)
    {
        System.out.println("Taking Input From the Users");
        Scanner sc= new Scanner(System.in);// sc is kind of a class through this we make input type object.
        System.out.println("Enter Number 1");
        int a=sc.nextInt();
        System.out.println(a);
        System.out.println("Enter Number 2");
        Scanner ariyan=new Scanner(System.in);// make new type scanner class named ariyan
        int b=ariyan.nextInt();
        System.out.println(b);
        int sum=a+b;
        System.out.print("The Sum of the two number is: ");
        System.out.println(sum);
        // using this class we can input also float numbers
        System.out.println("Enter any floating type number: ");
        float c=sc.nextFloat();
        System.out.println("Enter another floating type number: ");
        float d= ariyan.nextFloat();
        float sumFloat = c+d;
        System.out.print("The Sum of the floating type number is : ");
        System.out.println(sumFloat);
        //Checking numbers type validity.
        boolean b1=sc.hasNextInt();// if we take floating type or byte or string it will print false
        System.out.println(b1);
//        System.out.println("Enter any string:");
//        String str=sc.next();// can input just a single word,not whole line.
//        System.out.println(str);
        System.out.println("Enter another line  : ");
        String str1=sc.nextLine();// can take whole line not just e single word
        System.out.println(str1);

    }
}
