package modelo;

public class EditorTexto extends AppEscritorio {

	public EditorTexto(EditorTexto editorTexto) {}
	
	public EditorTexto() {}

	@Override
	public String exibirInfo() {
		return "Editor de Texto";
	}
	
	@Override
	public AppEscritorio clonar() {
		return new EditorTexto(this);
	}

}
