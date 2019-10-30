package model;

public abstract class Publicacao {
	
	private PublicacaoPonte publicacao;
	
	public Publicacao(PublicacaoPonte publicacao) {
		publicacao = publicacao;
	}
	
	public abstract String criaPublicacao(String autor, String titulo);

	public PublicacaoPonte getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(PublicacaoPonte publicacao) {
		this.publicacao = publicacao;
	}

	
}
