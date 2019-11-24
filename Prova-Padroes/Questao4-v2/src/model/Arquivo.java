package model;

public class Arquivo implements SistemaArquivo {

	private String nome;
	private Double tamanho;
	
	public Arquivo(String nome, Double tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getTamanho() {
		return tamanho;
	}

	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public void imprimir() {
		System.out.println("\t---Arquivo---");
		System.out.println("\tnome: " + this.nome);
		System.out.println("\ttamanho: " + this.tamanho);
		System.out.println("\t-------------");
	}

	public void adicionarSistemaArquivo(SistemaArquivo sa) {}
	
}
