package modelo;

public class AppEscritorioFabrica {
	
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
