package modelo;

public class EditorApresentacao extends AppEscritorio {

	public EditorApresentacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EditorApresentacao(EditorApresentacao editorApresentacao) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String exibirInfo() {
		return "Editor de Apresentação";
	}
	
	@Override
	public AppEscritorio clonar() {
		return new EditorApresentacao(this);
	}

}
