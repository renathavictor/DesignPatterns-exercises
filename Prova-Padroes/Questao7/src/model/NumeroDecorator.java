package model;

public class NumeroDecorator extends Numero {

	Numero numero;

	public NumeroDecorator(Numero num) {
		numero = num;
	}
	
	public String imprimir() {
		return numero.imprimir();
	}
}
