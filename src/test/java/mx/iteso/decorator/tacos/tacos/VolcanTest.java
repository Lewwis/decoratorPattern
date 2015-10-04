package mx.iteso.decorator.tacos.tacos;

import static org.junit.Assert.assertEquals;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.tacos.Volcan;

import org.junit.Test;

public class VolcanTest {
    @Test
    public void testCost() {
        Taco volcan = new Volcan();
        assertEquals(10.0, volcan.cost(),0);
    }
}
