package model;

public class Numeros implements ImplementacaoLista {

	private int numero = 1;
	
	public void imprimirItem(String num) {
		System.out.println((numero++) + ") " + num);		
	}
	
}
