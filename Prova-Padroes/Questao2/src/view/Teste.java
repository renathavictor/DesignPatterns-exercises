package view;

import model.AbstracaoTamanho;
import model.CocaCola;
import model.Fanta;
import model.Guarana;
import model.Sprite;
import model.TamanhoFamilia;
import model.TamanhoGrande;
import model.TamanhoMedio;
import model.TamanhoPequeno;

public class Teste {

	public static void main(String[] args) {
		
		AbstracaoTamanho tamanho = new TamanhoFamilia(new CocaCola());
		tamanho.beber();
		
		tamanho = new TamanhoGrande(new Sprite());
		tamanho.beber();
		
		tamanho = new TamanhoMedio(new CocaCola());
		tamanho.beber();	
		
		tamanho = new TamanhoMedio(new Fanta());
		tamanho.beber();
		
		tamanho = new TamanhoPequeno(new Guarana());
		tamanho.beber();
	}

}
