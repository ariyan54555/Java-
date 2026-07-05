interface LibraryService{
    void borrowBook();
    void returnBook();
    double calculateFine(int daysLate);
}
class Member implements LibraryService{
    private int memberId;
    private String memberName;
    private int borrowedBooks;
    Member(int memberId,String memberName,int borrowedBooks){
        this.memberId=memberId;
        this.memberName=memberName;
        this.borrowedBooks=borrowedBooks;

    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
   public void displayInfo(){
       System.out.println("Member ID: " + memberId);
       System.out.println("Member Name: " + memberName);
       System.out.println("Borrowed Books: " + borrowedBooks);
    }

    public void returnBook() {
        System.out.println("Returned a Book");
    }

    public void borrowBook() {
        System.out.println("Borrowed a Book");
    }
    public double calculateFine(int daysLate){
        return 0;
    }
}
class StudentMember extends Member implements LibraryService{
    StudentMember(int memberId,String memberName,int borrowedBooks){
        super(memberId,memberName,borrowedBooks);

    }

    public void displayInfo(){
        super.displayInfo();
    }
   public void borrowBook(){
        System.out.println("Student Borrowed a Book");
    }
    public void returnBook(){
        System.out.println("Student Returned a Book");
    }
    public double calculateFine(int daysLate){
        return daysLate*5;
    }
}
class FacultyMember extends Member implements LibraryService{
    FacultyMember(int memberId,String memberName,int borrowedBooks){
        super(memberId,memberName,borrowedBooks);
    }
    public void displayInfo(){
        super.displayInfo();
    }
    public void borrowBook(){
        System.out.println("Faculty Borrowed a Book");
    }
    public void returnBook(){
        System.out.println("Faculty Returned a Book");
    }
    public double calculateFine(int daysLate){
        System.out.print("Fine: ");
        return daysLate*2;
    }
}
public class UniqueLibrary {
    public static void main(String[] args){
        Member[] members=new Member[3];
        members[0]=new StudentMember(1,"Alex",1);
        members[1]=new FacultyMember(2,"Dr. Smith",2);
        members[2]=new StudentMember(3,"Jamie",0);

        for(Member member : members){
            member.displayInfo();
            member.borrowBook();
            member.returnBook();
            System.out.println("Fine:" + member.calculateFine(5));

            System.out.println();
        }
    }
}
