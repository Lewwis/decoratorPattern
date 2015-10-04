package mx.iteso.decorator.condiments.meat;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import mx.iteso.decorator.Taco;

import org.junit.Before;
import org.junit.Test;

public class LenguaTest {
	 private Taco taco;
	    @Before
	    public void setUp(){
	        taco = mock((Taco.class));
	    }
	    @Test
	    public void testCostMini(){
	    	taco.size = "Mini";
	        Taco lengua = new Lengua(taco);
	        when(taco.cost()).thenReturn(8.0);
	        double cost = lengua.cost();
	        assertEquals(9.0, cost,0);
	    }
	    @Test
	    public void testCostRegular(){
	    	taco.size = "Regular";
	        Taco lengua = new Lengua(taco);
	        when(taco.cost()).thenReturn(8.0);
	        double cost = lengua.cost();
	        assertEquals(10.0, cost,0);
	    }
	    @Test
	    public void testCostMega(){
	    	taco.size = "Mega";
	        Taco lengua = new Lengua(taco);
	        when(taco.cost()).thenReturn(8.0);
	        double cost = lengua.cost();
	        assertEquals(11.0, cost,0);
	    }
	    @Test
	    public void testDescription(){
	        Taco lengua = new Lengua(taco);
	        when(taco.getDescription()).thenReturn("Taco Normal");
	        String desc = lengua.getDescription();
	        assertEquals("Taco Normal de lengua", desc);
	    }
}
