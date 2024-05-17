package Week3;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
public class QueryString{
    private String data;

    public QueryString(String data) {
        this.data = data;
    }
    public String getParameter(String name) {
        String[] params = data.split("&");
        for (String param : params) {
            String[] keyValue = param.split("=");
            if (keyValue.length == 2 && keyValue[0].equals(name)) {
                return decode(keyValue[1]);
            }
        }
        return null;
    }
    public boolean hasParameter(String name) {
        String[] params = data.split("&");
        for (String param : params) {
            String[] keyValue = param.split("=");
            if (keyValue.length == 2 && keyValue[0].equals(name)) {
                return true;
            }
        }
        return false;
    }
    public int getParameterOffset(String name) {
        int index = data.indexOf(name + "=");
        return index == -1 ? -1 : index;
    }
    public static String decode(String s) {
        try {
            return URLDecoder.decode(s, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e) {
            // Handle decoding exception
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        // Example usage
        String queryString = "name=Alice%19&age=19&country=UK";
        QueryString qs = new QueryString(queryString);
        System.out.println("Name: " + qs.getParameter("name")); // Output: Alice
        System.out.println("Age: " + qs.getParameter("age")); // Output: 19
        System.out.println("Has Age parameter: " + qs.hasParameter("age")); // Output: true
        System.out.println("Offset of name parameter: " + qs.getParameterOffset("name")); // Output: 0
        
        String encodedString = "Hello%2C+world%21";
        // Print the decoded string
        System.out.println("\nEncoded string:" + encodedString);
        
        String decodedString = QueryString.decode(encodedString);
        // Print the decoded string
        System.out.println("Decoded string: " + decodedString);
    }
}
