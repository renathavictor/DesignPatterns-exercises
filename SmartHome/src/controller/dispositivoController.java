package controller;

import java.util.ArrayList;
import java.util.List;

import model.cenario.Cenario;
import model.cenario.CenarioFactory;
import model.dispositivo.Dispositivo;
import model.dispositivo.Luz;

public class dispositivoController {
	
	List<Dispositivo> dispositivos = new ArrayList<Dispositivo>();
	
	Dispositivo dispositivo;
	
	public void novoDispositivo(String cor) {
//		luz.montarCenario("Basico", "simples");

	}
	
	public List<Dispositivo> getAllDispositivo() {
		return dispositivos;
	}

}
