import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        double result = calculator.add(1, 2);
        assertEquals(3, result, 0);
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract(5, 3);
        assertEquals(2, result, 0);
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply(2, 3);
        assertEquals(6, result, 0);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(6, 2);
        assertEquals(3, result, 0);
    }
}