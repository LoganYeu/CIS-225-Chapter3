// stores information about a Book
public class Book {
    private String lastName;
    private String firstName;
    private int isbn;
    private String title;
    private String publicationDate;
    private int pageNumber;

    // constructor for the Book class that prints a error message if pageNumber is < 10
    public Book (String lastName, String firstName, int isbn, String title, String publicationDate, int pageNumber){
        if (pageNumber < 10){
            System.out.print("Error, make sure the page number is greater than 10");
        }
        // assigns the parameters to the value of the fields indicated above
        this.lastName = lastName;
        this.firstName = firstName;
        this.isbn = isbn;
        this.title = title;
        this.publicationDate = publicationDate;
        this.pageNumber = pageNumber;



    }
// gets the value of the private fields and returns them in public format
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public int getIsbn() {return isbn;}
    public String getTitle(){return title;}
    public  String getPublicationDate(){return publicationDate;}
    public int getPageNumber(){return pageNumber;}




}
