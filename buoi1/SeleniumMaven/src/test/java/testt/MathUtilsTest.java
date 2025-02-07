package testt;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import KiemThu.com.service.MathUtils;
public class MathUtilsTest {
@Test
void testMultiplyPositiveNumbers() {
    assertEquals(6, MathUtils.multiply(2, 3));
}

    @Test
    void testMultiplyNegativeNumbers() {
        assertEquals(6, MathUtils.multiply(-2, -3));
    }

    @Test
    void testMultiplyPositiveAndNegative() {
        assertEquals(-6, MathUtils.multiply(-2, 3));
    }

    @Test
    void testMultiplyWithZero() {
        assertEquals(0, MathUtils.multiply(0, 5));
    }

    @Test
    void testMultiplyLargeNumbers() {
        assertEquals(1000000, MathUtils.multiply(1000, 1000));
    }

    @Test
    void testIsIntegerWithInteger() {
        assertTrue(MathUtils.isInteger(5));
    }

    @Test
    void testIsIntegerWithNegativeInteger() {
        assertTrue(MathUtils.isInteger(-10));
    }

    @Test
    void testIsIntegerWithFloatingPoint() {
        assertFalse(MathUtils.isInteger(5.5));
    }

    @Test
    void testIsIntegerWithString() {
        assertFalse(MathUtils.isInteger("text"));
    }

    @Test
    void testIsIntegerWithNull() {
        assertFalse(MathUtils.isInteger(null));
    }
}
