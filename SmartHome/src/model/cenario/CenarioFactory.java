package model.cenario;

import observer.CenariosSubject;
import observer.TabelaObserver;

public class CenarioFactory {

	CenariosSubject cenariosSubject = new CenariosSubject();
	
	
	public CenarioFactory() {}

	public Cenario montarCenario(String nome, String tipo) {
		
		cenariosSubject.attach(new TabelaObserver(cenariosSubject));
		
		if (tipo.equalsIgnoreCase("simples")) {
			return cenariosSubject.setState(new CenarioSimples(nome, tipo)); 
		} else if (tipo.equalsIgnoreCase("especial")) {
			return cenariosSubject.setState( new CenarioEspecial(nome, tipo));
		} else {
			return null;
		}
	}
	

}
