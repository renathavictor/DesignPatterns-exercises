package model;

public class Letras implements ImplementacaoLista {

	private char letra = 'A';
	
	@Override
	public void imprimirItem(String l) {
		System.out.println((letra++) + ") " + l);
	}
	
}
