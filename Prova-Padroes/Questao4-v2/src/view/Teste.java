package view;

import model.Arquivo;
import model.Pasta;
import model.SistemaArquivoComposite;

public class Teste {

	public static void main(String[] args) {
		
		SistemaArquivoComposite composite = new SistemaArquivoComposite();
		
		Arquivo arq1 = new Arquivo("Padroes de projeto", 50.0);
		Arquivo arq2 = new Arquivo("Pweb II", 60.0);
		Arquivo arq3 = new Arquivo("Gerencia", 70.0);
		Arquivo arq4 = new Arquivo("Pweb I", 80.0);
		Arquivo arq5 = new Arquivo("Teste", 90.0);
		
		Pasta pasta1 = new Pasta("IFPB");
		Pasta pasta2 = new Pasta("Outras");
		
		composite.adicionar(pasta1);
		pasta1.adicionarSistemaArquivo(arq1);
		pasta1.adicionarSistemaArquivo(arq2);
		pasta1.adicionarSistemaArquivo(arq3);
		
		pasta2.adicionarSistemaArquivo(arq4);

		pasta1.adicionarSistemaArquivo(pasta2);
		
		composite.adicionar(arq5);
		composite.imprimir();
	}

}
