package model;

public class Jogo3D extends JogoDigital {

    private String console;
    private int tipoControle;

	public Jogo3D(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			int anoCriacao, String produtora) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
		// TODO Auto-generated constructor stub
	}

	public Jogo3D(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		// TODO Auto-generated constructor stub
	}

	public Jogo3D(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			String console, int tipoControle) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		this.console = console;
		this.tipoControle = tipoControle;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getTipoControle() {
		return tipoControle;
	}

	public void setTipoControle(int tipoControle) {
		this.tipoControle = tipoControle;
	}

	@Override
	public String toString() {
		return "Jogo3D [console=" + console + ", tipoControle=" + tipoControle + "]";
	}
        
}
