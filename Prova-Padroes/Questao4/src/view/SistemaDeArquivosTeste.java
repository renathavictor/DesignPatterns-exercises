package view;

import model.Arquivo;
import model.Pasta;
import model.Item;

public class SistemaDeArquivosTeste {
	
	public static void main(String[] args) {
		
		Item sistema = new Item();
		
		Pasta pasta = new Pasta();
		pasta.setNomePasta("IFPB");
		sistema.adicionarSistemaArquivo(pasta);
		
		Arquivo doc1 = new Arquivo();
		doc1.setNomeArquivo("Padroes de Projeto");
		doc1.setTamanho(50.0);
		pasta.adicionarSistemaArquivo(doc1);
		
		Arquivo doc2 = new Arquivo();
		doc2.setNomeArquivo("PWEB 2");
		doc2.setTamanho(100.0);
		pasta.adicionarSistemaArquivo(doc2);		
		
		Arquivo doc3 = new Arquivo();
		doc3.setNomeArquivo("PWEB 1");
		doc3.setTamanho(120.0);
		sistema.adicionarSistemaArquivo(doc3);
		
		Pasta pasta2 = new Pasta();
		pasta2.setNomePasta("Outros");
//		sistema.adicionarSistemaArquivo(pasta2);
		
		Arquivo doc4 = new Arquivo();
		doc4.setNomeArquivo("Teste");
		doc4.setTamanho(58.0);
		pasta2.adicionarSistemaArquivo(doc4);
		pasta.adicionarSistemaArquivo(pasta2);
		
		sistema.imprimir();
		
	}
}
