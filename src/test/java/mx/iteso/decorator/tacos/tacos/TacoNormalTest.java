package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.TacoNormal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TacoNormalTest {
    @Test
    public void testCostMini() {
        Taco taco = new TacoNormal("Mini");
        assertEquals(7.0, taco.cost(),0);
    }
    @Test
    public void testCostRegular() {
        Taco taco = new TacoNormal("Regular");
        assertEquals(8.0, taco.cost(),0);
    }
    @Test
    public void testCostMega() {
        Taco taco = new TacoNormal("Mega");
        assertEquals(9.0, taco.cost(),0);
    }
    
}
