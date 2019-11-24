package model;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements SistemaArquivo {

	private String nome;
	List<SistemaArquivo> lista = new ArrayList<>();

	public Pasta(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<SistemaArquivo> getLista() {
		return lista;
	}

	public void setLista(List<SistemaArquivo> lista) {
		this.lista = lista;
	}
	
	public void adicionarSistemaArquivo(SistemaArquivo sa) {
		System.out.println("Adicionado na pasta com sucesso.");
		lista.add(sa);
	}

	@Override
	public void imprimir() {
		System.out.println("----Pasta----");
		System.out.println(this.nome);
		for (SistemaArquivo sa : lista) {
			sa.imprimir();
		}
		System.out.println("-------------");
		
	}
	
	
}
