import java.io.IOException;
import java.util.Collection;

public class FindBestPhones {
    public static String PHONES_FILE = "phone-data-short.txt";
    
    public static void main(String[] args) throws IOException {
            // Use the parseFile method to get the phone data from the file
            try
            {PhoneList phoneList = PhoneParser.parseFile(PHONES_FILE);
            
            // Find the best phones
            Collection<Phone> bestPhones = phoneList.getBestPhones();
            
            // Print the model names of all the best phones
            for (Phone phone : bestPhones) {
                System.out.println(phone.getModel());
            }
            }
            catch (IOException e) {
            	throw new IOException("Error accessing the file: "+ e.getMessage());
            }
        }
}
