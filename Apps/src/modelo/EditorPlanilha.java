package modelo;

public class EditorPlanilha extends AppEscritorio {

	public EditorPlanilha(EditorPlanilha editorPlanilha) {
		this.nome = editorPlanilha.getNome();
		this.path = editorPlanilha.getPath();
		this.data = editorPlanilha.getData();
		this.proprietário = editorPlanilha.getProprietário();
		this.email = editorPlanilha.getEmail();
	}
	
	public EditorPlanilha() {
		System.out.println("Editor de planilha criado");
	}

	@Override
	public AppEscritorio clonar() throws Exception {
		if (this.isCopia())
			return new EditorPlanilha(this);
		throw new Exception("Arquivo não pode ser copiado");

		//return this.isCopia() ? new EditorPlanilha(this) : new EditorPlanilha();
	}

}
