package factory.model;

public class Indeterminado extends Usuario {

	public Indeterminado(String nome) {
		super(nome, "");
	}
	
	public String saudacao() {
		return "Bem-vindo " + super.getNome();
	}

	
}
