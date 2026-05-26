class phone{
    public void Onphone(){
        System.out.println("Phone is on...");
    }
    public void music(){
        System.out.println("Music is playing....");
    }
}
class smartphone extends phone{
    public void Onphone(){
        System.out.println("Smartphone is on...");
    }
    public void time(){
        System.out.println("Time is one...");
    }
}
public class dynamic_mathod_dispatch {
    public static void main(String[] args) {
        phone obj=new smartphone();
        obj.Onphone();
        obj.music();
        //  obj.time(); this is invalid in this case..
        /* obj.time() is valid if initalize
        smartphone obj=new smartphone();
         */
    }
}
