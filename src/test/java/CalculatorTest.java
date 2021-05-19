import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    Calculator cal;

    @Override
    protected void setUp() throws Exception {
        cal = new Calculator();
        System.out.println("setUp!");
    }

    public void testAdd() {
        System.out.println("testAdd!");
        int result = cal.add(2,1);
        assertEquals(3, result);
    }

    public void testSub() throws Exception {
        System.out.println("testSub!");
        int result = cal.subtract(2,1);
        assertEquals(1, result);
    }

    public void testMul() throws Exception {
        System.out.println("testMul!");
        int result = cal.multiply(3,2);
        assertEquals(6, result);
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("tearDown");
    }
}