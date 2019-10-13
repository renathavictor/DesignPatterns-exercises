package modelo;

public class EditorPlanilhaFabrica extends AppEscritorioFabrica {

	@Override
	public AppEscritorio criarApp() {
		return new EditorPlanilha();
	}

	
}
