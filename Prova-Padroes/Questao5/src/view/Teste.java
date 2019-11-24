package view;

import model.Celula;
import model.Linha;
import model.TabelaComposite;

public class Teste {
	
	public static void main(String[] args) {

		TabelaComposite composite = new TabelaComposite();
		
		Celula cel1 = new Celula("Teste 1");
		Celula cel2 = new Celula("Teste 2");
		Celula cel3 = new Celula("Teste 3");
		Celula cel4 = new Celula("Teste 4");

		Linha linha1 = new Linha();
		linha1.adicionar(cel1);
		linha1.adicionar(cel2);
		
		Linha linha2 = new Linha();
		linha2.adicionar(cel3);
		linha2.adicionar(cel4);

		composite.adicionar(linha1);
		composite.adicionar(linha2);
		
		composite.imprimir();

	}
}
