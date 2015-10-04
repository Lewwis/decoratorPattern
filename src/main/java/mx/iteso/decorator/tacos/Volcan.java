package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Volcan extends Taco {
	public Volcan(){
		description = "Volcan";
	}

	@Override
	public double cost() {
		return 10.00;
	}

}
