package model;

public class Livro extends Publicacao {

	public Livro(PublicacaoPonte publicacao) {
		super(publicacao);
	}

	private String ISBN;
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

}
