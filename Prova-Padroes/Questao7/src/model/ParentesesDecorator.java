package model;

public class ParentesesDecorator extends NumeroDecorator {

	public ParentesesDecorator(Numero num) {
		super(num);
	}
	
	public String imprimir() {
		return "(" + numero.imprimir() + ")";
	}
}
