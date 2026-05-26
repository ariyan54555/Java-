class father1{

    father1(int x){
        System.out.println("I am a constructor of father1 with value "+x);
    }
    father1()
    {
        System.out.println("I am constructor of father");
    }
}
class son1 extends father1{

    son1(){
        System.out.println("I am constructor of son1");
    }
    son1(int x,int y){
        super(x);
        System.out.println("I am a constructor of son1 with value "+y);
    }
}
class grandson extends son1{
    grandson(){
        System.out.println("I am constructor of grandson");
    }
    grandson(int x,int y,int z){
        super(x,y);
        System.out.println("I am constructor of grandson with value "+z);

    }
}
public class constructors_in_inherirence {
    public static void main(String[] args) {
        father1 f=new father1(4);
        son1 s= new son1(8,9);
        grandson c=new grandson(5,6,7);

    }
}
