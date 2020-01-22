package model.cenario;

import model.dispositivo.Dispositivo;

public class CenarioEspecial extends Cenario {

	public CenarioEspecial(String nome, String tipo) {
		super(nome, tipo);
		System.out.println("Cen�rio especial criado com sucesso!");
	}
	
	public String sobreCenario() {
		String dispositivos = "";
		for (Dispositivo d : super.getDispositivos()) {
			dispositivos += d.imprimir();
		}
		return "O cen�rio � do tipo especial e est� " + (super.getIsAtivo() ? "ativado." : "desativado") + (dispositivos != ""  ? "\n Tem os dispositivos: " + dispositivos : "");
	}
	
}
