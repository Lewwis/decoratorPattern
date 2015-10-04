package mx.iteso.decorator.condiments.meat;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import mx.iteso.decorator.Taco;

import org.junit.Before;
import org.junit.Test;

public class ChorizoTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }
    @Test
    public void testCostMini(){
    	taco.size = "Mini";
        Taco chorizo = new Chorizo(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = chorizo.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testCostRegular(){
    	taco.size = "Regular";
        Taco chorizo = new Chorizo(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = chorizo.cost();
        assertEquals(8.0, cost,0);
    }
    @Test
    public void testCostMega(){
    	taco.size = "Mega";
        Taco chorizo = new Chorizo(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = chorizo.cost();
        assertEquals(9.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco chorizo = new Chorizo(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = chorizo.getDescription();
        assertEquals("Taco Normal de chorizo", desc);
    }
}
