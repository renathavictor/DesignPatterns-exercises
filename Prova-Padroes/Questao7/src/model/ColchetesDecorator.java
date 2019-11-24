package model;

public class ColchetesDecorator extends NumeroDecorator {

	public ColchetesDecorator(Numero num) {
		super(num);
	}
	
	public String imprimir() {
		return "[" + numero.imprimir() + "]";
	}
}
