package testt;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import KiemThu.com.service.TrungBinhCong;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class TestTBC {
    @Test
    void testAverageWithPositiveNumbers() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
        assertEquals(5.0, TrungBinhCong.calculateAverage(numbers));
    }

    @Test
    void testAverageWithNegativeNumbers() {
        List<Integer> numbers = Arrays.asList(-3, -6, -9);
        assertEquals(-6.0, TrungBinhCong.calculateAverage(numbers));
    }

    @Test
    void testAverageWithMixedNumbers() {
        List<Integer> numbers = Arrays.asList(-2, 4, -6, 8);
        assertEquals(1.0, TrungBinhCong.calculateAverage(numbers));
    }

    @Test
    void testAverageWithSingleElement() {
        List<Integer> numbers = Collections.singletonList(10);
        assertEquals(10.0, TrungBinhCong.calculateAverage(numbers));
    }

    @Test
    void testAverageWithZeroes() {
        List<Integer> numbers = Arrays.asList(0, 0, 0, 0);
        assertEquals(0.0, TrungBinhCong.calculateAverage(numbers));
    }

    @Test
    void testAverageWithEmptyList() {
        List<Integer> numbers = Collections.emptyList();
        Exception exception = assertThrows(ArithmeticException.class, () -> TrungBinhCong.calculateAverage(numbers));
        assertEquals("Không thể tinh trung binh cộng của danh sách trống", exception.getMessage());
    }
}
