package model;

import java.util.ArrayList;
import java.util.List;

public class ListaNaoOrdenada extends AbstracaoOrdem {

	private List<String> listagem = new ArrayList<>();
	
	public ListaNaoOrdenada(ImplementacaoLista lista) {
		super(lista);
	}

	@Override
	public void adicionar(String s) {
		listagem.add(s);
		
	}

	@Override
	public void imprimir() {
		for (String l : listagem) {
//			System.out.println(l);
			lista.imprimirItem(l);
		}
	}
	
}
