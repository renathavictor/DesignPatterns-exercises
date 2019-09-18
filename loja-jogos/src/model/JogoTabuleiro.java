package model;

import java.util.List;

public class JogoTabuleiro extends Jogo {

    private String estilo;
    private List<String> adereco;

    @Override
    public float calcularTotal() {
        // precoAluguel/quantidadePessoas - 10%
        return (float) (super.getPrecoAluguel()/super.getQuantidadePessoas() * 0.90);
    }

	public JogoTabuleiro(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		// TODO Auto-generated constructor stub
	}

	public JogoTabuleiro(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			String estilo, List<String> adereco) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		this.estilo = estilo;
		this.adereco = adereco;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public List<String> getAdereco() {
		return adereco;
	}

	public void setAdereco(List<String> adereco) {
		this.adereco = adereco;
	}

	@Override
	public String toString() {
		return "JogoTabuleiro [estilo=" + estilo + ", adereco=" + adereco + "]";
	}

    
}
