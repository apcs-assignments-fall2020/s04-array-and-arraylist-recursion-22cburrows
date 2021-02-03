import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class MyTests {

    @Test
    public void testIsSorted() {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 4}));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 1, 2, 2}));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(new Integer[] {-5, -3, -1, 2}));
        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 1, 4}));
        ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3, 2}));
        assertEquals(true, MyMain.isSorted(list1), "Whether or not the ArrayList [1, 2, 3, 4] is sorted should be: true");
        assertEquals(true, MyMain.isSorted(list2), "Whether or not the ArrayList [1, 1, 2, 2] is sorted should be: true");
        assertEquals(true, MyMain.isSorted(list3), "Whether or not the ArrayList [-5, -3, -1, 2] is sorted should be: true");
        assertEquals(false, MyMain.isSorted(list4), "Whether or not the ArrayList [1, 2, 1, 4] is sorted should be: false");
        assertEquals(false, MyMain.isSorted(list5), "Whether or not the ArrayList [1, 2, 3, 2] is sorted should be: false");
    }

   @Test
    public void testHasCountCopies() {
        assertEquals(false, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 2, 1), "Whether or not the array [1, 2, 5, 2, 1, 3, 2] contains exactly 1 copy of 2 should be: false");
        assertEquals(true, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 2, 3), "Whether or not the array [1, 2, 5, 2, 1, 3, 2] contains exactly 3 copies of 2 should be: true");
        assertEquals(false, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 2, 4), "Whether or not the array [1, 2, 5, 2, 1, 4, 2] contains exactly 4 copies of 2 should be: false");
        assertEquals(false, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 1, 1), "Whether or not the array [1, 2, 5, 2, 1, 3, 2] contains exactly 1 copy of 1 should be: false");
        assertEquals(true, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 1, 2), "Whether or not the array [1, 2, 5, 2, 1, 3, 2] contains exactly 2 copies of 1 should be: true");
        assertEquals(false, MyMain.hasCountCopies(new int[] {1, 2, 5, 2, 1, 3, 2}, 1, 4), "Whether or not the array [1, 2, 5, 2, 1, 4, 2] contains exactly 4 copies of 1 should be: false");
    }

    @Test
    public void testBinarySearch() {
        assertEquals(true, MyMain.binarySearch(new int[] {1, 2, 4, 5, 7, 8, 10}, 2), "Whether or not the array [1, 2, 4, 5, 7, 8, 10] contains 2 should be: true");
        assertEquals(true, MyMain.binarySearch(new int[] {-5, 2, 7, 13, 25, 38, 42, 58, 70, 72, 100, 104, 128}, 104), "Whether or not the array [-5, 2, 7, 13, 25, 38, 42, 58, 70, 72, 100, 104, 128] contains 104 should be: true");
        assertEquals(false, MyMain.binarySearch(new int[] {-5, 2, 7, 13, 25, 38, 42, 58, 70, 72, 100, 104, 128}, 99), "Whether or not the array [-5, 2, 7, 13, 25, 38, 42, 58, 70, 72, 100, 104, 128] contains 99 should be: false");
    }
}
