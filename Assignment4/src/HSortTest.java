import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HSortTest {
    @Test
    public void testWithRepeats() {
        int a[] = {1,4,2,7,4,9};
        int aExpected[] = {1,2,4,4,7,9};
        HSort.Sort(a);
        assertArrayEquals(aExpected, a);
    }

    @Test
    public void testWithOrderedArray() {
        int a[] = {7,8,9};
        int aExpected[] = {7,8,9};
        HSort.Sort(a);
        assertArrayEquals(aExpected, a);
    }

    @Test
    public void testWithEmptyArray() {
        int a[] = { };
        int aExpected[] = { };
        HSort.Sort(a);
        assertArrayEquals(aExpected, a);
    }

    @Test
    public void testSort() {

    }

    @Test
    public void testBheap() {

    }

    @Test
    public void testHeapify() {

    }

    @Test
    public void testMain() {

    }

    @Test
    public void testPrintarray() {

    }
}
