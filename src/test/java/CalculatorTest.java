import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator cal;

    @Before
    public void setup() {
        cal = new Calculator();
        System.out.println("setup!");
    }

    @Test
    public void add() {
        assertEquals(3, cal.add(2,1));
        System.out.println("add!");
    }

    @Test
    public void subtract() {
        assertEquals(1, cal.subtract(2,1));
        System.out.println("subtract!");
    }

    @Test
    public void divide() {
        assertEquals(3, cal.divide(9,3));
        System.out.println("divide!");

    }

    @After
    public void teardown() {
        System.out.println("teardown!");
    }

}