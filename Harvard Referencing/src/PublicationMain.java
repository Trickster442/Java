import java.util.ArrayList;
import java.util.List;

/**
 * The PublicationMain class demonstrates the use of the Author, 
 * IndividualAuthor, Book, JournalArticle, and WebPage classes.
 * 
 * @author sandip
 * @version java: openjdk version "21.0.2" 2024-01-16 LTS
 */
public class PublicationMain {

    /**
     * The main method demonstrates the creation of various publication objects
     * and prints their Harvard references.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a list of authors for testing
        List<Author> authors = new ArrayList<>();
        authors.add(new IndividualAuthor("Smith", "J."));
        authors.add(new IndividualAuthor("Doe", "A."));

        // Test Book referencing
        Book book = new Book(authors, "Java Programming", 2021, "Publisher XYZ");
        System.out.println("Book Reference:");
        System.out.println(book.harvardReference());

        // Test Journal Article referencing
        JournalArticle article = new JournalArticle(authors, "Introduction to Java", 2020,
                                                    "Journal of Programming", 10, 2, 100, 120);
        System.out.println("\nJournal Article Reference:");
        System.out.println(article.harvardReference());

        // Test Web Page referencing
        WebPage webpage = new WebPage(authors, "Java Programming Guide", 2022, "www.example.com", "2022");
        System.out.println("\nWeb Page Reference:");
        System.out.println(webpage.harvardReference());
    }
}