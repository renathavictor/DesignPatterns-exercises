package model.dispositivo;

public abstract class Dispositivo {

	String dispositivo;
	private Boolean isAtivo = false;
		
	public Dispositivo() {}
	
	public Dispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public Dispositivo(String dispositivo, Boolean isAtivo) {
		this.dispositivo = dispositivo;
		this.isAtivo = isAtivo;
	}
	
	public String getDispositivo() {
		return dispositivo;
	}
	
	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public Boolean getIsAtivo() {
		return isAtivo;
	}
	
	public void setIsAtivo(Boolean isAtivo) {
		this.isAtivo = isAtivo;
	}

	public String sobreDispositivo() {
		return dispositivo;
	}
	
	public String imprimir() {
		return dispositivo;
	}
	
}
