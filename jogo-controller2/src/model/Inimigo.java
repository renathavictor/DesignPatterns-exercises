package model;

public class Inimigo {

	private int pontosVitoria;
	private int inteligencia;
	private int forca;
	private int estrategia;
	
	
	public Inimigo() {}
	
	public Inimigo(int p, int inteligencia, int forca, int estrategia) {
		this.pontosVitoria = p;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.estrategia = estrategia;
	}
		

	public int getPontosVitoria() {
		return pontosVitoria;
	}

	public void setPontosVitoria(int pontosVitoria) {
		this.pontosVitoria = pontosVitoria;
	}

	public int getInteligencia() {
		return inteligencia;
	}
	
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	public int getForca() {
		return forca;
	}
	
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public int getEstrategia() {
		return estrategia;
	}
	
	public void setEstrategia(int estrategia) {
		this.estrategia = estrategia;
	}
	
	
}
