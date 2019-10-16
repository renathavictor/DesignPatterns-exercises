package modelo;

import javax.xml.crypto.Data;

public abstract class AppEscritorio {
	
	protected String nome;
	protected String path;
	protected Data data;
	protected String propriet�rio;
	protected String email;
	private boolean copia;
		
	public AppEscritorio() { }
	
	public AppEscritorio(String nome, String path) {
		this.nome = nome;
		this.path = path;
	}

	public AppEscritorio(String nome, String path, Data data, String propriet�rio, String email, boolean copia) {
		this.nome = nome;
		this.path = path;
		this.data = data;
		this.propriet�rio = propriet�rio;
		this.email = email;
		this.copia = copia;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public String getPropriet�rio() {
		return propriet�rio;
	}

	public void setPropriet�rio(String propriet�rio) {
		this.propriet�rio = propriet�rio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isCopia() {
		return copia;
	}

	public void setCopia(boolean copia) {
		this.copia = copia;
	}

	@Override
	public String toString() {
		return "AppEscritorio [nome=" + nome + ", path=" + path + ", data=" + data + ", propriet�rio=" + propriet�rio
				+ ", email=" + email + ", copia=" + copia + "]";
	}

	public abstract AppEscritorio clonar() throws Exception;
	
}
