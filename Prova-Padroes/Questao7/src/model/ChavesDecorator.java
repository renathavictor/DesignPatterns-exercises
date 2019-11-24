package model;

public class ChavesDecorator extends NumeroDecorator {

	public ChavesDecorator(Numero num) {
		super(num);
	}
	
	public String imprimir() {
		return "{" + numero.imprimir() + "}";
	}
}
