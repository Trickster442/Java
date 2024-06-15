import java.util.List;

/**
 * This class represents a journal article, which is a type of publication.
 * It includes information about the journal name, volume, issue, and page range.
 * This class extends the Publication class.
 * 
 * @author sandip
 * @version java: openjdk version "21.0.2" 2024-01-16 LTS
 * @see Publication
 */
public class JournalArticle extends Publication {
    private final String journalName;
    private final int volume;
    private final int issue;
    private final int pageFrom;
    private final int pageTo;
    
    /**
     * Creates a JournalArticle object with the specified authors, title, year, journal name,
     * volume, issue, and page range.
     * 
     * @param authors the list of authors
     * @param title the title of the article
     * @param year the year the article was published
     * @param journalName the name of the journal
     * @param volume the volume number
     * @param issue the issue number
     * @param pageFrom the starting page number
     * @param pageTo the ending page number
     */
    public JournalArticle(List<Author> authors, String title, int year, String journalName,
            int volume, int issue, int pageFrom, int pageTo) {
			super(authors, title, year);
			this.journalName = journalName;
			this.volume = volume;
			this.issue = issue;
			this.pageFrom = pageFrom;
			this.pageTo = pageTo;
			}
			
			/**
			* Returns the name of the journal in which the article was published.
			* 
			* @return the journal name
			*/
			public String getJournalName() {
			return journalName;
			}
			
			/**
			* Returns the volume number of the journal in which the article was published.
			* 
			* @return the volume number
			*/
			public int getVolume() {
			return volume;
			}
			
			/**
			* Returns the issue number of the journal in which the article was published.
			* 
			* @return the issue number
			*/
			public int getIssue() {
			return issue;
			}
			
			/**
			* Returns the starting page number of the article.
			* 
			* @return the starting page number
			*/
			public int getPageFrom() {
			return pageFrom;
			}
			
			/**
			* Returns the ending page number of the article.
			* 
			* @return the ending page number
			*/
			public int getPageTo() {
			return pageTo;
			}
			
			/**
			* Returns the Harvard reference string for the journal article.
			* 
			* @return the Harvard reference
			*/
			@Override
			public String harvardReference() {
			return super.harvardReference() + " " + journalName + ", " + volume + "(" + issue + "), pp. " + pageFrom + "-" + pageTo + '.';
			}
			}
