package model.dispositivo;

public class CorRoxaDecorator extends DipositivoDecorator {

	public CorRoxaDecorator(Dispositivo dispositivo) {
		super(dispositivo);
	}
	
	public String sobreDispositivo() {
		return dispositivo.sobreDispositivo() + " está com a cor amarela.";
	}

	public String imprimir() {
		return dispositivo.getDispositivo() + " roxa";
	}
}
