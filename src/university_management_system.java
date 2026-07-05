class Person{
    private String name;
    private int age;
    Person(String name, int age){
       this.name=name;
       this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Student extends Person{
    private String studentId;
    Student(String name,int age,String studentId){
        super(name,age);
        this.studentId=studentId;
    }
    public void   setStudentId(String studentId){ii
        this.studentId=studentId;
    }
    public String getStudentId(){
        return studentId;
    }
    void displayInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("Student ID: "+studentId);

    }
}
class GraduateStudent extends Student{
    private String researchTopic;
    GraduateStudent(String name,int age,String studentId,String researchTopic){
        super(name,age,studentId);
        this.researchTopic=researchTopic;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: "+researchTopic);
    }
}
public class university_management_system {
    public static void main(String[] args){
        GraduateStudent gradStudent = new GraduateStudent("Ariyan", 24, "GS123", "Artificial Intelligence");
        gradStudent.displayInfo();


    }
}
