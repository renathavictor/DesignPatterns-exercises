package model.cenario;

import model.dispositivo.Dispositivo;

public class CenarioEspecial extends Cenario {

	public CenarioEspecial(String nome, String tipo) {
		super(nome, tipo);
		System.out.println("Cenário especial criado com sucesso!");
	}
	
	public String sobreCenario() {
		String dispositivos = "";
		for (Dispositivo d : super.getDispositivos()) {
			dispositivos += d.imprimir();
		}
		return "O cenário é do tipo especial e está " + (super.getIsAtivo() ? "ativado." : "desativado") + (dispositivos != ""  ? "\n Tem os dispositivos: " + dispositivos : "");
	}
	
}
