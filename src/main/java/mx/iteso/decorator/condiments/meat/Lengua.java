package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Lengua  extends CondimentsDecorator {
    Taco taco;

    public Lengua (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de lengua";
    }

    @Override
    public double cost() {
    	double cost = 2;
    	if(taco.size == "Mini")
    		cost -= 1;
    	else if(taco.size == "Mega")
    		cost += 1;
    	
        return cost + taco.cost();
    }
}
