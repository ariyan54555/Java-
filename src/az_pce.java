class volume{
    private int radius;
    private int height;
    public volume(int a,int b){
        radius=a;
        height=b;

    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setHeight(int height)
    {
        this.height=height;
    }
}
public class az_pce {
    public static void main(String[] args) {
        volume v=new volume(5,6);
        int r=v.getRadius();
        int h=v.getHeight();
        System.out.println(Math.PI*r*r*h);
    }
}
