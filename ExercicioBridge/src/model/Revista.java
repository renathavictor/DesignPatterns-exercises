package model;

public class Revista extends Publicacao {

	private String artigo;
	
	public Revista(PublicacaoPonte publicacao) {
		super(publicacao);
	}

	public String getArtigo() {
		return artigo;
	}

	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}

}
