package view;

import model.BaconDecorator;
import model.Mozzarella;
import model.OreganoDecorator;
import model.Pizza;
import model.TomatoDecorator;

public class Pizzaiolo {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Mozzarella();
		pizza1 = new TomatoDecorator(pizza1);
		pizza1 = new BaconDecorator(pizza1);
		pizza1 = new OreganoDecorator(pizza1);
		
		System.out.println(pizza1.getDescription() + " = R$" + pizza1.getPrice());
		
	}
}
