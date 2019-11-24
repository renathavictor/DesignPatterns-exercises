package model;

public class Celula implements Tabela {
	
	private String conteudo;
	
	public Celula(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public void imprimir() {
		conteudo = conteudo + " ";
//		conteudo = conteudo.substring(0, 15);
		System.out.print(" | " + conteudo);
	}

	public void adicionar(Tabela l) {
		// TODO Auto-generated method stub
		
	}

}
