package modelo;

public class EditorTexto extends AppEscritorio {

	public EditorTexto(EditorTexto editorTexto) {
		this.nome = editorTexto.getNome();
		this.path = editorTexto.getPath();
		this.data = editorTexto.getData();
		this.proprietário = editorTexto.getProprietário();
		this.email = editorTexto.getEmail();
	}
	
	public EditorTexto() {
		System.out.println("Editor de texto criado");
	}
	
	@Override
	public AppEscritorio clonar() {
		return new EditorTexto(this);
	}

}
