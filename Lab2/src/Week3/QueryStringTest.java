package Week3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class QueryStringTest {
    @Test
    void testGetParameter() {
        QueryString qs = new QueryString("name=Alice&age=19&country=UK");
        assertEquals("Alice", qs.getParameter("name"));
        assertEquals("19", qs.getParameter("age"));
        // Add more test cases for getParameter method
    }
    @Test
    void testHasParameter() {
        QueryString qs = new QueryString("name=Alice&age=19&country=UK");
        assertTrue(qs.hasParameter("age"));
        assertFalse(qs.hasParameter("city")); // Assuming city parameter does not exist
        // Add more test cases for hasParameter method
    }
    @Test
    void testGetParameterOffset() {
        QueryString qs = new QueryString("name=Alice&age=19&country=UK");
        assertEquals(0, qs.getParameterOffset("name"));
        // Add more test cases for getParameterOffset method
    }
    @Test
    void testDecode() {
        assertEquals("Hello, world!", QueryString.decode("Hello%2C+world%21"));
        // Add more test cases for decode method
    }
}
