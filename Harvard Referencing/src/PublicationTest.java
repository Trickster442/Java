import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * The PublicationTest class contains unit tests for the Book, JournalArticle,
 * and WebPage classes to ensure their Harvard reference formatting is correct.
 * 
 * @author sandip
 * @version java: openjdk version "21.0.2" 2024-01-16 LTS
 *  */
public class PublicationTest {
    private static final String BOOK_REFERENCE
        = "Knuth, D. (1968) The Art of Computer Programming: Fundamental algorithms. Addison-Wesley.";

    private static final String ARTICLE_REFERENCE
        = "Hristova, M., Misra, A., Rutter, M. and Mercuri, R. (2003) Identifying and correcting Java programming errors for introductory computer science students. ACM SIGCSE Bulletin, 35(1), pp. 153-156.";

    private static final String WEB_REFERENCE
        = "Oracle (2016) The Java Tutorials. Available at: https://docs.oracle.com/javase/tutorial/ [Accessed 30 November 2018].";

    /**
     * Tests the Harvard reference generation for a Book object.
     */
    @Test
    public void testBook() {
        List<Author> authors = Arrays.asList(
            new IndividualAuthor("Knuth", "D.")
        );

        Publication book = new Book(
            authors,
            "The Art of Computer Programming: Fundamental algorithms",
            1968,
            "Addison-Wesley"
        );

        assertEquals(BOOK_REFERENCE, book.harvardReference());
    }

    /**
     * Tests the Harvard reference generation for a JournalArticle object.
     */
    @Test
    public void testJournal() {
        List<Author> authors = Arrays.asList(
            new IndividualAuthor("Hristova", "M."),
            new IndividualAuthor("Misra", "A."),
            new IndividualAuthor("Rutter", "M."),
            new IndividualAuthor("Mercuri", "R.")
        );

        Publication journal = new JournalArticle(
            authors,
            "Identifying and correcting Java programming errors for introductory computer science students",
            2003, 
            "ACM SIGCSE Bulletin",
            35, 1,
            153, 156
        );

        assertEquals(ARTICLE_REFERENCE, journal.harvardReference());
    }

    /**
     * Tests the Harvard reference generation for a WebPage object.
     */
    @Test
    public void testWebPage() {
        List<Author> authors = Arrays.asList(
            new InstitutionalAuthor("Oracle")
        );

        Publication webPage = new WebPage(
            authors,
            "The Java Tutorials",
            2016,
            "https://docs.oracle.com/javase/tutorial/",
            "30 November 2018"
        );

        assertEquals(WEB_REFERENCE, webPage.harvardReference());
    }
}