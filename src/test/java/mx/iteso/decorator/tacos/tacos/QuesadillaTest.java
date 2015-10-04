package mx.iteso.decorator.tacos.tacos;

import static org.junit.Assert.assertEquals;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Quesadilla;
import org.junit.Test;

public class QuesadillaTest {
    @Test
    public void testCostMini() {
        Taco quesadilla = new Quesadilla("Mini");
        assertEquals(9.0, quesadilla.cost(),0);
    }
    @Test
    public void testCostRegular() {
        Taco quesadilla = new Quesadilla("Regular");
        assertEquals(10.0, quesadilla.cost(),0);
    }
    @Test
    public void testCostMega() {
        Taco quesadilla = new Quesadilla("Mega");
        assertEquals(11.0, quesadilla.cost(),0);
    }
}
