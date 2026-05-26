class empl{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name=n;
    }

}
public class prm {
    public static void main(String[] args) {
        empl ariyan = new empl();
        ariyan.setname("Manisha");
        ariyan.salary=100009;
        System.out.println(ariyan.getname());
        System.out.println(ariyan.getsalary());
    }
}
