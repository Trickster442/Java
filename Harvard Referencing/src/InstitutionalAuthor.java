/**
 * This class represents an institutional author.
 * It implements the Author interface.
 * 
 * @author sandip
 * @version java: openjdk version "21.0.2" 2024-01-16 LTS
 * 
 * @see Author
 */
public class InstitutionalAuthor implements Author {
    private final String name;
    
    /**
     * Creates an InstitutionalAuthor with the specified name.
     * 
     * @param name the name of the institution
     */
    public InstitutionalAuthor(String name) {
        this.name = name;
    }
    
    /**
     * Returns the full name of the institutional author.
     * 
     * @return the full name
     */
    @Override
    public String fullName() {
        return name;
    }
    
    /**
     * Returns the citation name of the institutional author.
     * 
     * @return the citation name
     */
    @Override 
    public String citeName() {
        return name;
    }
}