package factory.model;

public class FactoryUsuario {

	public FactoryUsuario() {}
	
	public Usuario getUsuario(String nome, String genero) {
		if (genero.equals("feminino")) 
			return new Feminino(nome, "feminino");
		else if (genero.equals("masculino"))
			return new Masculino(nome, "masculino");
		else if (genero.equals(""))
			return new Indeterminado(nome);
		else 
			return null;
	}

}
