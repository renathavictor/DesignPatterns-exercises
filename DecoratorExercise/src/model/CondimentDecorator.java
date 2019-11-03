package model;

public class CondimentDecorator extends Pizza {

	Pizza pizza;
	
	public CondimentDecorator(Pizza cond) {
		pizza = cond;
	}
		
	public double getPrice() {
		return pizza.getPrice() + price;
	}
}
