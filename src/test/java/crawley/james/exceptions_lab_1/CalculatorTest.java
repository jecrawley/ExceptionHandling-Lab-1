package crawley.james.exceptions_lab_1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by jamescrawley on 9/30/16.
 */
public class CalculatorTest {

    @Test
    public void addTest () {

        assertEquals("The result should be 32.", 32, Calculator.add(20, 12), 0);

    }

    @Test
    public void subtractTest () {

        assertEquals("The result should be -10.", -10, Calculator.subtract(10, 20), 0);

    }

    @Test
    public void multiplyTest () {

        assertEquals("The result should be 20.", 20, Calculator.multiply(10, 2), 0);

    }

    @Test
    public void divideTest () {

        assertEquals("The result should be 5.", 5, Calculator.divide(10, 2), 0);

    }

    @Test (expected = DivideByZeroException.class)
    public void divideByZeroTest () {

        Calculator.divide(5, 0);

    }
}
