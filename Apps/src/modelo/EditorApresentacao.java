package modelo;

public class EditorApresentacao extends AppEscritorio {

	public EditorApresentacao(EditorApresentacao editorApresentacao) {	
		this.nome = editorApresentacao.getNome();
		this.path = editorApresentacao.getPath();
		this.data = editorApresentacao.getData();
		this.proprietário = editorApresentacao.getProprietário();
		this.email = editorApresentacao.getEmail();
	}

	public EditorApresentacao() {
		System.out.println("Editor de apresentacao criado");
	}
	
	@Override
	public AppEscritorio clonar() throws Exception {
		if (this.isCopia())
			new EditorApresentacao(this);
		throw new Exception("Arquivo não pode ser copiado");

		//return this.isCopia() ? new EditorApresentacao(this) : new EditorApresentacao();
	}

}
