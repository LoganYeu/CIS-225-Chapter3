// class that prints out the elements of the values in the Book class
public class Book_Parser {
    // prints out the variable book which has the .get method attatched to it. Ultimately the value for each element is printed.
    public static void printLastName(Book book){
        System.out.print(book.getLastName());
    }
    public static void printFirstName(Book book){
        System.out.print(book.getFirstName());
    }
    public static void printISBN(Book book){
        System.out.print(book.getIsbn());
    }
    public static void printTitle(Book book){
        System.out.print(book.getTitle());
    }
    public static void printPublicationDate(Book book){
        System.out.print(book.getPublicationDate());
    }
    public static void printPageNumber(Book book){
        System.out.print(book.getPageNumber());
    }


}
