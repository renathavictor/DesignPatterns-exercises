package controller;

import java.util.ArrayList;
import java.util.List;

import model.cenario.Cenario;
import model.cenario.CenarioFactory;

public class cenarioController {
	
	List<Cenario> cenarios = new ArrayList<Cenario>();
	
	CenarioFactory fabrica = new CenarioFactory();
	
	public void criarCenario(String nome, String tipo) {
		fabrica.montarCenario("Basico", "simples");

	}
	
	public List<Cenario> getAllCenario() {
		return cenarios;
	}

}
