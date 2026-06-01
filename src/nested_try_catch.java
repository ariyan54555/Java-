import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int []marks = new int[3];
        marks[0]=100;
        marks[1]=56;
        marks[2]=44;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the value of index : ");
            int index = sc.nextInt();
            try {
                System.out.println("Finding the number at the index " + index);
                try {
                    System.out.println("the number at the index " + index + " is " + marks[index]);
                    flag = false;

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Index out of bounds");
                }
            } catch (Exception e) {
                System.out.println("Exception occured");
            }
        }
        System.out.println("Thanks for using the program");
    }
}
