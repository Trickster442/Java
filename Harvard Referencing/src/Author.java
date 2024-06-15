/**
 * Author is an interface that represents an author with a full name and a citation name.
 * Classes that implement this interface should provide implementations for these methods.
 * @author sandip
 * @see IndividualAuthor
 * @see InstitutionalAuthor
 */
public interface Author {
    /**
     * Returns the full name of the author.
     * 
     * @return the full name of the author
     */
    public String fullName();
     
    /**
     * Returns the citation name of the author.
     * 
     * @return the citation name of the author
     */
    public String citeName();
}
