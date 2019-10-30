package model;

public class ImplBD implements PublicacaoPonte {

	public ImplBD() {}
	
	@Override
	public String criaPublicacao(String autor, String titulo) {
		return "Publicacao BD criada " + autor + " titulo " + titulo;
		
	}
}
