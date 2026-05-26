interface Bicycle
{
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int a=54;
    void blowHorntndb(int increment);
    void blowHorntfn(int decrement);
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int decrement){
        System.out.println("Speeding Up");
    }
    public void blowHorntndb(int increment){
        System.out.println("Helooooo Peeeeeeeee " + increment);
    }
    public void blowHorntfn(int decrement){
        System.out.println("Heloooo Poooooooooo");
    }

}
public class interfaces {
    public static void main(String[] args){
        AvonCycle b=new AvonCycle();
        b.speedUp(1);
        b.applyBreak(3);

        b.blowHorntfn(23);
        b.blowHorntndb(42);
    }
}
