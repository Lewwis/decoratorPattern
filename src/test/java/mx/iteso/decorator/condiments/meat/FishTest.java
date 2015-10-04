package mx.iteso.decorator.condiments.meat;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import mx.iteso.decorator.Taco;

import org.junit.Before;
import org.junit.Test;

public class FishTest {
    private Taco taco;
    @Before
    public void setUp(){
        taco = mock((Taco.class));
    }
    @Test(expected = NullPointerException.class)
    public void testCostMini(){
    	taco.size = "Mini";
        Taco fish = new Fish(taco);
        when(taco.cost()).thenReturn(8.0);
        fish.cost();
    }
    @Test
    public void testCostRegular(){
    	taco.size = "Regular";
        Taco fish = new Fish(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = fish.cost();
        assertEquals(10.0, cost,0);
    }
    @Test
    public void testCostMega(){
    	taco.size = "Mega";
        Taco fish = new Fish(taco);
        when(taco.cost()).thenReturn(8.0);
        double cost = fish.cost();
        assertEquals(11.0, cost,0);
    }
    @Test
    public void testDescription(){
        Taco fish = new Fish(taco);
        when(taco.getDescription()).thenReturn("Taco Normal");
        String desc = fish.getDescription();
        assertEquals("Taco Normal de pescado", desc);
    }
}
