package model.dispositivo;

public class CorAmarelaDecorator extends DipositivoDecorator {

	public CorAmarelaDecorator(Dispositivo dispositivo) {
		super(dispositivo);
	}
	
	public String sobreDispositivo() {
		return dispositivo.sobreDispositivo() + " está com a cor roxa.";
	}
	
	public String imprimir() {
		return dispositivo.getDispositivo() + " amarela.";
	}

}
