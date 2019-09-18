package factory.model;

public class Feminino extends Usuario {
	
	public Feminino(String nome, String genero) {
		super(nome, genero);
	}

	public String saudacao() {
		return "Bem-vinda Srª. " + super.getNome();
	}

	
}
