package modelo;

public class EditorApresentacaoFabrica extends AppEscritorioFabrica {

	@Override
	public AppEscritorio criarApp() {
		return new EditorApresentacao();
	}

}
