import org.junit.Assert;
import org.junit.Test;

public class FactorialSequenceTest {
    @Test
    public void testPositiveInput() {
        Factorial factorial = new FactorialImpl();
        FactorialSequence sequence = new FactorialSequence(factorial);
        long[] result = sequence.calculate(5);
        long[] expected = {1, 1, 2, 6, 24};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeInput() {
        Factorial factorial = new FactorialImpl();
        FactorialSequence sequence = new FactorialSequence(factorial);
        sequence.calculate(-5);
    }

    @Test
    public void testZeroInput() {
        Factorial factorial = new FactorialImpl();
        FactorialSequence sequence = new FactorialSequence(factorial);
        long[] result = sequence.calculate(0);
        long[] expected = {};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testHugeInput() {
        Factorial factorial = new FactorialImpl();
        FactorialSequence sequence = new FactorialSequence(factorial);
        long[] result = sequence.calculate(10);
        long[] expected = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        Assert.assertArrayEquals(expected, result);
    }
}
