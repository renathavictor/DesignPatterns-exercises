package model.dispositivo;

public class Luz extends Dispositivo {

	public Luz() {
		dispositivo = "Luz";
	}

	public String sobreLuz() {
		return super.getIsAtivo() ? " A luz está ligada." : " A luz está desligada.";
	}
	
}
