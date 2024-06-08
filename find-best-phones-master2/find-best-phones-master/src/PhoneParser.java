import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneParser {

    /*
     * Parses a phone data string, in the following format:
     * 
     *     model screenSize batteryCapacity
     * 
     * The model name is encoded with underscores instead of spaces.
     */
    public static Phone parse(String data) {
        String[] parts = data.split("\\s+");
        String model = parts[0].replace("_", " ");
        double screenSize = Double.parseDouble(parts[1]);
        int batteryCapacity = Integer.parseInt(parts[2]);
        return new Phone(model, screenSize, batteryCapacity);
    }
     
    /*
     * Returns a PhoneList by parsing a text file containing the phone data.
     */
    public static PhoneList parseFile(String filename) throws IOException{
        PhoneList phoneList = new PhoneList();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                phoneList.addPhone(parse(line));
            }
        }
        return phoneList;
    }
}
