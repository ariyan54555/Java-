import java.util.Scanner;
class car{
    private String name;
    private int number;
    private int year;
    public car(String n,int nm,int y){
        name=n;
        number=nm;
        year=y;

    }
    public String showname(){
        return name;
    }
    public int shownumber(){
        return number;
    }
    public int showyear(){
        return year;
    }
}
public class constructors {
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);
        System.out.print("Enter Car Name : ");
        String name=n.nextLine();
        System.out.print("Enter Car Number : ");
        int number=n.nextInt();
        System.out.print("Enter Car Launching Year : ");
        int year=n.nextInt();
        car bd= new car(name,number,year);
        System.out.println("Car Info :");
        System.out.println(bd.showname() +" "+bd.shownumber() +" "+bd.showyear());
//        System.out.println(bd.shownumber());
//        System.out.println(bd.showyear());

    }
}
