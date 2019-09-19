package controller;

import model.Inimigo;

public class PontuacaoController {

	public String batalha(Inimigo inimigo) {
		return "Ganhou " + inimigo.getPontosVitoria() + " pontos";
	}
}
