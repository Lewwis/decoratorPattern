package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(String size){
        this.size = size;
        
    	if(size.equals("Mini"))
    		description = "Taco normal mini";
    	else if(size.equals("Regular"))
    		description = "Taco normal regular";
    	else if(size.equals("Mega"))
    		description = "Taco normal mega";
    }

    @Override
    public double cost() {
    	double cost = 8.00;
    	if(size.equals("Mini"))
    		cost -= 1;
    	else if(size.equals("Mega"))
    		cost += 1;
    	
    	return cost;
    }
}
