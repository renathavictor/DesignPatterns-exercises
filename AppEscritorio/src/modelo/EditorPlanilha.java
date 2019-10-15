package modelo;

public class EditorPlanilha extends AppEscritorio {

	public EditorPlanilha(EditorPlanilha editorPlanilha) {}
		
	public EditorPlanilha() {}

	@Override
	public String exibirInfo() {
		return "Editor Planilha";
	}
	
	@Override
	public AppEscritorio clonar() {
		return new EditorPlanilha(this);
	}
}
