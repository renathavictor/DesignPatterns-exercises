package observer;

public class TabelaObserver extends CenarioObserver {

	public TabelaObserver(CenariosSubject cenario) {
		super(cenario);
	}

	@Override
	public void update() {
		System.out.println(" Cenario: " + cenario.getState().getNome() + "\n Sobre: " + cenario.getState().sobreCenario() );
		
	}

	
}
