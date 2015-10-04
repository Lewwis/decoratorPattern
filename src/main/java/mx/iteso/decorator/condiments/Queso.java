package mx.iteso.decorator.condiments;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Queso extends CondimentsDecorator {
    Taco taco;

    public Queso(Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " con queso";
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
