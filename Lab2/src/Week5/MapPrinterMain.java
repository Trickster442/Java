package Week5;
import java.util.*;
public class MapPrinterMain {
	public static void main(String [] args) {
		Map<String, String> contact = new HashMap<>();
		contact.put("Alice", "555-1234");
		contact.put("Robert", "555-6789");
		
		MapPrinter map1 = new MapPrinter();
		map1.printKeys(contact);
		map1.printValues(contact);
		map1.printPairs(contact);
		
	}
}
