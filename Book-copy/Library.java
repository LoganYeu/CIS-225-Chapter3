/**
 *
 *The Library class gives methods to parse a individual book and print its elements.
 *
 * @author (Logan Yeubanks)
 * @version (Version 1)
 */
// class that prints out the elements of the values in the Book class
public class Library {
    private Book currentBook;
    
    public void addBook(String lastName, String firstName, int isbn, String title, String publicationDate, int pageNumber) {
        currentBook = new Book();
        currentBook.setLastName(lastName);
        currentBook.setFirstName(firstName);
        currentBook.setIsbn(isbn);
        currentBook.setTitle(title);
        currentBook.setPublicationDate(publicationDate);
        currentBook.setPageNumber(pageNumber);
    }
    // prints out the variable book which has the .get method attatched to it. Ultimately the value for each element is printed.
    public void printLastName(){
        System.out.println(currentBook.getLastName());
    }
    public void printFirstName(){
        System.out.println(currentBook.getFirstName());
    }
    public void printISBN(){
        System.out.println(currentBook.getIsbn());
    }
    public void printTitle(){
        System.out.println(currentBook.getTitle());
    }
    public void printPublicationDate(){
        System.out.println(currentBook.getPublicationDate());
    }
    public void printPageNumber(){
        System.out.println(currentBook.getPageNumber());
    }


}
