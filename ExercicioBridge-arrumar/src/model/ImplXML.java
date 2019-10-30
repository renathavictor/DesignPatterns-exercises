package model;

public class ImplXML implements PublicacaoPonte {

	public ImplXML() {}
	
	@Override
	public String criaPublicacao(String autor, String titulo) {
		return "Publicacao XML criada " + autor + " titulo " + titulo;
		
	}
}
