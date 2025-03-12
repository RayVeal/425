import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MSortTest {
    @Test
    public void testWithRepeats() {
        int a[] = {1,4,2,7,4,9};
        int aExpected[] = {1,2,4,4,7,9};
        MSort.Sort(a, 0, a.length - 1);
        //MSort.printarray(a);
        assertArrayEquals(aExpected, a);
    }

    @Test
    public void testWithOrderedArray() {
        int a[] = {7,8,9};
        int aExpected[] = {7,8,9};
        MSort.Sort(a, 0, a.length - 1);
        //MSort.printarray(a);
        assertArrayEquals(aExpected, a);
    }

    @Test
    public void testWithEmptyArray() {
        int a[] = { };
        int aExpected[] = { };
        MSort.Sort(a, 0, a.length - 1);
        //MSort.printarray(a);
        assertArrayEquals(aExpected, a);
    }

    @Test
    public void testSort() {

    }

    @Test
    public void testMain() {

    }

    @Test
    public void testMerge() {

    }

    @Test
    public void testPrintarray() {

    }
}
