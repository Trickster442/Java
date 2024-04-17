package Week5;
import java.util.Map;


public class MapPrinter {
	public static void printKeys(Map<String, String>map) {
		for (String key : map.keySet()) {
			System.out.println(key);
		}
	}
	
	public static void printValues(Map<String, String> map) {
		for (String value : map.values()) {
			System.out.println(value);
		}
	}
	
	
//	public static void printPairs(Map<String, String> map) {
//        for (Entry<String, String> entry : map.entrySet()) {
//            System.out.println("Name: " + entry.getKey() + ", Phone no: " + entry.getValue());
//        }
//    }
	
	
	public static void printPairs(Map<String, String> map) {
		for  (String keyss : map.keySet()) {
			String key_value = map.get(keyss);
			System.out.println("Key: " + keyss + " Values:" + key_value);
			
		}
	}
}