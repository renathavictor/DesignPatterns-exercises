package model;

public abstract class AbstracaoOrdem {

	protected ImplementacaoLista lista;
	
	public AbstracaoOrdem(ImplementacaoLista lista) {
		this.lista = lista;
	}
	
	public abstract void adicionar(String s);
	
	public abstract void imprimir();
	
}
