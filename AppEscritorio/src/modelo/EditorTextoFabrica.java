package modelo;

public class EditorTextoFabrica extends AppEscritorioFabrica {

	@Override
	public AppEscritorio criarApp() {
		return new EditorTexto();
	}
	
	

}
