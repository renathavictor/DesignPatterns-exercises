package observer;

import java.util.ArrayList;
import java.util.List;

import model.cenario.Cenario;

public class CenariosSubject {
	
	protected List<CenarioObserver> observers;
	protected Cenario cenario;
	
	public CenariosSubject() {
		observers = new ArrayList<CenarioObserver>();
	}
	
	public void attach(CenarioObserver observer) {
		observers.add(observer);
	}
	
	public void detach(int indice) {
		observers.remove(indice);
	}
	
	public Cenario setState(Cenario cenario) {
		this.cenario = cenario;
		notifyObservers();
		return cenario;
	}

	public void notifyObservers() {
		for (CenarioObserver observer : observers) {
			observer.update();
		}
	}
	
	public Cenario getState() {
		return cenario;
	}
}
