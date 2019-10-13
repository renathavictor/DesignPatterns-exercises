package modelo;

public abstract class AppEscritorioFabrica {

	AppEscritorio criarApp() {
		return null;
	}
	
	public AppEscritorio getAppEscritorio(String nome) {
		switch (nome) {
		case "texto":
			return new EditorTexto();
		case "planilha":
			return new EditorPlanilha();
		case "apresentacao":
			return new EditorApresentacao();
		default:
			return null;
		}
	}
}
