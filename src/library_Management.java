class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[this.no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added");
    }
    void showAvailableBooks(){
        System.out.println("Available Books are: ");
        for(int i=0; i<this.books.length;i++){
            if(books[i]==null){
                continue;
            }
            System.out.println(books[i]);
            //sout
        }

    }
    void issueBook(String book){
        for(int i=0; i<this.books.length; i++){
            if(book.equals(this.books[i])){
                System.out.println(book + " has been issued");
                this.books[i] = null;
            }
        }
    }
    void returnBook(String book){
        addBook(book);
    }

}
public class library_Management {
    public static void main(String[] args){
        Library book = new Library();
        book.addBook("C++");
        book.addBook("Algorithms");
        book.addBook("DSA");
        book.showAvailableBooks();
        book.issueBook("Algorithms");
        book.showAvailableBooks();
        book.returnBook("Algorithms");
        book.showAvailableBooks();

    }
}
