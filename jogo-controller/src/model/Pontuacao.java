package model;

public class Pontuacao {

	private int pontuacaoTotal;
	
	
	public int getPontuacaoTotal() {
		return pontuacaoTotal;
	}



	public void setPontuacaoTotal(int pontuacaoTotal) {
		this.pontuacaoTotal = pontuacaoTotal;
	}



	public void vencedor(Inimigo v) {
		System.out.println("O vencedor foi: " + v + ". Ganhou " + v.getPontosVitoria() + " pontos.");
	}
	
}
