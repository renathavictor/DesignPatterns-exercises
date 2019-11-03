package model;

public class CreamCheeseDecorator extends CondimentDecorator {

	public CreamCheeseDecorator(Pizza cond) {
		super(cond);
		description = "Cream Cheese";
		price = 5.0;
	}
	
	public String getDescription() {
		return pizza.getDescription() + " + " + description;
	}
	
	public double getPrice() {
		return pizza.getPrice() + price;
	}
}
