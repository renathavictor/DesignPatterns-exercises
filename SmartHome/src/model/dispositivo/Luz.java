package model.dispositivo;

public class Luz extends Dispositivo {

	public Luz() {
		dispositivo = "Luz";
	}

	public String sobreLuz() {
		return super.getIsAtivo() ? " A luz est� ligada." : " A luz est� desligada.";
	}
	
}
