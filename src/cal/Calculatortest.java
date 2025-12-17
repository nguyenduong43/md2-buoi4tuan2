package cal;
import java.util.*;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

public class Calculatortest {
@Test
    public void testAdd() {
        int x = 1;
        int y = 1;
        Calculator instance = new Calculator();
        int expResult = 2;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }
    @Test
    public void testAdd2() {
        int x = Integer.MAX_VALUE;
        int y = 1;
        Calculator instance = new Calculator();

        try {
            int result = instance.add(x, y);

            assertEquals(3, result);
        } catch (Exception e) {

            assertTrue(true);
        }
    }
    @Test
    public void whenAssertingConditions_thenVerified() {
        assertTrue( 10 > 5,"10 lớn hơn 5");
    }
    @Test
    public void whenAssertingArraysEquality_thenEqual() {
        char[] expected = { 'C', 'o', 'd', 'e', 'G', 'y', 'm' };
        char[] actual = "CodeGym".toCharArray();

        assertArrayEquals( expected, actual,"Mảng phải giống nhau");
    }
    @Test
    public void whenAssertingSameObject_thenVerified() {
        String actual = new String("CodeGym");
        String expected = "CodeGym";
        String expected2 = "CodeGym";

        assertSame("phai cung truong du lieu",expected, actual);
    }
    @Test
    public void givenTwoLists_whenAssertingIterables_thenEquals() {
        Iterable<String> al = new ArrayList<>(asList("CodeGym", "Coding", "Bootcamp", "Java"));
        Iterable<String> ll = new LinkedList<>(asList("CodeGym", "Coding", "Bootcamp", "Java"));
        assertIterableEquals(al, ll);
    }
}