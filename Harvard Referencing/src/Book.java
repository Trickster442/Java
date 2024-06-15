import java.util.List;

/**
 * This class represents a book, which is a type of publication.
 * It includes information about the book's publisher.
 * This class extends the Publication class.
 * @author sandip
 * @version java: openjdk version "21.0.2" 2024-01-16 LTS
 * 
 * @see Publication
 */
public class Book extends Publication {
    private final String publisher;
    
    /**
     * Creates a Book object with the specified authors, title, year, and publisher.
     * 
     * @param authors the list of authors
     * @param title the title of the book
     * @param year the year the book was published
     * @param publisher the publisher of the book
     */
    public Book(List<Author> authors, String title, int year, String publisher) {
        super(authors, title, year);
        this.publisher = publisher;
    }
    
    /**
     * Returns the publisher of the book.
     * 
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    } 
        
    /**
     * Returns the Harvard reference string for the book.
     * 
     * @return the Harvard reference
     */
    @Override
    public String harvardReference() {
        return super.harvardReference() + " " + publisher + '.';
    }
}