package model;

import java.util.ArrayList;
import java.util.List;

public class TabelaComposite implements Tabela {
	
	private List<Tabela> linhas = new ArrayList<Tabela>();
	
	public void adicionar(Tabela l) {
		linhas.add(l);
	}
	
	@Override
	public void imprimir() {
		System.out.println(" Tabela ");
		for (Tabela t : linhas) {
			t.imprimir();
		}
	}

}
