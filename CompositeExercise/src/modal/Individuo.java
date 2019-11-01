package modal;

public class Individuo extends Participante {

	private String assento;
	
	private String name;
		
	public Individuo() {
		super();
	}

	public Individuo(String name) {
		super();
		this.name = name;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
