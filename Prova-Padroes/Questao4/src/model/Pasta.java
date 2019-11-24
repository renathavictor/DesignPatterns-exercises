package model;

import java.util.ArrayList;
import java.util.List;

public class Pasta extends Item {
	
	private String nomePasta;
	
	private List<Item> lista = new ArrayList<>();
	
	public void imprimir() {
		System.out.println(this.lista);
	}

	public String getNomePasta() {
		return nomePasta;
	}

	public void setNomePasta(String nomePasta) {
		this.nomePasta = nomePasta;
	}

	public List<Item> getLista() {
		return lista;
	}

	public void setLista(List<Item> lista) {
		this.lista = lista;
	}
	
	public void adicionarSistemaArquivo(Item sa) {
		System.out.println("Adicionado na pasta com sucesso.");
		lista.add(sa);
	}

	@Override
	public String toString() {
		return "Pasta: [Nome Pasta=" + nomePasta + " -> " + this.getLista() + "]";
	}
	
	
}
