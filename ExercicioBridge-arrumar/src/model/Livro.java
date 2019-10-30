package model;

public class Livro extends Publicacao {
	
	private String titulo;
	
	private String autor;
	
	private String ISBN;

	public Livro(PublicacaoPonte publicacao) {
		super(publicacao);
	}
	
	public Livro(String autor, String titulo, PublicacaoPonte publicacao) {
		super(publicacao);
		this.autor = autor;
		this.titulo = titulo;
	}
	
	public String criaPublicacao(String autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;
		
		return "livro criado";
	}
		
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
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
