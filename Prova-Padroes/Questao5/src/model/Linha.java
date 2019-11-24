package model;

import java.util.ArrayList;
import java.util.List;

public class Linha implements Tabela {

	private List<Tabela> celulas = new ArrayList<>();
	
	public void imprimir() {
//		int tamanho = (celulas.size() * 17) + 5;
//		char[] linha = new char[tamanho];
		for (Tabela t : celulas) {
			t.imprimir();
		}
		System.out.println(" |");
//		for (int i = 0; i < tamanho; i++) {
//			linha[i] = '-';
//		}
//		System.out.println(" " + new String(linha));
	}
	
	public void adicionar(Tabela c) {
		celulas.add(c);
	}

	public void adicionar(Linha l) {
		// TODO Auto-generated method stub
		
	}
}
