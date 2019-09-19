package view;

import controller.PontuacaoController;
import model.Espiao;
import model.Exercito;
import model.Guerrilheiro;
import model.Inimigo;

public class Main {

	public static void main(String[] args) {

		Inimigo espiao = new Espiao(200, 10, 7, 10);
		
		Inimigo guerrilheiro = new Guerrilheiro(100, 5, 8, 8);
		
		Inimigo exercito = new Exercito(50, 2, 7, 10);
		
		PontuacaoController controller = new PontuacaoController();
		
		System.out.println(controller.batalha(espiao));
		

	}

}
