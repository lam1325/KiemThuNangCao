package testt;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import KiemThu.com.service.PhepChia;
public class TestPhepChia {
    @Test
    void testDividePositiveNumbers() {
        assertEquals(2, PhepChia.divide(6, 3));
    }

    @Test
    void testDivideNegativeNumbers() {
        assertEquals(2, PhepChia.divide(-6, -3));
    }

    @Test
    void testDividePositiveAndNegative() {
        assertEquals(-2, PhepChia.divide(-6, 3));
    }

    @Test
    void testDivideByOne() {
        assertEquals(5, PhepChia.divide(5, 1));
    }

    @Test
    void testDivideLargeNumbers() {
        assertEquals(1000, PhepChia.divide(1000000, 1000));
    }

    // 5 test case cho trường hợp đặc biệt
    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> PhepChia.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testDivideZeroByNumber() {
        assertEquals(0, PhepChia.divide(0, 5));
    }

    @Test
    void testDivideExactResult() {
        assertEquals(3, PhepChia.divide(9, 3));
    }

    @Test
    void testDivideWithRounding() {
        assertEquals(2, PhepChia.divide(5, 2)); // Vì chia nguyên nên 5 / 2 = 2
    }

    @Test
    void testDivideWithNegativeDenominator() {
        assertEquals(-2, PhepChia.divide(6, -3));
    }
}
