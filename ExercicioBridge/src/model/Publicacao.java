package model;

public abstract class Publicacao {
	
	private PublicacaoPonte publicacao;
	
	private String titulo;
	
	private String autor;
	
	public Publicacao(PublicacaoPonte publicacao) {
		publicacao = publicacao;
	}

	public PublicacaoPonte getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(PublicacaoPonte publicacao) {
		this.publicacao = publicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
}
