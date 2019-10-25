package model;

public class ImplXML implements PublicacaoPonte {

	public ImplXML() {}
	
	@Override
	public String criaPublicacao(String autor, String titulo, PublicacaoPonte ponte) {
		return "Publicacao XML criada " + autor + " titulo " + titulo;
		
	}
}
