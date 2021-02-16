// stores information about a Book
public class Book {
    private String lastName;
    private String firstName;
    private int isbn;
    private String title;
    private String publicationDate;
    private int pageNumber;
    
    public Book() {
        lastName = "";
        firstName = "";
        isbn = 0;
        title = "";
        publicationDate = "";
        pageNumber = 0;
    }
        
        
// gets the value of the private fields and returns them in public format
    public String getLastName(){return lastName;}
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getFirstName(){return firstName;}
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public int getIsbn() {return isbn;}
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    public String getTitle(){return title;}
    public void setTitle(String title) {
        this.title = title;
    }
    
    public  String getPublicationDate(){return publicationDate;}
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
    
    public int getPageNumber(){return pageNumber;}
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

}
