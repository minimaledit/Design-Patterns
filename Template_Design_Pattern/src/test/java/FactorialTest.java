import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void testPositiveInput() {
        Factorial factorial = new FactorialImpl();
        long result = factorial.calculate(5);
        Assert.assertEquals(120, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        Factorial factorial = new FactorialImpl();
        factorial.calculate(-5);
    }

    @Test
    public void testZeroInput() {
        Factorial factorial = new FactorialImpl();
        long result = factorial.calculate(0);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testHugeInput() {
        Factorial factorial = new FactorialImpl();
        long result = factorial.calculate(20);
        long expected = 2432902008176640000;
        Assert.assertEquals(expected, result);
    }
}
