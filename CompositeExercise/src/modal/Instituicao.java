package modal;

import java.util.ArrayList;
import java.util.List;

public class Instituicao extends Participante {
	
	private String name;
		
	private List<Participante> membros = new ArrayList<Participante>();
	
	public Instituicao() {
		super();
	}

	public Instituicao(String name) {
		super();
		this.name = name;
	}

	
	public List<Participante> getMembros() {
		return membros;
	}

	public void addMembros(Participante membro) {
		this.membros.add(membro);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
		

}
