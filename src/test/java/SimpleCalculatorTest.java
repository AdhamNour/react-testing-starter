import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleCalculatorTest {
    @Test
    public void add(){
        SimpleCalculator simpleCalculator= new SimpleCalculator();
        assertEquals(new Integer(8),simpleCalculator.add(4,4));
    }
}