import java.util.Random;
import java.util.Scanner;
class game{
    public int NuMber;
    public int inputnumber;
    public int noOfguess;

    public int getNoOfguess() {
        return noOfguess;
    }

    public void setNoOfguess(int noOfguess) {
        this.noOfguess = noOfguess;
    }
    game(){
        Random rand=new Random();
        this.NuMber=rand.nextInt(100);

    }
    void takeuserinput(){
        System.out.println("Guess the number:");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();
    }
    boolean istrue(){
        noOfguess++;
        if(inputnumber==NuMber){
            System.out.format("Yes you guessed it right,it was %d\nyou guessed it in %d Attempts",NuMber,noOfguess);
            return true;
        }
        else if(inputnumber>NuMber){
            System.out.println("Too High...");
        }
        else if(inputnumber<NuMber){
            System.out.println("Too Low...");
        }
        return false;
    }
}
public class guess_the_number {
    public static void main(String[] args){
        game g= new game();
        boolean b=false;
        while(!b){
            g.takeuserinput();
            b= g.istrue();
        }

    }
}
