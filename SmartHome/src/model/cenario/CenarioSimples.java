package model.cenario;

import model.dispositivo.Dispositivo;

public class CenarioSimples extends Cenario implements CenarioState {

	public CenarioSimples(String nome, String tipo) {
		super(nome, tipo);
		System.out.println("Cenário simples criado com sucesso!");
	}
	
	public String sobreCenario() {
		String dispositivos = "";
		for (Dispositivo d : super.getDispositivos()) {
			dispositivos += d.imprimir();
		}
		return "O cenário é do tipo simples e está " + (super.getIsAtivo() ? "ativado." : "desativado.") + (dispositivos != "" ? "\n Tem os dispositivos: " + dispositivos : "");
	}

	@Override
	public CenarioState ligarDispositivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CenarioState desligarDispositivos() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
