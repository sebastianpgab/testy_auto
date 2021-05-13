import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {

    @Test
    public void testMax() {
        Klasa myClass = new Klasa();
        int x = 20;
        int y = 10;

        int expected = myClass.max(x, y);
        assertEquals(20, expected);
    }

    @Test
    public void testMin() {
        Klasa myClass = new Klasa();
        int x = 20;
        int y = 10;

        int expected = myClass.min(x, y);
        assertEquals(10, expected);
    }

    @Test
    public void testShouldReturnTrueWhenPositiveNumber() {
        Klasa myClass = new Klasa();
        int x = 20;

        boolean expected = myClass.isPositive(x);
        assertTrue(expected);
    }

    @Test
    public void testShouldReturnFalseWhenNegativeNumber() {
        Klasa myClass = new Klasa();
        int x = -20;

        boolean expected = myClass.isPositive(x);
        assertFalse(expected);
    }
}
