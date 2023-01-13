import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorFacadeTest {
    CalculatorFacade facade = new CalculatorFacade();

    @Test
    public void testAdd() {
        double result = facade.add(1, 2);
        assertEquals(3, result, 0);
    }

    @Test
    public void testSubtract() {
        double result = facade.subtract(5, 3);
        assertEquals(2, result, 0);
    }

    @Test
    public void testMultiply() {
        double result = facade.multiply(2, 3);
        assertEquals(6, result, 0);
    }

    @Test
    public void testDivide() {
        double result = facade.divide(6, 2);
        assertEquals(3, result, 0);
    }
}