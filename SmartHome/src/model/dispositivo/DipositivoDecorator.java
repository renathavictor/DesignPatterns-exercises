package model.dispositivo;

public class DipositivoDecorator extends Dispositivo {

	Dispositivo dispositivo;
	
	public DipositivoDecorator(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public String sobreDispositivo() {
		return dispositivo.sobreDispositivo();
	}
	
	public String imprimir() {
		return dispositivo.getDispositivo();
	}

}
