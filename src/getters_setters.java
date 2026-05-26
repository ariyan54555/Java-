class erl{
    private int id;
    private String name;

    public void setid(int n){
        id=n;
    }
    public void setname(String n)
    {
        name=n;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
}
public class getters_setters {
    public static void main(String[] args) {
        erl ariyan = new erl();
        ariyan.setid(25115469);
        ariyan.setname("Ariyan");
        System.out.println(ariyan.getid());
        System.out.println(ariyan.getname());
    }

}
