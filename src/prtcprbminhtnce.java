class circle{
    public int radius;
    circle(){
        System.out.println("I am non parameterized");
    }
    circle(int r){
        System.out.println("I'm Circle parameterized constructor.");
        this.radius=r;
    }
    public double area(){
        return Math.PI*Math.pow(this.radius,2);
    }
}
class cylinder extends circle{
    public int height;
    cylinder(int r,int h){
        //super(r);
        System.out.println("I'm Cylinder parameterized constructor.");
        this.height=h;

    }
    public double volume(){
        return Math.PI*Math.pow(this.radius,2)*this.radius;
    }

}
public class prtcprbminhtnce {
    public static void main(String[] args){
//        circle obj=new circle(12);
        cylinder obj1=new cylinder(12,12);
    }
}
