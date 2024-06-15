/**
 * This class represents an individual author.
 * It implements the Author interface.
 * 
 * @author sandip
 * @version java: openjdk version "21.0.2" 2024-01-16 LTS
 * 
 * 
 * @see Author
 */
public class IndividualAuthor implements Author {
    private final String lastName;
    private final String initials;
    
    /**
     * Creates an IndividualAuthor with the specified last name and initials.
     * 
     * @param lastName the last name of the author
     * @param initials the initials of the author
     */
    public IndividualAuthor(String lastName, String initials) {
        this.lastName = lastName;
        this.initials = initials;
    }
    
    /**
     * Returns the full name of the author in the format "last name, initials".
     * 
     * @return the full name
     */
    @Override
    public String fullName() {
        return lastName + ", " + initials;
    }
    
    /**
     * Returns the citation name of the author, which is the last name.
     * 
     * @return the citation name
     */
    @Override
    public String citeName() {
        return lastName;
    }
}
