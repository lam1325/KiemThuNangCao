package testt;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import KiemThu.com.service.Phantubenhat;
public class TestPhantubenhat {
    @Test
    void testFindMinWithNormalArray() {
        int[] arr = {3, 1, 4, 1, 5, -2, 0};
        assertEquals(-2, Phantubenhat.findMinElement(arr));
    }

    @Test
    void testFindMinWithSingleElement() {
        int[] arr = {10};
        assertEquals(10, Phantubenhat.findMinElement(arr));
    }

    @Test
    void testFindMinWithNegativeNumbers() {
        int[] arr = {-10, -5, -100, -1};
        assertEquals(-100, Phantubenhat.findMinElement(arr));
    }

    @Test
    void testFindMinWithSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(1, Phantubenhat.findMinElement(arr));
    }

    @Test
    void testFindMinWithEmptyArray() {
        int[] arr = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Phantubenhat.findMinElement(arr));
        assertEquals("Mảng không được rỗng", exception.getMessage());
    }
}
