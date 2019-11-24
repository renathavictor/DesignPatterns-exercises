package model;

import java.util.ArrayList;
import java.util.List;

public class SistemaArquivoComposite implements SistemaArquivo {

	List<SistemaArquivo> lista = new ArrayList<SistemaArquivo>();
	
	public void adicionar(SistemaArquivo sa) {
		lista.add(sa);
	}
	
	@Override
	public void imprimir() {
		System.out.println("Sistema de arquivos ");
		for (SistemaArquivo sa : lista) {
			sa.imprimir();
		}
	}

	public void adicionarSistemaArquivo(SistemaArquivo sa) {
		System.out.println("Adicionado na pasta com sucesso.");
		lista.add(sa);
	}	
}
