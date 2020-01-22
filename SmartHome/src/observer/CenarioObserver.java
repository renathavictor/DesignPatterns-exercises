package observer;

public abstract class CenarioObserver {

	protected CenariosSubject cenario;
	
	public CenarioObserver(CenariosSubject cenario) {
		this.cenario = cenario;
	}
	
	public abstract void update();

}
