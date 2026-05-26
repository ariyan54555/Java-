import java.util.Locale;
import java.util.Scanner;
public class az_14_stringmethod {
    public static void main(String[] args) {

        // Finding the length of a string
        System.out.print("Enter a name: ");
        Scanner name=new Scanner(System.in);
        String nam=name.nextLine();
//        System.out.print("The name is : ");
//        System.out.println(nam);
//        int length = nam.length();
//        System.out.print("The length of the name is : ");
//        System.out.println(length);
//        String lstring=nam.toLowerCase();
//        System.out.print("The name in lowercase letter : ");
//        System.out.println(lstring);
//        System.out.print("The name in Uppercase letter : ");
//        String ustring=nam.toUpperCase();
//        System.out.println(ustring);

//        System.out.println(nam);
//        System.out.println(nam.trim());//string name.trim() cut the spaces after and before the word
//        System.out.println(nam.substring(1));// start with index 1 and print to last
//        System.out.println(nam.substring(1,4));// start with 1 and print to index number 3.

//        System.out.println(nam.replace('A','P'));// Just replace all olchar to newchar
//        System.out.println(nam.replace("Ari","Ji"));

//        System.out.println(nam.startsWith("Ariyan"));
//        System.out.println(nam.endsWith("Ariyan"));


//        System.out.println(nam.charAt(3));
//        System.out.println(nam.indexOf('a'));//return the given char 1st index
//        System.out.println(nam.indexOf("yan",2));
//        System.out.println(nam.lastIndexOf("sha"));
//        System.out.println(nam.equals("Ariyan"));

        System.out.println(nam.equalsIgnoreCase("Manisha"));
    }
}