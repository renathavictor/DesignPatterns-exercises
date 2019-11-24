package model;

public class Arquivo extends Item {

	private String nomeArquivo;
	private Double tamanho;
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public Double getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public String toString() {
		return "Arquivo: {Nome Arquivo=" + nomeArquivo + ", tamanho=" + tamanho + "}";
	}
	
	
}
