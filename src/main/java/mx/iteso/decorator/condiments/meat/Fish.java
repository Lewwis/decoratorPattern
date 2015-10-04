package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Fish extends CondimentsDecorator{
	Taco taco;
	
	public Fish(Taco taco) {
		if(taco.size == "Mini") 
			return;
		else
			this.taco = taco;
		
		
	}
	
	@Override
	public String getDescription() {
		return taco.getDescription() + " de pescado";
	}

	@Override
	public double cost() {
		double cost = 2;
		if(taco.size == "Mega")
			cost += 1;
		
		return cost + taco.cost();
		
	}

}
