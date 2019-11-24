package model;

import java.util.Set;
import java.util.TreeSet;

public class ListaOrdenada extends AbstracaoOrdem {

	private Set<String> listagem = new TreeSet<String>();
	
	public ListaOrdenada(ImplementacaoLista lista) {
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
