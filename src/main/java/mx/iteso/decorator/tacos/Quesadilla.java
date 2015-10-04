package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(String size){
        this.size = size;
        
    	if(size.equals("Mini"))
    		description = "Quesadilla mini";
    	else if(size.equals("Regular"))
    		description = "Quesadilla regular";
    	else if(size.equals("Mega"))
    		description = "Quesadilla mega";
    }

    @Override
    public double cost() {
    	double cost = 10.00;
    	if(size.equals("Mini"))
    		cost -= 1;
    	else if(size.equals("Mega"))
    		cost += 1;
    	
    	return cost;
    }
}
