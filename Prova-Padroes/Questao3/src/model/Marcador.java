package model;

public class Marcador implements ImplementacaoLista {

	private char marcador = '-';

	public Marcador() {}

	public Marcador(char marcador) {
		this.marcador = marcador;
	}

	public void imprimirItem(String m) {
		System.out.println(marcador + " " + m);
	}
}
