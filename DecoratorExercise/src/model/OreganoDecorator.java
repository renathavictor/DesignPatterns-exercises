package model;

public class OreganoDecorator extends CondimentDecorator {

	public OreganoDecorator(Pizza cond) {
		super(cond);
		description = "Oregano";
		price = 1.0;
	}
	
	public String getDescription() {
		return pizza.getDescription() + " + " + description;
	}
	
	public double getPrice() {
		return pizza.getPrice() + price;
	}
}
