package Week3;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class QueryString{
    private String data;

    public QueryString(String data) {
        this.data = data;
    }

    /*
     * Returns the value associated with a parameter in the query string,
     * or null if the parameter does not exist.
     */
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

    /*
     * Determines whether a parameter exists in the query string.
     */
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

    /*
     * Returns the character offset of the start of a parameter's name.
     * If the parameter does not exist, -1 is returned.
     */
    public int getParameterOffset(String name) {
        int index = data.indexOf(name + "=");
        return index == -1 ? -1 : index;
    }

    /*
     * Decodes a URL-encoded string.
     * See https://en.wikipedia.org/wiki/Percent-encoding
     */
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
