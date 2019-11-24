package view;

import model.ChavesDecorator;
import model.ColchetesDecorator;
import model.Numero;
import model.NumeroUm;
import model.ParentesesDecorator;

public class Teste {
	
	public static void main(String[] args) {
		
		Numero numero = new NumeroUm();
		numero = new ParentesesDecorator(numero);
		System.out.println(numero.imprimir());
		
		numero = new NumeroUm();
		numero = new ColchetesDecorator(numero);
		System.out.println(numero.imprimir());
		
		numero = new NumeroUm();
		numero = new ChavesDecorator (numero);
		System.out.println(numero.imprimir());
		
	}

}
