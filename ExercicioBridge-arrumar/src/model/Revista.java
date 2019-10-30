package model;

public class Revista extends Publicacao {
	
	private String titulo;
	
	private String autor;
	
	private String artigo;
	
	public Revista(PublicacaoPonte publicacao) {
		super(publicacao);
	}
	
	public Revista(String autor, String titulo, PublicacaoPonte publicacao) {
		super(publicacao);
		this.autor = autor;
		this.titulo = titulo;
	}
	
	public String criaPublicacao(String autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;
		
		return "Revista criada";
	}

	public String getArtigo() {
		return artigo;
	}

	public void setArtigo(String artigo) {
		this.artigo = artigo;
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
