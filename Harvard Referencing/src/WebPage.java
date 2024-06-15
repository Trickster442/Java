import java.util.List;

/**
 * The WebPage class extends the Publication class
 * 
 * @author sandip
 * @version java: openjdk version "21.0.2" 2024-01-16 LTS
 */

public class WebPage extends Publication {
    private final String url;
    private final String dateAccessed;

    /**
     * Creates a WebPage object with the specified authors, title, year, URL, and date accessed.
     *
     * @param authors the list of authors
     * @param title the title of the web page
     * @param year the year the web page was published
     * @param url the URL of the web page
     * @param dateAccessed the date the web page was accessed
     */
    public WebPage(List<Author> authors, String title, int year, String url, String dateAccessed) {
        super(authors, title, year); // Call superclass constructor
        this.url = url;
        this.dateAccessed = dateAccessed;
    }

    /**
     * Returns the URL of the web page.
     *
     * @return the URL
     */
    public String getURL() {
        return url;
    }

    /**
     * Returns the date the web page was accessed.
     *
     * @return the date accessed
     */
    public String getDateAccessed() {
        return dateAccessed;
    }

    /**
     * Returns the Harvard reference string for the web page.
     *
     * @return the Harvard reference
     */
    @Override
    public String harvardReference() {
        String reference = super.harvardReference(); // Call superclass's harvardReference() method

        // Construct the reference for a web page
        reference += " Available at: " + getURL() + " [Accessed " + getDateAccessed() + "].";

        return reference;
    }
}