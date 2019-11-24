package model;

import java.util.ArrayList;
import java.util.List;

public class Item {
	
	public Item() {}
		
	List<Item> lista = new ArrayList<>();
	
	public void adicionarSistemaArquivo(Item sa) {
		System.out.println("Adicionado com sucesso.");
		lista.add(sa);
	}
	
	public void imprimir() {
//		System.out.println(this.lista);
		String resultado = "";
		for (Item l : lista) {
			resultado += l + " |\n";
		}
		System.out.println(resultado);
	}	
}
