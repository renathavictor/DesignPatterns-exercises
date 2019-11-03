package model;

public class BaconDecorator extends CondimentDecorator {

	public BaconDecorator(Pizza cond) {
		super(cond);
		description = "Bacon";
		price = 4.0;
	}
	
	public String getDescription() {
		return pizza.getDescription() + " + " + description;
	}
	
	public double getPrice() {
		return pizza.getPrice() + price;
	}
}
