import java.util.Scanner;

public class az_14_ps {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter any string: ");
        String name=str.nextLine();
        System.out.print("The name is : ");
        System.out.println(name);
        System.out.print("Replace name is : ");
        System.out.println(name.replace(' ','_'));
    }
}
