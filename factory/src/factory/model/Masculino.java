package factory.model;

public class Masculino extends Usuario {
	
	public Masculino() {
		super();
	}

	public Masculino(String nome, String genero) {
		super(nome, genero);
	}
	
	public String saudacao() {
		return "Bem-vindo Sr. " + super.getNome();
	}

	
}