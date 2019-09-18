package model;

public class JogoRA extends JogoDigital {
    private String dispositivo;
    private String marcador;
    
	public String getDispositivo() {
		return dispositivo;
	}
	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}
	public String getMarcador() {
		return marcador;
	}
	public void setMarcador(String marcador) {
		this.marcador = marcador;
	}
	
	public JogoRA(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			String dispositivo, String marcador) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		this.dispositivo = dispositivo;
		this.marcador = marcador;
	}
	public JogoRA(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			int anoCriacao, String produtora) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
		// TODO Auto-generated constructor stub
	}
	public JogoRA(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "JogoRA [dispositivo=" + dispositivo + ", marcador=" + marcador + "]";
	}
    
	
    
}
