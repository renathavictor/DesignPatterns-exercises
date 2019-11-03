package model;

public class TomatoDecorator extends CondimentDecorator {

	public TomatoDecorator(Pizza cond) {
		super(cond);
		description = "Tomato";
		price = 2.0;
	}
	
	public String getDescription() {
		return pizza.getDescription() + " + " + description;
	}
	
	public double getPrice() {
		return pizza.getPrice() + price;
	}
}
