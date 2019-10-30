package view;

import model.ImplBD;
import model.Livro;
import model.Publicacao;
import model.PublicacaoPonte;

public class Teste {
		
	Publicacao livro = new Livro("autor 1", "livro 1", new ImplBD());
	
	public Publicacao getLivro() {
		return livro;
	}
	
}
