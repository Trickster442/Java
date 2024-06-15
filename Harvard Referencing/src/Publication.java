import java.util.Collections;
import java.util.List;

/**
 * This class represents a generic publication.
 * It includes a list of authors, a title, and a year of publication.
 * Subclasses should provide additional details as needed.
 * 
 * @author Sandip
 * @version java: openjdk version "21.0.2" 2024-01-16 LTS
 * 
 */
public class Publication {
    private final List<Author> authors;
    private final String title;
    private final int year;
    
    /**
     * Creates a Publication object with the specified authors, title, and year.
     * 
     * @param authors the list of authors
     * @param title the title of the publication
     * @param year the year of publication
     * @throws IllegalArgumentException if the authors list is empty
     */
    public Publication(List<Author> authors, String title, int year) {
        if (authors.isEmpty()) {
            throw new IllegalArgumentException("Empty authors list");
        }
        this.authors = authors;
        this.title = title;
        this.year = year;
    }
    
    /**
     * Returns an unmodifiable list of authors.
     * 
     * @return the list of authors
     */
    public List<Author> getAuthors() {
        return Collections.unmodifiableList(authors);
    }
    
    /**
     * Returns the title of the publication.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Returns the year of publication.
     * 
     * @return the year
     */
    public int getYear() {
        return year;
    }
    
    /**
     * Returns the Harvard reference string for the publication.
     * 
     * @return the Harvard reference
     */
    public String harvardReference() {
        return authorNames() + " (" + year + ") " + title + ".";
    }
    
    /**
     * Constructs and returns a string of author names in the format "Author1, Author2, and Author3".
     * 
     * @return the author names string
     */
    public String authorNames() {
        String nameString = "";
        int secondLast = authors.size() - 2;
        for (int i = 0; i < authors.size(); i++) {
            nameString += authors.get(i).fullName();
            if (i < secondLast) {
                nameString += ", ";
            } else if (i == secondLast) {
                nameString += " and ";
            }
        }
        return nameString;
    }
}
