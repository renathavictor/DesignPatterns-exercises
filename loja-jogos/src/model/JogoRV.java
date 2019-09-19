package model;

public class JogoRV extends JogoDigital {
    private String tipoCapacete;
    private String estereoscopia;

    @Override
    public float calcularTotal() {
        // preçoAluguel/quantidadePessoas + 20%
        return (float) (super.calcularTotal() * 1.20);
    }

	public JogoRV(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			String tipoCapacete, String estereoscopia) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		this.tipoCapacete = tipoCapacete;
		this.estereoscopia = estereoscopia;
	}

	public JogoRV(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			int anoCriacao, String produtora) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
		// TODO Auto-generated constructor stub
	}

	public JogoRV(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		// TODO Auto-generated constructor stub
	}

	public String getTipocapacete() {
		return tipoCapacete;
	}

	public void setTipocapacete(String tipocapacete) {
		this.tipoCapacete = tipocapacete;
	}

	public String getEstereoscopia() {
		return estereoscopia;
	}

	public void setEstereoscopia(String estereoscopia) {
		this.estereoscopia = estereoscopia;
	}

	@Override
	public String toString() {
		return "JogoRV [tipoCapacete=" + tipoCapacete + ", estereoscopia=" + estereoscopia + "]";
	}
    
    
}
